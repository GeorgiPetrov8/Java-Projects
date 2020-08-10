package MilitaryElite;

import MilitaryElite.SoldiersClass.Mission;
import MilitaryElite.SoldiersClass.Persons.CommandoImp;
import MilitaryElite.SoldiersClass.Persons.EngineerImpl;
import MilitaryElite.SoldiersClass.Persons.LieutenantGeneralImpl;
import MilitaryElite.SoldiersClass.Persons.SpyImpl;
import MilitaryElite.SoldiersClass.Persons.PrivateImpl;
import MilitaryElite.SoldiersClass.Repair;
import MilitaryElite.SoldiersClass.SoldierImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<SoldierImpl> allSoldiers = new ArrayList<>();

        Set<PrivateImpl> privates = new LinkedHashSet<>();

        String line;
        while (!(line = scan.nextLine()).equals("End")) {
            String[] tokens = line.split("\\s+");
            switch (tokens[0]) {
                case "Private": {
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    PrivateImpl privateImp = new PrivateImpl(id, firstName, lastName, salary);
                    privates.add(privateImp);
                    allSoldiers.add(privateImp);
                    break;
                }
                case "LeutenantGeneral": {
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                    for (PrivateImpl priv : privates) {
                        lieutenantGeneral.addPrivate(priv);
                    }
                    allSoldiers.add(lieutenantGeneral);
                    break;
                }
                case "Engineer": {
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    String corps = tokens[5];
                    EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps);
                    for (int i = 6; i < tokens.length; i += 2) {
                        Repair repair = new Repair(tokens[i], Integer.parseInt(tokens[i + 1]));
                        engineer.addRepair(repair);
                    }
                    allSoldiers.add(engineer);
                    break;
                }
                case "Commando": {
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    String corps = tokens[5];
                    CommandoImp commandoImp = new CommandoImp(id,firstName,lastName,salary,corps);
                    for (int i = 6; i < tokens.length; i += 2) {
                        Mission mission = new Mission(tokens[i],tokens[i+1]);
                        commandoImp.addMission(mission);
                    }
                    allSoldiers.add(commandoImp);
                    break;
                }
                case "Spy": {
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    int codeNumber = Integer.parseInt(tokens[4]);
                    SpyImpl spy = new SpyImpl(id,firstName,lastName,codeNumber);
                    allSoldiers.add(spy);
                    break;
                }
            }
        }

        allSoldiers.forEach(System.out::println);
    }
}
