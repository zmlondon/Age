public class AgeExercise {
    public static void main(String[] args) {

        int age = 100;
        if (age > 0 && age < 18) {
            System.out.println("You are underage.");
        }else if(age >= 65){
         System.out.println("You are retired");
        }else{
            System.out.println("You are an adult.");
        }

        System.out.println("Press space to exit.");

        }
    }


