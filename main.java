import java.io.FileWriter;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer [] miesta = {1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10};
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
        double price = 10.5;
        Integer [] miesta = {1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10};
        int randomIntBounded = rand.nextInt(10);
        System.out.println("These are the available seats");
        System.out.println("1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10");
        System.out.println("Would you like to choose seat or our system can choose for you ? y/n");
        String seat = scanner.nextLine();
        if(seat.equals("y")){
            System.out.println("What seat would you like to choose ?");
            int seatNumber = scanner.nextInt();
            System.out.println("You choosed seat number " + seatNumber);
            System.out.println("one seat cost " + price + "€");
            System.out.println("Here is your seat number:  " + seatNumber);  

            try {
                FileWriter writer = new FileWriter("ticket.txt");
                writer.write("Seat number:" + seatNumber+ "\n");
                writer.write("Price: " + price + "€" + "\n");
                writer.write("\n");
                writer.close();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
            }          
        }
        if (seat.equalsIgnoreCase("n")) {
            System.out.println("Here is your ticket with your name and seat number: ");
            System.out.println(" Seat number: " + randomIntBounded);
        }
       

    }
    public static void exit(){
        System.out.println("Goodbye");
    }
   

}