package footballTeamGenerator;

public class Player {
    private String playerName;

    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String playerName,
                  int endurance,
                  int sprint,
                  int dribble,
                  int passing,
                  int shooting) {
        this.setPlayerName(playerName);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getPlayerName() {
        return playerName;
    }

    private void setPlayerName(String playerName) {
        if (playerName == null || playerName.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.playerName = playerName;
    }

    private void setEndurance(int endurance) {
        this.validateStats(endurance,"Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        this.validateStats(sprint,"Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        this.validateStats(dribble,"Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        this.validateStats(passing,"Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        this.validateStats(shooting,"Shooting");
        this.shooting = shooting;
    }

    public double getOverallSkillLevel() {
        return (this.dribble + this.endurance +
        this.sprint + this.passing + this.shooting) / 5.00;
    }

    private void validateStats(int stat, String statName) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }
}
