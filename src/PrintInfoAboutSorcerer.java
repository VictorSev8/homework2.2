public class PrintInfoAboutSorcerer {

    public static void print(Griffindor griffindor) {
        System.out.println("Имя: " + griffindor.getName() + ", Сила магии: " + griffindor.getMagicPower() +
                ", Умение трансгрессировать: " + griffindor.getTeleportation() +
                ", Благородство: " + griffindor.getNobility() +
                ", Честь: " + griffindor.getCourage() +
                ", Храбрость: " + griffindor.getHonor());
    }

    public static void print(Slytzerin slytzerin) {
        System.out.println("Имя: " + slytzerin.getName() + ", Сила магии: " + slytzerin.getMagicPower() +
                ", Умение трансгрессировать: " + slytzerin.getTeleportation() +
                ", Хитрость: " + slytzerin.getCunning() +
                ", Решительность: " + slytzerin.getDetermination() +
                ", Амбициозность: " + slytzerin.getAmbition() +
                ", Находчивость: " + slytzerin.getResoursefulness() +
                ", Жажда власти: " + slytzerin.getLustForpower());
    }

    public static void print(Hufflepuff hufflepuff) {
        System.out.println("Имя: " + hufflepuff.getName() + ", Сила магии: " + hufflepuff.getMagicPower() +
                ", Умение трансгрессировать: " + hufflepuff.getTeleportation() +
                ", Трудолюбие: " + hufflepuff.getHardworking() +
                ", Честность: " + hufflepuff.getHonest() +
                ", Верность: " + hufflepuff.getLoyal());
    }

    public static void print(Ravenclaw ravenclaw) {
        System.out.println("Имя: " + ravenclaw.getName() + ", Сила магии: " + ravenclaw.getMagicPower() +
                ", Умение трансгрессировать: " + ravenclaw.getTeleportation() +
                ", Ум: " + ravenclaw.getClever() +
                ", Мудрость: " + ravenclaw.getWisdom() +
                ", Остроумие: " + ravenclaw.getWit() +
                ", Творчество: " + ravenclaw.getCreativity());
    }
}


