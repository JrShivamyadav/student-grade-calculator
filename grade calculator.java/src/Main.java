import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of subjects");
       int numsub = sc.nextInt();
       float sum =0;
       int i=0;
        System.out.println("Enter marks of subjects");
       while (i<numsub){
           float subject =sc.nextInt();
          sum = sum+subject;
          i++;

       }
       float percent = sum /numsub;

        System.out.println("------------------------------------------------------------");
        if(percent >=80 && percent <=100){
            System.out.println("SUM =" +sum+"    PERCENT = "+percent+"    GRADE = A"  );
        }
        else if(percent >=60 && percent < 80){
            System.out.println("SUM = "+sum+"    PERCENT = "+percent+"    GRADE = B");
        }
        else if(percent >=30 && percent < 60){
            System.out.println("SUM = "+sum+"    PERCENT = "+percent+"    GRADE = C");
        }
        else if(percent <=30){
            System.out.println("SUM = "+sum+"    PERCENT = "+percent+"    GRADE = FAIL");
        }
        if(percent >100){
            System.out.println("Invalid Marks provided !!! try again");
        }
        System.out.println("-------------------------------------------------------------");
    }
}