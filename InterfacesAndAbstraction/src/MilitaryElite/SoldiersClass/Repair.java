package MilitaryElite.SoldiersClass;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
       return String.format("Part Name: %s Hours Worked: %s",
                this.partName,this.hoursWorked);
    }
}