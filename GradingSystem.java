import java.util.Scanner;
 class GradingSystem {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if(marks > 90){
        System.out.print("excellent");
        }
        else if(marks > 80  ) {     
            System.out.print("good");
        }
         else if(marks > 70 ) {     
            System.out.print("fair");
        }
         else if(marks > 60 ) {     
            System.out.print("meets expectation");
        }
        else if (marks < 60){
            System.out.print("below par");
        }
    }

    }
