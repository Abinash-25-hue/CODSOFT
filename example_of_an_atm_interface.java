import java.util.*;

class Account
{
    // This creates a unique account number for every name
    //static int no = 1;
    String Acc_NO, PIN;

    double balance = 0;
    public Account ()
    {

    }
    public Account (String name, String pin, double amount)
    { 
        //char c = Integer.parseInt(no);
        Acc_NO = name;
        PIN = pin;
        balance = amount;
    }

}
class ATM extends Account
{
    public ATM (String name, String pin, double amount)
    {
        super.Acc_NO = name;
        super.PIN = pin;
        super.balance = amount;
    }

    public void display ()
    {
        System.out.println("\nAccount No : " + Acc_NO);
        System.out.println("Account Balance : " + super.balance);
    }

    public void deposit (double amount)
    {
        if (amount < 0)
        {
            System.out.println("Invalid Amount !!");
            return;
        }
        super.balance+=amount;
    }

    public double withdraw (double amount)
    {
        if (amount > super.balance)
        {
            System.out.println("Invalid amount !!");
            return -1;
        }
        super.balance-=amount;
        return amount;
    }

    
}

class main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        ArrayList <ATM> Acc = new ArrayList<>();

        String Example_pin_1 = "0", Example_pin_2 = "0";
        Acc.add(new ATM("Example_Account_1", Example_pin_1, 10000));
        Acc.add(new ATM("Example_Account_2", Example_pin_2, 20000));

        int input = 2, valid_1 = 0, valid_2 = 0, input_2 = 2, acc_index = 0, size = 0, input_3 = 2;
        int valid_3 = 0, valid_4 = 0;
        String temp_acc_name, temp_pin, temp_divider, temp_pin_2;

        while (input != 0)
        {
            while (valid_1 == 0 || valid_2 == 0)
            {
                if (valid_1 == 0)
                { 
                System.out.print("\nEnter Account Name : ");
                temp_acc_name = sc.nextLine();
                for (int index = 0; index < Acc.size(); index++)
                {
                    if (temp_acc_name.compareTo(Acc.get(index).Acc_NO) == 0)
                    {
                        acc_index = index;
                        valid_1 = 1;
                        break;
                    }
                }
                
                if (valid_1 == 0)
                {
                System.out.println("Invalid Account Name, Try Again (Press 1) or EXIT (Press 0)  !!");
                System.out.print("Enter Input : ");
                input_2 = sc.nextInt();
                sc.nextLine();
                while (input_2 != 1 && input_2 != 0)
                {
                    System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input_2 = sc.nextInt();
                    sc.nextLine();
                }
                if (input_2 == 0)
                {
                    break;
                }
                }
                }
                if (input_2 == 0)
                {
                    break;
                }

                if (valid_1 == 1)
                {
                    while (valid_2 == 0)
                    {
                        System.out.print("Enter PIN : ");
                        temp_pin = sc.nextLine();
                        

                        temp_divider = temp_pin;
                        /*while (temp_divider >= 0)
                        {
                            temp_divider/=10;
                            size++;
                        }*/
                        size = temp_pin.length();
                        //System.out.println("Size = " + size);
                        if ((size < 1) || (size > 1))
                        {
                            System.out.println("Invalid PIN, PIN should be of 1-digit only, Try Again (Press 1) or EXIT (Press 0)  !!");
                            System.out.print("Enter Input : ");
                            input_3 = sc.nextInt();
                            sc.nextLine();

                            while (input_3 != 1 && input_3 != 0)
                            {
                                System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0) !!");
                                System.out.print("Enter Input : ");
                                input_3 = sc.nextInt();
                                sc.nextLine();
                            }
                            if (input_3 == 1)
                            {
                                System.out.println();
                            }
                            
                            if (input_3 == 0)
                            {
                                break;
                            }
                        }
                        else
                        {
                            temp_pin_2 = Acc.get(acc_index).PIN;
                            if (temp_pin.compareTo(temp_pin_2) == 0)
                            {
                                valid_2 = 1;
                                System.out.println("\nWelcome !!!");
                            }
                            else
                            {
                                System.out.println("Wrong PIN, Try Again (Press 1) or EXIT (Press 0)  !!");
                                System.out.print("Enter Input : ");
                                input_3 = sc.nextInt();
                                sc.nextLine();

                                while ((input_3 != 1) && (input_3 != 0))
                                {
                                    System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                                    System.out.print("Enter Input : ");
                                    input_3 = sc.nextInt();
                                    sc.nextLine();
                                }
                                if (input_3 == 0)
                                {
                                    input_2 = 0;
                                    break;
                                }
                            }
                            
                        }
                        if (input_3 == 0)
                        {
                            input_2 = 0;
                            break;
                        }
                    }
                    if (input_3 == 0)
                    {
                        input_2 = 0;
                        break;
                    }
                }
                if (input_2 == 0)
                {
                    break;
                }
            }
            if (input_2 == 0)
            {
                input = 0;
                break;
            }

            
            System.out.println("\nATM");
            System.out.println("\n(1)    Check Balance");
            System.out.println("(2)    Cash Withdrawal");
            System.out.println("(3)    Cash Deposit");
            System.out.println("\n(0)    EXIT");
            System.out.print("\nEnter your input : ");
            input = sc.nextInt();
            sc.nextLine();

            valid_3 = 0;
            valid_4 = 0;
            if (input < 0 || input > 3)
            {
                System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                System.out.print("Enter Input : ");
                input = sc.nextInt();
                sc.nextLine();

                while (input != 1 && input != 0)
                {
                    System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input = sc.nextInt();
                    sc.nextLine();

                    if (input == 0)
                    {
                        break;
                    }
                }
                
            }
            else if (input == 0)
            {
                break;
            }
            else if (input == 1)
            {
                Acc.get(acc_index).display();
            }
            else if (input == 3)
            {
                while (valid_3 == 0)
                {
                double amt;
                System.out.print("\nEnter amount : ");
                amt = sc.nextDouble();
                sc.nextLine();

                if (amt < 0)
                {
                    System.out.println("\nInvalid Amount, Amount cannot be negative, Try Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input = sc.nextInt();
                    sc.nextLine();

                    while (input != 1 && input != 0)
                    {
                        System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                        System.out.print("Enter Input : ");
                        input = sc.nextInt();
                        sc.nextLine();
                    }
                    if (input == 0)
                    {
                        break;
                    }
                }
                else
                {
                    valid_3 = 1;
                    Acc.get(acc_index).deposit(amt);
                    System.out.println("Amount of " + amt + " is deposited into your bank account. ");
                    System.out.println("Current Balance : " + Acc.get(acc_index).balance);
                }
                }
                if (input == 0)
                {
                    break;
                }
                
            }
            else if (input == 2)
            {
                while (valid_4 == 0)
                {
                double amt;
                System.out.print("\nEnter amount : ");
                amt = sc.nextDouble();
                sc.nextLine();

                if (amt < 0)
                {
                    System.out.println("\nInvalid Amount, Amount cannot be negative, Try Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input = sc.nextInt();
                    sc.nextLine();

                    while (input != 1 && input != 0)
                    {
                        System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                        System.out.print("Enter Input : ");
                        input = sc.nextInt();
                        sc.nextLine();

                        ;
                    }
                    if (input == 0)
                    {
                        break;
                    }
                }
                else if (amt > Acc.get(acc_index).balance)
                {
                    System.out.println("\nInvalid Amount, Not Enough Balance, Current Balance is " + Acc.get(acc_index).balance + "\nTry Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input = sc.nextInt();
                    sc.nextLine();

                    while (input != 1 && input != 0)
                    {
                        System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                        System.out.print("Enter Input : ");
                        input = sc.nextInt();
                        sc.nextLine();

                        ;
                    }
                    if (input == 0)
                    {
                        break;
                    }
                }
                else if (amt > 25000)
                {
                    System.out.println("\nInvalid Amount, Maximum amount for a single withdrawal is Rs 25000 , Try Again (Press 1) or EXIT (Press 0)  !!");
                    System.out.print("Enter Input : ");
                    input = sc.nextInt();
                    sc.nextLine();

                    while (input != 1 && input != 0)
                    {
                        System.out.println("Invalid Input, Try Again (Press 1) or EXIT (Press 0)  !!");
                        System.out.print("Enter Input : ");
                        input = sc.nextInt();
                        sc.nextLine();

                        ;
                    }
                    if (input == 0)
                    {
                        break;
                    }
                }
                else
                {
                    valid_4 = 1;
                    System.out.println("Amount Withdrawn : " + Acc.get(acc_index).withdraw(amt));
                    System.out.println("Current Balance : " + Acc.get(acc_index).balance);
                }
                
                }
                if (input == 0)
                {
                    break;
                }
            }
        }
        System.out.println("\nEXIT Successful");

    }
}