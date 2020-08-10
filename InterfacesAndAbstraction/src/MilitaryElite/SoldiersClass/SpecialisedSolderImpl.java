package MilitaryElite.SoldiersClass;

import MilitaryElite.SoldiersClass.Persons.PrivateImpl;

public abstract class SpecialisedSolderImpl extends PrivateImpl {
    private String corps;

    protected SpecialisedSolderImpl(int id, String firstName, String lastName,double salary, String corps) {
        super(id, firstName, lastName , salary);
        this.corps = corps;
    }

    public String getCorps() {
        return this.corps;
    }

}
