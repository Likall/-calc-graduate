package pers.ll.gacs.po;

public class Student {
    private String stuId;

    private String stuName;

    private Integer stuRank;

    private String stuLevel;

    private String stuMale;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuRank() {
        return stuRank;
    }

    public void setStuRank(Integer stuRank) {
        this.stuRank = stuRank;
    }

    public String getStuLevel() {
        return stuLevel;
    }

    public void setStuLevel(String stuLevel) {
        this.stuLevel = stuLevel == null ? null : stuLevel.trim();
    }

    public String getStuMale() {
        return stuMale;
    }

    public void setStuMale(String stuMale) {
        this.stuMale = stuMale == null ? null : stuMale.trim();
    }
}