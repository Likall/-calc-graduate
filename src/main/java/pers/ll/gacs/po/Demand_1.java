package pers.ll.gacs.po;

import lombok.Data;

import java.util.List;

public class Demand_1 {

    private String demand1Id;

    private String name;

    private String evalResult;

    private List<Demand_2> demand2List;

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

    public List<Demand_2> getDemand2List() {
        return demand2List;
    }

    public void setDemand2List(List<Demand_2> demand2List) {
        this.demand2List = demand2List;
    }
}