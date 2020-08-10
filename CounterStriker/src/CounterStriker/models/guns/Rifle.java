package CounterStriker.models.guns;

public class Rifle extends GunImpl {
    public Rifle(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (this.getBulletsCount() >= 10) {
            int newBulletsCount = this.getBulletsCount() - 10;
            this.setBulletsCount(newBulletsCount);
            return 10;
        }
        return 0;
    }
}
