package pers.ll.gacs.controller;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowCredentials="true")
@RestController
@Transactional
public abstract class BaseController {

    protected Logger logger = Logger.getLogger(this.getClass().getName());

    @RequestMapping("/")
    public String main() {
        return "Hello World";
    }

}
