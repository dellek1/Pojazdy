package Pojazdy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Vehicles {
    final static  Logger logger = LogManager.getLogger(Vehicles.class);
    private static int maxSpeed, maxSpeed_2;
    private static String producer, producer_2;
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
            logger.info("WHAT DO YOU WANT TO PICK? (Type: car/ship/plane/bicycle/all/exit) ");
            option = scan.nextLine();

            switch(option) {

                case "car":
                    Car();
                    break;

                case "ship":
                    Ship();
                    break;

                case "plane":
                    Plane();
                    break;

                case "bicycle":
                    Bicycle();
                    break;

                case "all":
                    All();
                    break;

                case "exit":
                    System.exit(0);
                    break;

                default:
                    logger.error("Podaj prawidłową opcję. Wybrana przez ciebie opcja jest błędna!");
            }

        }while (!exit);

    }



    public static void Car() {
        producer = "BMW";
        producer_2 = "Audi";
        maxSpeed = 130;
        maxSpeed_2 = 140;
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
        producer = "Dana";
        producer_2 = "Monica";
        maxSpeed = 150;
        maxSpeed_2 = 120;
        Map<String, Integer> Ship = new HashMap<String, Integer>();
        Ship.put(producer, maxSpeed);
        Ship.put(producer_2, maxSpeed_2);
        logger.info("Moje statki: " + Ship);
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
        producer = "Ryanair";
        producer_2 = "Wizzair";
        maxSpeed = 100;
        maxSpeed_2 = 90;
        Map<String, Integer> Plane = new HashMap<String, Integer>();
        Plane.put(producer, maxSpeed);
        Plane.put(producer_2, maxSpeed_2);
        logger.info("Moje samoloty: " + Plane);
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
        producer = "Caraiman";
        producer_2 = "Vellberg";
        maxSpeed = 80;
        maxSpeed_2 = 60;
        Map<String, Integer> Bicycle = new HashMap<String, Integer>();
        Bicycle.put(producer, maxSpeed);
        Bicycle.put(producer_2, maxSpeed_2);
        logger.info("Moje Rowery: " + Bicycle);
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
