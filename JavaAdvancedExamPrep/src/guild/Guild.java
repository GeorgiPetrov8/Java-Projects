package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        roster = new ArrayList<>();
    }

    public List<Player> getRoster() {
        return roster;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addPlayer(Player player) {
        if (roster.size() < capacity) {
            roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        return roster.removeIf(player -> player.getName().equals(name));
    }

    public void promotePlayer(String name) {
        for (Player player : roster) {
            if (player.getName().equals(name)) {
                player.setRank("Member");
                break;
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : roster) {
            if (player.getName().equals(name)) {
                player.setRank("Trial");
                break;
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        Player[] kickedPlayer = roster.stream()
                .filter(e -> e.getClazz().equals(clazz))
                .toArray(Player[]::new);
        roster.removeIf(e-> e.getClazz().equals(clazz));
        return kickedPlayer;
    }

    public int count() {
        return roster.size();
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Players in the guild: %s:",getName()));
        for (Player player : roster) {
            builder.append(player);
        }
      return builder.toString();
    }
}
