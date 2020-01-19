package pers.ll.gacs.po;

public class Student_course {
    private Double courseGrade;

    private String stuId;

    private String courseId;

    public Double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Double courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }
}