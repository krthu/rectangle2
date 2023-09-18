

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        System.out.println("Här skapar vi rektanglar");

        createRectangle(rectangles);

        System.out.println(rectangles);

        printMenu(rectangles);

    }

    public static void rectangleMenu(Rectangle rect){
        String menuChoioce = "";
        while (!menuChoioce.equalsIgnoreCase("0")) {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Ändra bredd och höjd");
            System.out.println("2. Lägga till kordinater");
            System.out.println("3. Beräkna omkrets");
            System.out.println("4. Beräkna Area");
            System.out.println("5. Visa alla värden för rektangeln");
            System.out.println("0. För att backa i menyerna");
            menuChoioce = sc.nextLine();
            switch (menuChoioce) {
                case "1" -> {
                    changeHightAndWidth(rect);

                }
                case "2" -> {
                    addCordinates(rect);
                }
                case "3" -> {
                    System.out.println("Omkretsen är " + rect.calculatePerimeter());
                }
                case "4" -> {
                    System.out.println("Arean är " + rect.calculateArea());
                }

                case "5" -> {
                    System.out.println(rect);
                }
                case "0" -> {

                }
                default -> {
                    System.out.println("Ogiltigt menyval.");
                }
            }
        }
    }

    public static void  addCordinates(Rectangle rect){
        System.out.println("Vilken är x kordinaten?");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Vilken är y kordinaten?");
        int y = sc.nextInt();
        sc.nextLine();

        rect.setXY(x,y);
    }

    public static void  changeHightAndWidth(Rectangle rect){

        System.out.println("Höjden är " + rect.getHeight() + " vad vill du ändra till?");
        rect.setHeight(sc.nextDouble());
        sc.nextLine();
        System.out.println("Bredden är " + rect.getWidth() + " vad vill du ändra till?");
        rect.setWidth(sc.nextDouble());
        sc.nextLine();

    }


    public static void createRectangle(ArrayList<Rectangle> array){
        boolean again = true;

        while (again){

            System.out.println("Ange höjden:");
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ange bredden:");
            double width = sc.nextDouble();
            sc.nextLine();
            Rectangle r1 = new Rectangle(width, height);
            array.add(r1);

            System.out.println("Vill du lägga till en till? j/n");
            if (sc.nextLine().equalsIgnoreCase("n")){
                again = false;
            }
        }
    }

    public static void printMenu(ArrayList<Rectangle> rectangles){
        int indexOfRectangle = 0;
        while (indexOfRectangle != -1) {
            System.out.println("Välj vilken rektangel du vill beräkna:");
            if (!rectangles.isEmpty()) {
                for (int i = 0; i < rectangles.size(); i++) {
                    System.out.println("Rektangel " + (i +1));
                }
                System.out.println("0 för att avsluta.");
                indexOfRectangle = sc.nextInt() - 1;
                sc.nextLine();
                if (indexOfRectangle != -1) {
                    rectangleMenu(rectangles.get(indexOfRectangle));
                }
            }
        }
    }
}