package CounterStriker.core;

import CounterStriker.models.field.Field;
import CounterStriker.models.field.FieldImpl;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.GunImpl;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;

import static CounterStriker.common.ExceptionMessages.*;
import static CounterStriker.common.OutputMessages.SUCCESSFULLY_ADDED_GUN;
import static CounterStriker.common.OutputMessages.SUCCESSFULLY_ADDED_PLAYER;

public class ControllerImpl implements Controller {
    private GunRepository<Gun> gunRepository;
    private PlayerRepository<Player> playerRepository;
    private Field field;

    public ControllerImpl() {
        this.gunRepository = new GunRepository<>();
        this.playerRepository = new PlayerRepository<>();
        this.field = new FieldImpl();
    }

    @Override
    public String addGun(String type, String name, int bulletsCount) {
        switch (type) {
            case "Pistol":
                Pistol pistol = new Pistol(name, bulletsCount);
                this.gunRepository.add(pistol);
                return String.format(SUCCESSFULLY_ADDED_GUN, name);
            case "Rifle":
                Rifle rifle = new Rifle(name, bulletsCount);
                this.gunRepository.add(rifle);
                return String.format(SUCCESSFULLY_ADDED_GUN, name);
            default:
                throw new IllegalArgumentException(INVALID_GUN_TYPE);
        }
    }

    @Override
    public String addPlayer(String type, String username, int health, int armor, String gunName) {
        switch (type) {
            case "Terrorist":
                Gun gun;
                gun = getGun(gunName);
                Terrorist terrorist = new Terrorist(username, health, armor, gun);
                playerRepository.add(terrorist);
                return String.format(SUCCESSFULLY_ADDED_PLAYER, username);
            case "CounterTerrorist":
                Gun gun1 = getGun(gunName);
                CounterTerrorist counterTerrorist = new CounterTerrorist(username,health,armor,gun1);
                playerRepository.add(counterTerrorist);
                return String.format(SUCCESSFULLY_ADDED_PLAYER, username);
            default:
                throw new IllegalArgumentException(INVALID_PLAYER_TYPE);
        }
    }

    private Gun getGun(String gunName) {
        Gun gun;
        if (gunRepository.findByName(gunName) == null) {
            throw new NullPointerException(GUN_CANNOT_BE_FOUND);
        } else {
            gun = gunRepository.findByName(gunName);
        }
        return gun;
    }


    @Override
    public String startGame() {
        return field.start(playerRepository.getModels());
    }

    @Override
    public String report() {
        return 
    }
}
