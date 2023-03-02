public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int teleportation, int hardworking, int loyal, int honest) {
        super(name, magicPower, teleportation);
        this.hardworking = hardworking;
        this.honest = honest;
        this.loyal = loyal;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
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

    public int getHufflepuffPoints() {
        return (hardworking+honest+loyal);
    }

    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getHufflepuffPoints() == student2.getHufflepuffPoints()) {
            System.out.println("Волшебники равны по характеристикам");
        }
        if (student1.getHufflepuffPoints() > student2.getHufflepuffPoints()) {
            System.out.println(student1.getName() + " лучший пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший пуффендуец, чем " + student1.getName());
        }
    }
}
