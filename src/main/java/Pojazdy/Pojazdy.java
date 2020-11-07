package Pojazdy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Pojazdy {
    final static  Logger logger = LogManager.getLogger(Pojazdy.class);

    private static Scanner scan;
    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        scan = new Scanner(System.in);
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
            logger.info("WHAT DO YOU WANT TO PICK? (1-6): ");
            option = scan.nextLine();

            switch(option) {

                case "1":
                    Car();
                    break;

                case "2":
                    Ship();
                    break;

                case "3":
                    Plane();
                    break;

                case "4":
                    Bicycle();
                    break;

                case "5":
                    All();
                    break;

                case "6":
                    System.exit(0);
                    break;

                default:
                    logger.error("Podaj prawidłową opcję. Wybrana przez ciebie opcja jest błędna!");
            }

        }while (!exit);

    }



    public static void Car() {
        String producer = "BMW";
        String producer_2 = "Audi";
        int maxSpeed = 130;
        int maxSpeed_2 = 140;
        Map<String, Integer> Car = new HashMap<String, Integer>();
        Car.put(producer, maxSpeed);
        Car.put(producer_2, maxSpeed_2);
        logger.info("Moje auta: " + Car);
        if(maxSpeed > maxSpeed_2) {
            logger.info("Pojazd Car producenta BMW jest najszybszy, jego maksymalna prędkość to: " +maxSpeed + " km/h");
        }
        else if(maxSpeed < maxSpeed_2)
        {
            logger.info("Pojazd Car producenta Audi jest najszybszy, jego maksymalna prędkość to: " +maxSpeed_2 + " km/h");
        }
        else if (maxSpeed == maxSpeed_2)
        {
            logger.info("Oba pojazdy poruszają się z taką samą prędkością");
        }

    }

    public static void Ship() {
        String producer = "Dana";
        String producer_2 = "Monica";
        int maxSpeed = 150;
        int maxSpeed_2 = 120;
        Map<String, Integer> Car = new HashMap<String, Integer>();
        Car.put(producer, maxSpeed);
        Car.put(producer_2, maxSpeed_2);
        logger.info("Moje statki: " + Car);
        if(maxSpeed > maxSpeed_2) {
            logger.info("Pojazd SHIP producenta Dana jest najszybszy, jego maksymalna prędkość to: " +maxSpeed + " km/h");
        }
        else if(maxSpeed < maxSpeed_2)
        {
            logger.info("Pojazd SHIP producenta Monica jest najszybszy, jego maksymalna prędkość to: " +maxSpeed_2 + " km/h");
        }
        else if (maxSpeed == maxSpeed_2)
        {
            logger.info("Oba pojazdy poruszają się z taką samą prędkością");
        }


    }

    public static void Plane() {
        String producer = "Ryanair";
        String producer_2 = "Wizzair";
        int maxSpeed = 100;
        int maxSpeed_2 = 90;
        Map<String, Integer> Car = new HashMap<String, Integer>();
        Car.put(producer, maxSpeed);
        Car.put(producer_2, maxSpeed_2);
        logger.info("Moje samoloty: " + Car);
        if(maxSpeed > maxSpeed_2) {
            logger.info("Pojazd PLANE producenta Ryanair jest najszybszy, jego maksymalna prędkość to: " +maxSpeed + " km/h");
        }
        else if(maxSpeed < maxSpeed_2)
        {
            logger.info("Pojazd PLANE producenta Wizzair jest najszybszy, jego maksymalna prędkość to: " +maxSpeed_2 + " km/h");
        }
        else if (maxSpeed == maxSpeed_2)
        {
            logger.info("Oba pojazdy poruszają się z taką samą prędkością");
        }


    }

    public static void Bicycle() {
        String producer = "Caraiman";
        String producer_2 = "Vellberg";
        int maxSpeed = 80;
        int maxSpeed_2 = 60;
        Map<String, Integer> Car = new HashMap<String, Integer>();
        Car.put(producer, maxSpeed);
        Car.put(producer_2, maxSpeed_2);
        logger.info("Moje Rowery: " + Car);
        if(maxSpeed > maxSpeed_2) {
            logger.info("Pojazd BICYCLE producenta Caraiman jest najszybszy, jego maksymalna prędkość to: " +maxSpeed + " km/h");
        }
        else if(maxSpeed < maxSpeed_2)
        {
            logger.info("Pojazd BICYCLE producenta Vellberg jest najszybszy, jego maksymalna prędkość to: " +maxSpeed_2 + " km/h");
        }
        else if (maxSpeed == maxSpeed_2)
        {
            logger.info("Oba pojazdy poruszają się z taką samą prędkością");
        }


    }

    public static void All () {
        logger.info("Wszystko:");
        Car();
        logger.info("");
        Ship();
        logger.info("");
        Plane();
        logger.info("");
        Bicycle();

    }

}
