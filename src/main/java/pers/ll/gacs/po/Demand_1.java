package pers.ll.gacs.po;

public class Demand_1 {
    private String demand1Id;

    private String name;

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
}