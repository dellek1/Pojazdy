package Pojazdy;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Vehicles x = new Vehicles();
    static Logger logger = LogManager.getLogger(Main.class);

        public static void main(String[] args) {

        menu();
        }

        public static void menu() {

        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String option;

        String[] i = new String[] {
        "\nYOUR POSSIBLE CHOICES:",
        "1. CAR",
        "2. SHIP",
        "3. PLANE",
        "4. BICYCLE",
        "5. ALL",
        "6. EXIT"
        };


        do {
        for (String element : i)
        System.out.println(element);
        System.out.println();
        logger.info("WHAT DO YOU WANT TO PICK? (Type: car/ship/plane/bicycle/all/exit) ");
        option = scan.nextLine();

        switch(option) {

        case "car":
        x.Car();
        break;

        case "ship":
        x.Ship();
        break;

        case "plane":
        x.Plane();
        break;

        case "bicycle":
        x.Bicycle();
        break;

        case "all":
        x.All();
        break;

        case "exit":
        System.exit(0);
        break;

        default:
        logger.error("Podaj prawidłową opcję. Wybrana przez ciebie opcja jest błędna!");
        }

        }while (!exit);

        }
}