package pers.ll.gacs.po;

public class Weight {
    private String weightId;

    private String weight;

    private String courseId;

    private String demand2Id;

    public String getWeightId() {
        return weightId;
    }

    public void setWeightId(String weightId) {
        this.weightId = weightId == null ? null : weightId.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getDemand2Id() {
        return demand2Id;
    }

    public void setDemand2Id(String demand2Id) {
        this.demand2Id = demand2Id == null ? null : demand2Id.trim();
    }
}