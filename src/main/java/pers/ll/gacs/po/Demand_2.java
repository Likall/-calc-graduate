package pers.ll.gacs.po;

public class Demand_2 {
    private String demand2Id;

    private String name;

    private String demand1Id;

    public String getDemand2Id() {
        return demand2Id;
    }

    public void setDemand2Id(String demand2Id) {
        this.demand2Id = demand2Id == null ? null : demand2Id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDemand1Id() {
        return demand1Id;
    }

    public void setDemand1Id(String demand1Id) {
        this.demand1Id = demand1Id == null ? null : demand1Id.trim();
    }
}