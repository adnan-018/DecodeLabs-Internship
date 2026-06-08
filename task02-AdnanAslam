
import java.util.Scanner;

class Decodelabs2project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to calculate grade system ");
        int total_sub = 0;
        while (true) {
            System.out.println("enter how many subject do you have");
            try {
                total_sub = Integer.parseInt(sc.nextLine());
                if (total_sub > 0) {
                    break;
                }
                System.out.println("the no of subject must be greater than zero");
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }
        }

        int total_marks = 0;
        for (int i = 1; i <= total_sub; i++) {
            int marks = 0;
            while (true) {
                System.out.println("the marks of subject " + i + "(0-100): ");
                try {
                    marks = Integer.parseInt(sc.nextLine());
                    if (marks >= 0 && marks <= 100) {
                        break;
                    }
                    System.out.println("the marks must be between (0-100) ");
                } catch (NumberFormatException ex) {
                    System.out.println("invalid input");
                }
            }
            total_marks += marks;
        }

        System.out.println("the total marks is " + total_marks);
        double averagepercentage = (double) total_marks / total_sub;
        System.out.println("the average is " + averagepercentage);
        String grade = "";
        if (averagepercentage >= 90) {
            grade = "A+";
        } else if (averagepercentage >= 80) {
            grade = "A";
        } else if (averagepercentage >= 70) {
            grade = "B+";
        } else if (averagepercentage >= 60) {
            grade = "B";
        } else if (averagepercentage >= 50) {
            grade = "C+"; 
        } else {
            System.out.println("Fail try again text time ");
        }
        // 4. OUTPUT PRESENTATION: Polished Display
        System.out.println("\n=========================================");
        System.out.println("            PERFORMANCE REPORT           ");
        System.out.println("=========================================");
        System.out.println(" Total Subjects     : " + total_sub);
        System.out.println(" Total Marks Earned : " + total_marks + " / " + (total_sub  * 100));
        System.out.printf(" Average Percentage : %.2f%%\n", averagepercentage);
        System.out.println(" Final Grade        : " + grade);
        System.out.println("=========================================");

        sc.close(); // Closing the scanner resource
    }

    }

