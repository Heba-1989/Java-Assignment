import java.util.Scanner;

public class string_fun {
    public static void main(String[] args) {
        Scanner string_scan = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = string_scan.nextLine();
        System.out.println("UPPER CASE : "+sentence.toUpperCase());
        System.out.println("Length : "+sentence.length());
        System.out.println("first char : "+sentence.charAt(0));
    }
    }

