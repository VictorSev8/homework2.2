public class Hogwarts {
    private String name;
    private int magicPower;
    private int teleportation;

    public Hogwarts(String name, int magicPower, int teleportation) {
        this.name = name;
        this.magicPower = magicPower;
        this.teleportation = teleportation;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTeleportation() {
        return teleportation;
    }

    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void compare(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() == student2.getMagicPower()) {
            System.out.println("сила магии у " + student1.getName() + " и " + student2.getName() + " одинаковая");
        }
        if (student1.getTeleportation() == student2.getTeleportation()) {
            System.out.println("сила трансгрессии у " + student1.getName() + " и " + student2.getName() + " одинаковая");
        }
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println("сила магии у " + student1.getName() + " больше, чем у " + student2.getName());
        } else {
            System.out.println("сила магии у " + student2.getName() + " больше, чем у " + student1.getName());
        }
        if (student1.getTeleportation() > student2.getTeleportation()) {
            System.out.println("сила трансгрессии у " + student1.getName() + " больше, чем у " + student2.getName());
        } else {
            System.out.println("сила трансгрессии у " + student2.getName() + " больше, чем у " + student1.getName());
        }
    }
}
