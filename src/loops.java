import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*  for (int i = 0; i <=10 ; i++) {
            System.out.print(i+"  ");
            if(i%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        System.out.println("enter a number");

        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                    System.out.println("Monday");
                    break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                            case 5:
                                System.out.println("Thursday");
                                break;
                                case 6:
                                    System.out.println("Friday");
                                    break;
                                    case 7:
                                        System.out.println("Saturday");
                                        break;
                                        default:
                                            System.out.println("enter number between 1-7");


        }
        System.out.println("enter a number");
        int i=sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(j+"*"+i+"="+(i*j));
        }*/
        int c=0;
        System.out.println("enter a number");
        int num1=sc.nextInt();
      //  String count=String.valueOf(num1);
      //  c=count.length();
        while (num1>0) {
            num1=num1/10;
            c++;
        }
        System.out.println("number of digits= "+c);

        System.out.println("enter a number");
        int num2=sc.nextInt();
          String count=String.valueOf(num2);
          String append="";
         int digits=count.length();
         while (digits>0) {
             append=append+count.charAt(digits-1);
             digits--;

         }
        System.out.println("reversed string : "+ append);
    }
}
