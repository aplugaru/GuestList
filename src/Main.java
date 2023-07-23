import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];

        Scanner scanner = new Scanner ( System.in );

        do {
            System.out.println ();
            System.out.println ( "1 - Display All Guests" );
            System.out.println ( "2 - Add Guest" );
            System.out.println ( "3 - Remove Guest" );
            System.out.println ("4 - Exit");
            System.out.println ( "Option: " );
            int option = scanner.nextInt ();
            System.out.println ();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    System.out.println ( guests[i] );
                }
            }

            else if (option == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests [i] == null) {
                        System.out.println ( "Name: " );
                        guests[i] = scanner.next ();
                        break;
                    }
                }
            }

            else if (option == 3) {
                System.out.println ("Name: ");
                String name = scanner.next ();
                for (int i = 0; i<guests.length; i++) {
                    if(guests[i] != null && guests[i].equals (name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }

            else if (option == 4) {
                    System.out.println ("Exiting...");
                    break;
                }
        } while (true) ;
    }
}