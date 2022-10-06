import java.util.Locale;
import java.util.Scanner;

public class DayThreeExercise

{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter ur name");
        String urName= input.next();
        System.out.println("ur name is "+urName);
        // to get accept integer as input we use nextInt();
        System.out.println("Enter ur name");
        int number= input.nextInt();
        System.out.println("The number u entered is "+number);


        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //while loop
        int i = 1;

        // while loop from 1 to 5
        while(i <= 5) {
            System.out.println(i);
            i++;
        }



        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
        //string methods
        String name= "Atirsaw";
        // to uppercase
        String upperCase= name.toUpperCase();
        //to lowercase
        String lowerCase= name.toLowerCase();
        //to conactenate
        String fullName= name.concat("Awoke");
        // to index a specfic charcter
        char ch= name.charAt(1);// will display char t
        // to compare unicode represenation
        int distance= name.compareTo("Awoke");//will output 0
        // to get the index of aspecfic charcter
        int index= name.indexOf("r");


    }
}
