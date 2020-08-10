package MilitaryElite.SoldiersClass.Persons;

import MilitaryElite.Interfaces.LieutenantGeneral;

import java.util.LinkedHashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new LinkedHashSet<>();
    }

    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public Set<PrivateImpl> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f%n",
                this.getFirstName(),this.getLastName(),this.getId(),this.getSalary()));
        builder.append("Privates:");
        if(!this.getPrivates().isEmpty()) {
            builder.append(System.lineSeparator());
            this.privates.stream().sorted((e1,e2) -> Integer.compare(e2.getId(),e1.getId()))
                    .forEach(e -> builder.append("  ").append(e).append(System.lineSeparator()));
        }
        return builder.toString();
    }
}
