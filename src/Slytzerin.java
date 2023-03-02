public class Slytzerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resoursefulness;
    private int lustForpower;

    public Slytzerin(String name, int magicPower, int teleportation, int cunning, int determination, int ambition, int resoursefulness, int lustForpower) {
        super(name, magicPower, teleportation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resoursefulness = resoursefulness;
        this.lustForpower = lustForpower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefulness() {
        return resoursefulness;
    }

    public void setResoursefulness(int resoursefulness) {
        this.resoursefulness = resoursefulness;
    }

    public int getLustForpower() {
        return lustForpower;
    }

    public void setLustForpower(int lustForpower) {
        this.lustForpower = lustForpower;
    }


    public int getSlytzerinPoints() {
        return (cunning+determination+ambition+resoursefulness+lustForpower);
    }

    public static void compare(Slytzerin student1, Slytzerin student2) {
        if (student1.getSlytzerinPoints() == student2.getSlytzerinPoints()) {
            System.out.println("Волшебники равны по характеристикам");
        }
        if (student1.getSlytzerinPoints() > student2.getSlytzerinPoints()) {
            System.out.println(student1.getName() + " лучший слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший слизеринец, чем " + student1.getName());
        }
    }
}
