public class AgeExercise {
    public static void main(String[] args) {

        int age = 40;
        if (age > 0 && age < 18) {
            System.out.println("You are underage.");
            if (age >= 15) {
                System.out.println("You can drive a moped.");
            }
        }
        if (age >= 65) {
                System.out.println("You are retired");
            }
        if (age % 10 == 0) {
                System.out.println("Anniversary Party!!");
            }
            if (age == 100) {
                System.out.println("congratulations!");
                System.out.println("congratulations!");
                System.out.println("congratulations!");
            }
        if (age >= 40 && age <= 50) {
                System.out.println("wish happy mid-life");
        } 
        }
    }
