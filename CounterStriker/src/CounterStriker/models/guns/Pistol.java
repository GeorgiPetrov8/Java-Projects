package CounterStriker.models.guns;

public class Pistol extends GunImpl {
    public Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (this.getBulletsCount() > 0) {
            int newBulletsCount = this.getBulletsCount() - 1;
            this.setBulletsCount(newBulletsCount);
            return 1;
        }
        return 0;
    }
}
