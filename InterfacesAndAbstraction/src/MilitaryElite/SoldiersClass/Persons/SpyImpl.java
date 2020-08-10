package MilitaryElite.SoldiersClass.Persons;

import MilitaryElite.SoldiersClass.SoldierImpl;

public class SpyImpl extends SoldierImpl {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
       return String.format("Name: %s %s Id: %d%nCode Number: 00%d",
                this.getFirstName(),this.getLastName(),this.getId(),this.codeNumber);
    }
}
