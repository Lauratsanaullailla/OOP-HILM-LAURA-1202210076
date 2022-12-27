import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        boolean value = true;
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();

        do{
            try{
                System.out.println("=== MENU PROGRAM ===");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trepazoid");
                System.out.println("Select menu : ");
                int menu = scanner.nextInt();
                
                switch(menu){
                    case 1:
                    System.out.println("Enter the length of the side of the square : ");
                    double sisi = scanner.nextDouble();
                    calculation.run();
                    System.out.println("The calculation result : "+calculation.getSquare());
                    case 2:
                    System.out.println("Enter the length of the side of the square : ");
                    double sisi = scanner.nextDouble();
                    calculation.run();
                    System.out.println("The calculation result : "+calculation.getSquare());
                }
            }
        }
    }
}
