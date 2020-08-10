package footballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        if (!players.removeIf(player -> player.getPlayerName().equals(playerName))) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.getName() + " team.");
        }
    }

    public double getRating() {
        double result = 0.0;
        if (!players.isEmpty()) {
            for (Player player : players) {
                result += player.getOverallSkillLevel();
            }
            result /= players.size();
            return result;
        }
        return 0;
    }
}
