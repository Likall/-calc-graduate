package pers.ll.gacs.po;

public class Demand_1 {
    private String demand1Id;

    private String name;

    private String evalResult;

    public String getDemand1Id() {
        return demand1Id;
    }

    public void setDemand1Id(String demand1Id) {
        this.demand1Id = demand1Id == null ? null : demand1Id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEvalResult() {
        return evalResult;
    }

    public void setEvalResult(String evalResult) {
        this.evalResult = evalResult == null ? null : evalResult.trim();
    }
}