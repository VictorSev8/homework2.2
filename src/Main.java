import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*Griffindor[] griffindors = {
                new Griffindor("Harry Potter", 95, 90, 70, 60, 100),
                new Griffindor("Hermiona Granger", 85, 85, 77, 35, 23),
                new Griffindor("Ron Weasley", 30, 54, 35, 61, 69),
        };
        Slytzerin[] slytzerins = {
                new Slytzerin("Draco Malfoy", 60, 79, 75, 20, 51, 60, 90),
                new Slytzerin("Graham Montegy", 40, 30, 45, 60, 40, 70, 60),
                new Slytzerin("Gregory Gole", 50, 71, 53, 25, 81, 42, 80),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zakhary Smith", 40, 34, 70, 60, 97),
                new Hufflepuff("Sedric Diggory", 73, 70, 65, 80, 100),
                new Hufflepuff("Justin Finch-Fletchley", 71, 63, 88, 70, 40),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Czhou Chang", 90, 40, 60, 20, 10, 50),
                new Ravenclaw("Padme Patil", 50, 65, 60, 90, 85, 84),
                new Ravenclaw("Marcus Belby", 56, 53, 17, 34, 12, 99),
        };
        */
        Griffindor harry = new Griffindor("Harry Potter", 95, 90, 70, 60, 100);
        Griffindor hermiona = new Griffindor("Hermiona Granger", 85, 85, 77, 35, 23);
        Griffindor ron = new Griffindor("Ron Weasley", 30, 54, 35, 61, 69);
        Slytzerin draco = new Slytzerin("Draco Malfoy", 60, 79, 75, 20, 51, 60, 90);
        Slytzerin graham = new Slytzerin("Graham Montegy", 40, 30, 45, 60, 40, 70, 60);
        Slytzerin gregory = new Slytzerin("Gregory Gole", 50, 71, 53, 25, 81, 42, 80);
        Hufflepuff zakhary = new Hufflepuff("Zakhary Smith", 40, 34, 70, 60, 97);
        Hufflepuff sedric = new Hufflepuff("Sedric Diggory", 73, 70, 65, 80, 100);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 71, 63, 88, 70, 40);
        Ravenclaw czhou = new Ravenclaw("Czhou Chang", 90, 40, 60, 20, 10, 50);
        Ravenclaw padme = new Ravenclaw("Padme Patil", 50, 65, 60, 90, 85, 84);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 56, 53, 17, 34, 12, 99);


        // Сделайте метод, который выводит на экран описание студента.
        // В описание надо включать качества, которые присущи всем студентам, плюс качества, которые присущи студенту,
        // потому что он учится на конкретном факультете.
        PrintInfoAboutSorcerer.print(harry);
        PrintInfoAboutSorcerer.print(draco);
        PrintInfoAboutSorcerer.print(sedric);
        PrintInfoAboutSorcerer.print(czhou);
        System.out.println();
        //Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам.
        // У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
        //Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
        //Метод должен выводить в консоль сравнение учеников.

        Griffindor.compare(harry,hermiona);
        Slytzerin.compare(draco,graham);
        Hufflepuff.compare(zakhary,sedric);
        Ravenclaw.compare(czhou, padme);
        System.out.println();
        //Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе
        // магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        Hogwarts.compare(harry,draco);
        Hogwarts.compare(sedric,padme);
        Hogwarts.compare(czhou,hermiona);
    }
}