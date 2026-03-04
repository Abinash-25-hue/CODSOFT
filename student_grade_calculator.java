import java.util.*;
public class grade_calc
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        //System.out.println("Hello World");
        System.out.println("\nStudent Grade Calculator");
        int input = 0;
        boolean exit = false;

        while (exit == false)
        {
        System.out.print("\nEnter the number of subjects : ");
        int n = sc.nextInt();
        sc.nextLine();

        while (n < 0)
        {
            input = 2;
            System.out.println("\nThe number of subjects cannot be negative ");
            while (input != 1 && input != 0)
            {
                System.out.println("\nInvalid Input, Try Again (1) or EXIT (0) !!");
                System.out.print("Enter input : ");
                input = sc.nextInt();
                sc.nextLine();
            }
            if (input == 0)
            {
                exit = true;
                break;
            }

            //System.out.println("Invalid number of subjects, number of subjects cannot be negative  !!");
            System.out.print("\nEnter the number of subjects : ");
            n = sc.nextInt();
            sc.nextLine();

        }
        if (exit == true)
        {
            break;
        }

        double marks, marks_sum = 0;

        System.out.println("\nEnter the marks out of 100 : \n");
        for (int index = 0; index < n; index++)
        {
            System.out.print("Subject " + (index + 1) +  " : ");
            marks = sc.nextDouble();
            sc.nextLine();
            while (marks > 100 || marks < 0)
            {
                input = 2;
                System.out.println("\nInvalid Marks, marks should be between 0 to 100 (both included) !!");
                while (input != 1 && input != 0)
                {
                    System.out.println("\nInvalid Input, Try Again (press 1) or EXIT (Press 0) !!");
                    System.out.print("Enter input : ");
                    input = sc.nextInt();
                    sc.nextLine();
                }
                if (input == 0)
                {
                    exit = true;
                    break;
                }
                
                System.out.print("\nEnter marks for Subject " + (index + 1) + " : ");
                marks = sc.nextDouble();
                sc.nextLine();
                System.out.println();
            }
            if (exit)
            {
                break;
            }

            marks_sum+=marks;
        }
        if (exit)
        {
            break;
        }

        System.out.println("\nMarks Obtained : " + marks_sum + " out of " + (n * 100));
        System.out.println("Average Percentage : " + (marks_sum/n) + "%");
        System.out.print("Grade : ");
        if (n == 0)
        {
            System.out.println("NA");
        }
        else if ((marks_sum/n) >= 90)
        {
            System.out.println("O  -  Outstanding");
        }
        else if ((marks_sum/n) >= 80)
        {
            System.out.println("E  -  Excellent");
        }
        else if ((marks_sum/n) >= 70)
        {
            System.out.println("A  -  Very Good");
        }
        else if ((marks_sum/n) >= 60)
        {
            System.out.println("B  -  Good");
        }
         else if ((marks_sum/n) >= 50)
        {
            System.out.println("C  -  Satisfactory");
        }
        else if ((marks_sum/n) >= 40)
        {
            System.out.println("D  -  Bad");
        }
        else 
        {
            System.out.println("F  -  Failed");
        }

        System.out.println("\nContinue (1) or EXIT (0)  !!");
        System.out.print("Enter Input : ");
        input = sc.nextInt();
        sc.nextLine();
        while (input != 1 && input != 0)
        {  
        
            System.out.println ("\nInvalid Input, Continue the grade calculator (Press 1) or EXIT (Press 0) ");
            System.out.print("Enter input : ");
            input = sc.nextInt();
            sc.nextLine();
            

            if (input == 0)
            {
                exit = true;
                break;
            }
        }
        if (input == 0)
        {
            exit = true;
        }
        
        }

        System.out.println("\nEXIT Successful");
    }
}