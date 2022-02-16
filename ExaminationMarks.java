import java.util.Scanner;
public class ExaminationMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR SCHOOL NAME: ");
        String school = sc.nextLine();
        System.out.print("STUDENT NAME: " );
        String name = sc.nextLine();
        System.out.print("ENTER YOUR GENDER: ");
        String gender = sc.next();

        if (gender.equals("M") || gender.equals("MALE") || gender.equals("male") || gender.equals("m")) {
            System.out.println("WELCOME TO THE STUDEMT PORTAL\n MR." + name);
        }
             else if (gender.equals("F")||gender.equals("f")||gender.equals("FEMALE")|| gender.equals("female")) {
                 System.out.println("WELCOME TO THE STUDENT PORTAL\n MRS." + name);
             }
             else {
            System.out.println("please enter correct gender");
        }

            System.out.print("YOU WANT TO CHECK YOUR MARKS: ");
            String check = sc.next();

            if (check.equals("YES")||check.equals("Y")||check.equals("yes")||check.equals("y")){
            System.out.print("ENTER YOUR ROLL NUMBER: ");


        int roll_no = sc.nextInt();
        System.out.println("ANNUAL EXAMINATION (2021-2022) RESULT "+ "\n" + "Enter physics marks");
         int a = sc.nextInt();
         System.out.println("Enter chemistry number");
         int b = sc.nextInt();
         System.out.println("Enter mathematics marks");
        int c = sc.nextInt();
        System.out.println("Enter english marks");
        int d = sc.nextInt();
        System.out.println("Enter physical education marks");
        int e = sc.nextInt();
        int total_marks = a+b+c+d+e;
        float per  = (total_marks * 100)/500f;
        System.out.println("TOTAL PERCENTAGE: " + per + "%");
        System.out.println("CONGRATULATINS!! ALL THE BEST FOR NEXT EXAM");
    }
        else System.out.println("THANKS FOR VISITING!!\n GOOD LUCK");

    }}



