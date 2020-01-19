package pers.ll.gacs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import pers.ll.gacs.common.Const;
import pers.ll.gacs.common.Result;
import pers.ll.gacs.po.User;
import pers.ll.gacs.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;
//    @Autowired
//    StudentService studentService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        request.setAttribute("test", "test");
        return "test";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        List<User> userList;
        userList = userService.getUsers();
        return userList;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user) {
        Result result = new Result();
        if (ObjectUtils.isEmpty(user)) {
            return Result.fail_401("参数不能为空");
        }
        if (ObjectUtils.isEmpty(user.getAccount())) {
            return Result.fail_401("用户名不能为空");
        }
        if (ObjectUtils.isEmpty(user.getUserPassword())) {
            return Result.fail_401("密码不能为空");
        }
        if (!userService.existUser(user.getAccount())) {
            return Result.fail_401("用户不存在");
        }
        user = userService.login(user.getUserName(), user.getUserPassword());
        if (!ObjectUtils.isEmpty(user)) {
            result.setCode(Const.HttpStatusCode.HttpStatus_200);
            result.setMsg("登录成功");
            result.setData(user);
            return result;
        } else {
            return Result.fail_401("密码错误");
        }

    }

//    @RequestMapping(value = "/stu", method = RequestMethod.GET)
//    public List<Student> stuList() {
//        return studentService.getStus();
//    }
}
