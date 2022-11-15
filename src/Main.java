import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args)
    {
//        Задача 1.1
        System.out.println("Задача 1.1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершенолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();

//        Задача 1.2
        System.out.println("Задача 1.2");
        int humanAge = 55;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Если ребенку " + humanAge + ", то он ходит в школу.");
        }
        if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Если человеку " + humanAge + ", то он уже закончил школу и может отправляться в университет.");
        }
        if (humanAge >= 24) {
            System.out.println("Если человеку " + humanAge + ", то он окончил университет и ему пора искать первую работу.");
        }
        System.out.println();

//        Задача 1.3
        System.out.println("Задача 1.3");
        int occupiedSeats = 60; // занято сидячих мест, если допустить, что сидячие места оплачиваются дополнительно
        int occupiedStandees = 42; // занято стоячих мест

        int carriageCapacity = 102;
        int seats = 60;
        int standees = carriageCapacity - seats;

        if (occupiedSeats <= seats) {
            System.out.println("В вагоне осталось свободных мест: \nсидячих - " + (seats - occupiedSeats) + ";");
        }
        if (occupiedStandees <= standees) {
            System.out.println("стоячих - " + (standees - occupiedStandees) + ".");
        }
        if (occupiedSeats + occupiedStandees == carriageCapacity) {
            System.out.println("В вагоне нет свободных мест!");
        }
        System.out.println();

//        Задача 2.1
        System.out.println("Задача 2.1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!");
        } else {
            System.out.println("Возраст совершенолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();

//        Задача 2.2
        System.out.println("Задача 2.2");
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Если ребенку " + humanAge + ", то он ходит в школу.");
        } else if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Если человеку " + humanAge + ", то он уже закончил школу и может отправляться в университет.");
        } else {
            System.out.println("Если человеку " + humanAge + ", то он окончил университет и ему пора искать первую работу.");
        }
        System.out.println();

//        Задача 2.3
        System.out.println("Задача 2.3");
        if (occupiedSeats + occupiedStandees < carriageCapacity) {
            if (occupiedSeats <= seats) {
                System.out.println("В вагоне осталось свободных мест: \nсидячих - " + (seats - occupiedSeats) + ";");
                if (occupiedStandees <= standees) {
                    System.out.println("стоячих - " + (standees - occupiedStandees) + ".");
                }
            }
        } else {
            System.out.println("В вагоне не осталось свободных мест.");
        }
        System.out.println();

//        Задача 3.1 (вариант 1)
        System.out.println("Задача 3.1 (вариант 1)");
        int personAge = 26;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        }
        else if (personAge >= 7 && personAge <= 18) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        }
        else if (personAge > 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        }
        else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }
        System.out.println();

//        Задача 3.1 (вариант 2)
        System.out.println("Задача 3.1 (вариант 1)");
        boolean kindegartenAge = personAge >= 2 && personAge <= 6;
        boolean schoolAge = personAge >= 7 && personAge <= 18;
        boolean univercityAge = personAge > 18 && personAge <= 24;
        boolean jobAge = personAge > 24;
        if (kindegartenAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        }
        else if (schoolAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        }
        else if (univercityAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        }
        else if (jobAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }
        System.out.println();

//        Задача 3.2 (вариант 1)
        System.out.println("Задача 3.2 (вариант 1)");
        int childAge = 7;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе.");
        }
        else if (childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();

//        Задача 3.2 (вариант 2)
        System.out.println("Задача 3.2 (вариант 2)");
        boolean cannotRide = childAge < 5;
        boolean canRideWithAdult = childAge < 14;
        boolean adult = false;
        if (cannotRide) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе.");
        }
        else if (canRideWithAdult) {
            if (adult) {
                System.out.println("Если возраст ребенка равен " + childAge + " и его сопровождает взрослый, то он может кататься на аттракционе.");
            } else {
                    System.out.println("Если возраст ребенка равен " + childAge + " и его не сопровождает взрослый, то он не может кататься на аттракционе.");
                }
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();

//        Задача 3.3
        System.out.println("Задача 3.3");
        int one = 5;
        int two = 1;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Наибольшим числом является число " + one + ".");
        }
        else if (two > one && two > three) {
            System.out.println("Наибольшим числом является число " + two + ".");
        }
        else if (three > one && three > two){
            System.out.println("Наибольшим числом является число " + three + ".");
        }
        else if (one == two && two == three) {
            System.out.println("Все три числа равны.");
        } else {
            System.out.print("Два числа из трех равны.");
        }
    }
}