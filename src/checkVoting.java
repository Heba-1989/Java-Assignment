import java.util.Scanner;

public class checkVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        String nationality="";
        System.out.println("enter your nationality: ");
        nationality = scanner.next();
         nationality=nationality.toLowerCase();

      if(age >= 18 && nationality.equals("egyptian") ) {

            System.out.println("you are eligible to vote");
        }
        else {
            System.out.println("you are not eligible to vote");
        }
    }
}
