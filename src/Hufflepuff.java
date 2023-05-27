public class Hufflepuff extends Hogwarts {
    private int hardwork;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardwork = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Трудолюбие " + hardwork + "\n" +
                "Верность " + loyal + "\n" +
                "Честность " + honest;
    }
}
