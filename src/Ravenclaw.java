public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int teleportation, int clever, int wisdom, int wit, int creativity) {
        super(name, magicPower, teleportation);
        this.clever = clever;
        this.wisdom = wit;
        this.wit = wisdom;
        this.creativity = creativity;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
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

    public int getRavenclawPoints() {
        return (clever+wisdom+wit+creativity);
    }
    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getRavenclawPoints() == student2.getRavenclawPoints()) {
            System.out.println("Волшебники равны по характеристикам");
        }
        if (student1.getRavenclawPoints() > student2.getRavenclawPoints()) {
            System.out.println(student1.getName() + " лучший когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший когтевранец, чем " + student1.getName());
        }
    }

}
