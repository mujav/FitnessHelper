
import java.util.Scanner;
import java.util.ArrayList;

public class ArryCls {

    public static void nutrients() {
        Scanner x = new Scanner(System.in);
        ArrayList<String> Proteins = new ArrayList<String>();
        ArrayList<String> Carbohydrates = new ArrayList<String>();
        ArrayList<String> fats = new ArrayList<String>();

        System.out.println("*****************Creat your Nutrients******************");
        System.out.println("|Proteins|\n 1)meat\n 2)dairy\n 3)legumes\n 4)nuts \n 5)seafood \n 6)eggs");
        Proteins.add("meat");
        Proteins.add("dairy");
        Proteins.add("legumes");
        Proteins.add("nuts");
        Proteins.add("seafood");
        Proteins.add("eggs");

        System.out.println("*********\na)Remove food \nb)I like all the food");
        char a1 = x.next().charAt(0);
        if (a1 == 'a') {
            System.out.println("Writ the number of food");
            int b1 = x.nextInt();
            switch (b1) {

                case 1:
                    Proteins.remove("meat");
                    break;
                case 2:
                    Proteins.remove("dairy");
                    break;
                case 3:
                    Proteins.remove("legumes");
                    break;
                case 4:
                    Proteins.remove("nuts");
                    break;
                case 5:
                    Proteins.remove("seafood");
                    break;
                case 6:
                    Proteins.remove("eggs");
                    break;
                default:
                    break;

            }
        } else {
            System.out.println("");
        }

        System.out.println("|Carbohydrates|\n 1)pasta\n 2)rice\n 3)cereals\n 4)breads \n 5)potatoes \n 6)milk \n 7)fruit \n 8)sugar ");

        Carbohydrates.add("pasta");
        Carbohydrates.add("rice");
        Carbohydrates.add("cereals");
        Carbohydrates.add("breads");
        Carbohydrates.add("potatoes");
        Carbohydrates.add("milk");
        Carbohydrates.add("fruit");
        Carbohydrates.add("sugar");
        System.out.println("*********\na)Remove food \nb)I like all the food");
        char c1 = x.next().charAt(0);
        if (c1 == 'a') {
            System.out.println("Writ the number of food");
            int d1 = x.nextInt();
            switch (d1) {

                case 1:
                    Carbohydrates.remove("pasta");
                    break;
                case 2:
                    Carbohydrates.remove("rice");
                    break;
                case 3:
                    Carbohydrates.remove("cereals");
                    break;
                case 4:
                    Carbohydrates.remove("breads");
                    break;
                case 5:
                    Carbohydrates.remove("potatoes");
                    break;
                case 6:
                    Carbohydrates.remove("milk");
                    break;
                case 7:
                    Carbohydrates.remove("fruit");
                    break;
                case 8:
                    Carbohydrates.remove("sugar");
                    break;
                default:
                    break;

            }
        } else {
            System.out.println("");
        }

        System.out.println("|Fats|\n 1)oils\n 2)butter\n 3)nuts\n 4)seeds \n 5)avocados \n 6)olives");

        fats.add("oils");
        fats.add("butter");
        fats.add("nuts");
        fats.add("seeds");
        fats.add("avocados");
        fats.add("olives");

        System.out.println("*********\na)Remove food \nb)I like all the food");
        char e1 = x.next().charAt(0);
        if (e1 == 'a') {
            System.out.println("Writ the number of food");
            int f1 = x.nextInt();
            switch (f1) {

                case 1:
                    fats.remove("oils");
                    break;
                case 2:
                    fats.remove("butter");
                    break;
                case 3:
                    fats.remove("nuts");
                    break;
                case 4:
                    fats.remove("seeds");
                    break;
                case 5:
                    fats.remove("avocados");
                    break;
                case 6:
                    fats.remove("olives");
                    break;

                default:
                    break;

            }
        } else {
            System.out.println("");
        }
        System.out.println("\t******Your Nutrients******\n");

        System.out.println("Proteins-------->" + Proteins);
        System.out.println("Carbohydrates--->" + Carbohydrates);
        System.out.println("Fats------------>" + fats);
        System.out.println("Vitamins-------->common vitamins include the water soluble B group vitamins and vitamin C and the fat soluble vitamins A, D, E and K");
        System.out.println("Minerals-------->sodium, calcium, iron, iodine, magnesium, etc., all foods contain some form of minerals");
        System.out.println("Water-----------> As a beverage and a component of many foods, especially vegetables and fruits.");
    }
}
