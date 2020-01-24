package pers.ll.gacs.po;

public class Course {
    private String courseId;

    private String courseName;

    private String courseCredit;

    private String courseTerm;

    private Double courseAverage;

    private String courseTotalGrade;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit == null ? null : courseCredit.trim();
    }

    public String getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(String courseTerm) {
        this.courseTerm = courseTerm == null ? null : courseTerm.trim();
    }

    public Double getCourseAverage() {
        return courseAverage;
    }

    public void setCourseAverage(Double courseAverage) {
        this.courseAverage = courseAverage;
    }

    public String getCourseTotalGrade() {
        return courseTotalGrade;
    }

    public void setCourseTotalGrade(String courseTotalGrade) {
        this.courseTotalGrade = courseTotalGrade == null ? null : courseTotalGrade.trim();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCredit='" + courseCredit + '\'' +
                ", courseTerm='" + courseTerm + '\'' +
                ", courseAverage=" + courseAverage +
                ", courseTotalGrade='" + courseTotalGrade + '\'' +
                '}';
    }
}