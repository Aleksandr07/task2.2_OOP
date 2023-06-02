public class CompareStudent {
    public void compare(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstSumFeatures = firstStudent.getBravery() + firstStudent.getHonor() + firstStudent.getNobility();
        int secondSumFeatures = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();
        if (firstSumFeatures > secondSumFeatures) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
        } else if (firstSumFeatures < secondSumFeatures) {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " равен " + secondStudent.getName());
        }
    }
    public void compare(Slytherin firstStudent, Slytherin secondStudent) {
        int firstSumFeatures = firstStudent.getAmbition() + firstStudent.getCunning() + firstStudent.getDetermination() +
                firstStudent.getResourcefulness() + firstStudent.getThirstForPower();
        int secondSumFeatures = secondStudent.getAmbition() + secondStudent.getCunning() + secondStudent.getDetermination() +
                secondStudent.getResourcefulness() + secondStudent.getThirstForPower();
        if (firstSumFeatures > secondSumFeatures) {
            System.out.println(firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName());
        } else if (firstSumFeatures < secondSumFeatures) {
            System.out.println(secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " равен " + secondStudent.getName());
        }
    }
    public void compare(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstSumFeatures = firstStudent.getHardwork() + firstStudent.getHonest() + firstStudent.getLoyal();
        int secondSumFeatures = secondStudent.getHardwork() + secondStudent.getHonest() + secondStudent.getLoyal();
        if (firstSumFeatures > secondSumFeatures) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName());
        } else if (firstSumFeatures < secondSumFeatures) {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " равен " + secondStudent.getName());
        }
    }
    public void compare(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstSumFeatures = firstStudent.getSmart() + firstStudent.getWise() + firstStudent.getWit() + firstStudent.getCreativity();
        int secondSumFeatures = secondStudent.getSmart() + secondStudent.getWise() + secondStudent.getWit() + secondStudent.getCreativity();
        if (firstSumFeatures > secondSumFeatures) {
            System.out.println(firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName());
        } else if (firstSumFeatures < secondSumFeatures) {
            System.out.println(secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " равен " + secondStudent.getName());
        }
    }

    public void compareHogwarts(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstSumFeatures = firstStudent.getMagicPower() + firstStudent.getTransgressionDistance();
        int secondSumFeatures = secondStudent.getMagicPower() + secondStudent.getTransgressionDistance();
        if (firstSumFeatures > secondSumFeatures) {
            System.out.println(firstStudent.getName() + " обладает большей мощностью магии, чем " + secondStudent.getName());
        } else if (firstSumFeatures < secondSumFeatures) {
            System.out.println(secondStudent.getName() + " обладает большей мощностью магии, чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " равен " + firstStudent.getName());
        }
    }
}
