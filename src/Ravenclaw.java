public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Ум " + smart + "\n" +
                "Мудость " + wise + "\n" +
                "Остроумие " + wit + "\n" +
                "Полнота творчества " + creativity;
    }
}
