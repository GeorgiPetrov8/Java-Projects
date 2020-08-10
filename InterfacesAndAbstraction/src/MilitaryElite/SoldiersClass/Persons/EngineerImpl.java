package MilitaryElite.SoldiersClass.Persons;

import MilitaryElite.SoldiersClass.Repair;
import MilitaryElite.SoldiersClass.SpecialisedSolderImpl;

import java.util.LinkedHashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSolderImpl {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName,
                        double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    public Set<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f%nCorps: %s%n",
                this.getFirstName(),this.getLastName(),this.getId(),this.getSalary(),
                this.getCorps()));
        builder.append("Repairs:");
        if (!this.getRepairs().isEmpty()) {
            for (Repair repair : this.getRepairs()) {
                builder.append(System.lineSeparator()).append("  ").append(repair);
            }
        }
        return builder.toString();
    }
}
