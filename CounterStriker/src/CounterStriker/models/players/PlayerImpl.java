package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;

import static CounterStriker.common.ExceptionMessages.*;

public abstract class PlayerImpl implements Player {
    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

    public PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
        this.setAlive(true);
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void takeDamage(int points) {
        int armorPoints = this.getArmor();
        int healthPoints = this.getHealth();

        if (armorPoints >= points) {
            int newArmorPoints = armorPoints - points;
            this.setArmor(newArmorPoints);
        } else {
            int newPoints = points - armorPoints;
            this.setArmor(0);

            if (healthPoints >= newPoints) {
                int newHealthPoints = healthPoints - newPoints;
                this.setHealth(newHealthPoints);
            } else {
                this.setHealth(0);
                this.setAlive(false);
            }

        }

    }

    private void setUsername(String username) {
        if (username.trim().isEmpty()) {
            throw new NullPointerException(INVALID_PLAYER_NAME);
        }
        this.username = username;
    }

    private void setHealth(int health) {
        validateValue(health, INVALID_PLAYER_HEALTH);
        this.health = health;
    }

    private void setArmor(int armor) {
        validateValue(armor, INVALID_PLAYER_ARMOR);
        this.armor = armor;
    }

    private void setGun(Gun gun) {
        if (gun == null) {
            throw new NullPointerException(INVALID_GUN);
        }
        this.gun = gun;
    }

    private void setAlive(boolean flag) {
        this.isAlive = flag;
    }

    private void validateValue(int value, String message) {
        if (value < 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
