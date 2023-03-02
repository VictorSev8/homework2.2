public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int magicPower, int teleportation, int nobility, int honor, int courage) {
        super(name, magicPower, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }


    public int getGriffindorPoints() {
        return (nobility + honor + courage);
    }

    public static void compare(Griffindor student1, Griffindor student2) {
        if (student1.getGriffindorPoints() == student2.getGriffindorPoints()) {
            System.out.println("Волшебники равны по характеристикам");
        }
        if (student1.getGriffindorPoints() > student2.getGriffindorPoints()) {
            System.out.println(student1.getName() + " лучший гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший гриффиндорец, чем " + student1.getName());
        }
    }
}

