import java.util.Scanner;

public class student {
    public static double AvgScore(double sub1, double sub2, double sub3) {
        double total=sub1+sub2+sub3;
        double avg=total/3;
        return avg;
    }
    public static char grade(double avg){
        char gr='f';
        if(avg>=85){
            gr='a';
        }
        else if(avg>=70&&avg<=84){
            gr='b';
        } else if (avg>=50&& avg<=69) {
            gr='c';
        }
        else{
            gr='f';
    }
        return gr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of students :");
        int std_num=sc.nextInt();
        String std_name;
        double avg=0;
        char std_grade;
        double[] scores=new double[3];
        for(int i=0;i<std_num;i++){
            System.out.println("what is your name");
            std_name=sc.next();
            for(int j=0;j<3;j++){
                System.out.print("enter your score for subject "+(j+1)+" :");
                scores[j]=sc.nextDouble();
            }
            avg=AvgScore(scores[0],scores[1],scores[2]);
            std_grade=grade(avg);
            System.out.println(std_name+"\n"+ avg+"\n"+Character.toUpperCase(std_grade));

        }
    }
}
