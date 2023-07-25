import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner ( System.in );
    public static void main(String[] args) {



        do {
            displayGuests ();
            displayMenu ();
            int option = getOption ();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests [i] == null) {
                        System.out.println ( "Name: " );
                        guests[i] = scanner.next ();
                        break;
                    }
                }
            }

            else if (option == 2) {
                System.out.println ("Name: ");
                String name = scanner.next ();
                for (int i = 0; i<guests.length; i++) {
                    if(guests[i] != null && guests[i].equals (name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }

            else if (option == 3) {
                    System.out.println ("Exiting...");
                    break;
                }
        } while (true) ;
    }

    static void displayGuests () {
        System.out.println ("_________________________\n- GUESTS -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println (guests[i] == null ? "--" : guests[i]);
        }
    }

    static void displayMenu () {
        System.out.println ("_________________________\n- MENU -\n");
        System.out.println ( "1 - Add Guest" );
        System.out.println ( "2 - Remove Guest" );
        System.out.println ("3 - Exit");
    }

    static int getOption () {
        System.out.println ( "Option: " );
        int option = scanner.nextInt ();
        System.out.println ();
        return option;
    }
}