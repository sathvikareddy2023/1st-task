
package ATMMachine;
import java.util.*;
 class ATM {
    float Balance;
    int pin = 5674;
    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1: Check A/C Balance");
        System.out.println("2:Withdraw Money");
        System.out.println("3:Deposit Money");
        System.out.println("4:EXIT");
        
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if(opt == 1){
            checkbalance();
        }
        else if(opt == 2)
        {
            withdrawmoney();
        }
        else if(opt == 3){
            depositmoney();
        }
        else if(opt == 4){
        return;
    }
        else{
                System.out.println("Enter valid choice");
                }
    }
    public void checkbalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter tye amount to wittdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient balance");
        }
        else
        {
            Balance = Balance - amount;
            System.out.println("Money withdrawl successful");
            
        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited successfully");
        menu();
    }
    
}
    class ATMMachine{
       public static void main(String[] args){
           ATM obj = new ATM();
           obj.checkpin();
           
       }
    
}



