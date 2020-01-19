package pers.ll.gacs.po;

public class Demand_grade {
    private String demandGradeId;

    private Double demandGrade;

    private Double demandTotalGrade;

    private String demandId2;

    public String getDemandGradeId() {
        return demandGradeId;
    }

    public void setDemandGradeId(String demandGradeId) {
        this.demandGradeId = demandGradeId == null ? null : demandGradeId.trim();
    }

    public Double getDemandGrade() {
        return demandGrade;
    }

    public void setDemandGrade(Double demandGrade) {
        this.demandGrade = demandGrade;
    }

    public Double getDemandTotalGrade() {
        return demandTotalGrade;
    }

    public void setDemandTotalGrade(Double demandTotalGrade) {
        this.demandTotalGrade = demandTotalGrade;
    }

    public String getDemandId2() {
        return demandId2;
    }

    public void setDemandId2(String demandId2) {
        this.demandId2 = demandId2 == null ? null : demandId2.trim();
    }
}