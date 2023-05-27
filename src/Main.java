public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff justinFinchFletchey = new Hufflepuff("Джастин Финч-Флетчли", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", (int) (Math.random() * 100), (int) (Math.random() * 100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));

        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(marcusBelby);
        System.out.println(cedricDiggory);

        CompareStudent compareStudent = new CompareStudent();
        compareStudent.compare(harryPotter, hermioneGranger);
        compareStudent.compare(dracoMalfoy, gregoryGoyle);
        compareStudent.compare(zachariahSmith, cedricDiggory);
        compareStudent.compare(zhouChang, padmaPatil);

        compareStudent.compareHogwarts(harryPotter, dracoMalfoy);
        compareStudent.compareHogwarts(ronWeasley, cedricDiggory);
        compareStudent.compareHogwarts(grahamMontague, justinFinchFletchey);
    }
}
