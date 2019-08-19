package allSeats;

import java.util.Scanner;

//Calculate the price for all the tickets for a cinema movie:
//Reads the type of the movie, the rows and the seats per row in the cinema
//Prints the total price for all seats formatted to the 2nd digit after the decimal point

public class cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());
        double total = 0.00;
    
        switch (type){
            case "Premiere":
                total = 12.00 * rows * seats;
                break;
            case "Normal":
                total = 7.50 * rows * seats;
                break;
            case "Discount":
                total = 5.00 * rows * seats;
                break;
            default:
            total = 0.00;
            }
            System.out.printf("%.2f",total);
    }
}