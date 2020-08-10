package MilitaryElite.SoldiersClass.Persons;

import MilitaryElite.SoldiersClass.Mission;
import MilitaryElite.SoldiersClass.SpecialisedSolderImpl;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImp extends SpecialisedSolderImpl {
    private Set<Mission> missions;

    public CommandoImp(int id, String firstName, String lastName,
                       double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Mission mission) {
        this.getMissions().add(mission);
    }

    public Set<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f%nCorps: %s%n",
                this.getFirstName(), this.getLastName(), this.getId(), this.getSalary(), this.getCorps()));
        builder.append("Missions:");
        if (!this.getMissions().isEmpty()) {
            for (Mission mission : this.getMissions()) {
                if (mission.getState().equals("inProgress")) {
                    builder.append(System.lineSeparator()).append("  ").append(mission);
                }
            }
        }
        return builder.toString();
    }

}
