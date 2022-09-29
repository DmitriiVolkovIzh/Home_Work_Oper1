public class Main2 {
    public static void main(String[] args) {
        // Задание 2
        System.out.println("Задание 2");

        int peopleAge = 8;

        if (peopleAge >= 7 && peopleAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if  (peopleAge >= 18 && peopleAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (peopleAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
}
