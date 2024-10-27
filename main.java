import java.io.FileWriter;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer [] miesta = {1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10};
        Integer [] rad = {1, 2 , 3, 4, 5};
        System.out.println("Welcome to our Bus");
        System.out.println("Would you like the enter we are going from Slovakia to Prague y/n");
        String answer = scanner.nextLine();


        if (answer.equals("y")) {
        System.out.println("You choosed to go with us");
        System.out.println("What is your first name: ");
        String name = scanner.nextLine();
        System.out.println("What is your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("1. Buy Ticket, 2. Check available seats , 3. Exit");
        int buy = scanner.nextInt();
        
            if(buy == 1){
                buy();
            }
            if(buy == 2){
                check();
            }
            if(buy == 3){
                exit();
            }
            try {
                FileWriter writer = new FileWriter("meno.txt");
                
                writer.write("Name:" + name+ "\n");
                writer.write("Last Name:" + lastName+ "\n");
                writer.write("\n");
                writer.close();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
            }       
            
        }
        
    }
    public static void buy(){
        Random rand = new Random();
        int randomIntBounded = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tickets you want to buy?");
        int tickets = scanner.nextInt();
        System.out.println("You bought " + tickets + " tickets");
        System.out.println("Here is your seat number: " + randomIntBounded );
           

    }
    public static void check(){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        double dph = 1;
        double price = 10.5;
        Integer [] miesta = {1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10};
        int randomIntBounded = rand.nextInt(10);
        int rows = rand.nextInt(5);
            sigmmaaa();
            payyy();
            System.out.println("Your ticket will be sent to your email");

    }
    public static void exit(){
        System.out.println("Goodbye");
    }

   public static void payyy(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How would you like to pay? cash/card");
    String payment = scanner.nextLine();
    if (payment.equalsIgnoreCase("card")) {
        System.out.println("You paid with card");
        
    }
    else if(payment.equalsIgnoreCase("cash")){
        System.out.println("Do you have exact change? y/n");
        String change = scanner.nextLine();
        if (change.equalsIgnoreCase("y")) {
            System.out.println("You paid with cash");
        }
        else if (change.equalsIgnoreCase("n")) {
            System.out.println("How much money you have?");
            double money = scanner.nextDouble();
            double price = 10.5;
            if (money < price) {
                System.out.println("You dont have enough money");
            }
            else if (money > price) {
                double changee = money - price;
                System.out.println("You paid with cash");
                System.out.println("Here is your change: " + changee + "€");
        }
        
        
    }
    else{
        System.out.println("You have to choose between cash or card");
    }
   }
  

}
    public static void sigmmaaa(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Here are the available seats and rows");
        System.out.println("Row:1 , seats : 1, 2, 3");
        System.out.println("Row:3 , seats : 7, 8, 9");
        System.out.println("Row:4 , seats : 10, 11, 12");
        System.out.println("Row:5 , seats : 13, 14, 15");
        System.out.println("Would you like to choose seat/row or our system can choose for you ? y/n");
        String seatt = scanner.nextLine();
        if (seatt.equals("y")) {
            System.out.println("What row do you want to choose?");
        int row = scanner.nextInt();

        if (row ==1) {
            System.out.println("You choosed row 1");
            System.out.println("What seat do you want to choose? 1 , 2 , 3");
            int seat = scanner.nextInt();
            if (seat == 1) {
                System.out.println("You choosed seat 1");
                System.out.println("And row 1");
            }
            if (seat == 2) {
                System.out.println("You choosed seat 2");
                System.out.println("And row 1");
            }
            if (seat == 3) {
                System.out.println("You choosed seat 3");
                System.out.println("And row 1");
            }
            if (seat > 3) {
                System.out.println("There is no such seat");
            }
        }
        if (row ==2) {
            System.out.println("You choosed row 2");
            System.out.println("What seat do you want to choose? 4 , 5 , 6");
            int seat = scanner.nextInt();
            if (seat == 4) {
                System.out.println("You choosed seat 4");
                System.out.println("And row 2");
            }
            if (seat == 5) {
                System.out.println("You choosed seat 5");
                System.out.println("And row 2");
            }
            if (seat == 6) {
                System.out.println("You choosed seat 6");
                System.out.println("And row 2");
            }
            if (seat >6) {
                System.out.println("There is no such seat");
            }
        }
        if (row ==3) {
            System.out.println("You choosed row 3");
            System.out.println("What seat do you want to choose? 7 , 8 , 9");
            int seat = scanner.nextInt();
            if (seat == 7) {
                System.out.println("You choosed seat 7");
                System.out.println("And row 3");
            }
            if (seat == 8) {
                System.out.println("You choosed seat 8");
                System.out.println("And row 3");
            }
            if (seat == 9) {
                System.out.println("You choosed seat 9");
                System.out.println("And row 3");
            }
            if (seat>9) {
                System.out.println("There is no such seat");
            }
        }
        if (row ==4) {
            System.out.println("You choosed row 4");
            System.out.println("What seat do you want to choose? 10 , 11 , 12");
            int seat = scanner.nextInt();
            if (seat == 10) {
                System.out.println("You choosed seat 10");
                System.out.println("And row 4");
            }
            if (seat == 11) {
                System.out.println("You choosed seat 11");
                System.out.println("And row 4");
            }
            if (seat == 12) {
                System.out.println("You choosed seat 12");
                System.out.println("And row 4");
            }
            if (seat > 12) {
                System.out.println("There is no such seat");

                
            }
        }
        if (row ==5) {
            System.out.println("You choosed row 5");
            System.out.println("What seat do you want to choose? 13 , 14 , 15");
            int seat = scanner.nextInt();
            if (seat == 13) {
                System.out.println("You choosed seat 13");
                System.out.println("And row 5");

            }
            if (seat == 14) {
                System.out.println("You choosed seat 14");
                System.out.println("And row 5");
            }
            if (seat == 15) {
                System.out.println("You choosed seat 15");
                System.out.println("And row 5");
            }
            if (seat > 15) {
                System.out.println("There is no such seat");
                
            }
            
        }
        
        try {
            FileWriter writer = new FileWriter("ticket.txt");
            writer.write("Row number:" + row+ "\n");
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }        
        }
        if (seatt.equals("n")) {
            System.out.println("Our system will choose for you");
            int randomIntBounded = (int)(Math.random()*15);
            System.out.println("Here is your seat number: " + randomIntBounded);
        }
        
        
    }
}
