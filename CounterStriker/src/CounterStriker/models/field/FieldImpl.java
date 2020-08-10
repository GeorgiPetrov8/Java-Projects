package CounterStriker.models.field;

import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static CounterStriker.common.OutputMessages.COUNTER_TERRORIST_WINS;
import static CounterStriker.common.OutputMessages.TERRORIST_WINS;

public class FieldImpl implements Field {
    @Override
    public String start(Collection<Player> players) {
        List<Player> terrorists = new ArrayList<>();
        List<Player> counterTerrorists = new ArrayList<>();

        for (Player player : players) {
            if (player.getClass().isInstance("Terrorist")) {
                terrorists.add(player);
            } else {
                counterTerrorists.add(player);
            }
        }


        while (true) {
            Player terrorist = terrorists.get(0);
            int dmgTerrorist = terrorist.getGun().fire();

            Player counterTerrorist = counterTerrorists.get(0);
            int dmgCounterTerrorist = counterTerrorist.getGun().fire();

            counterTerrorist.takeDamage(dmgTerrorist);
            terrorist.takeDamage(dmgCounterTerrorist);

            if (!terrorist.isAlive()) {
                terrorists.remove(terrorist);
            }

            if (!counterTerrorist.isAlive()) {
                counterTerrorists.remove(counterTerrorist);
            }

            if (terrorists.isEmpty()) {
                return COUNTER_TERRORIST_WINS;
            } else if (counterTerrorists.isEmpty()) {
                return TERRORIST_WINS;
            }
        }

    }
}
