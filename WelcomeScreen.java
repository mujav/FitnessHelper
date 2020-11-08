
import java.util.*;
import java.lang.Math;

public class WelcomeScreen {

    public static void main(String args[]) {

        char quit = 'y';
        String input;
        Scanner X = new Scanner(System.in);

        System.out.println("\tWelcome To Our Fittness System");
        System.out.println("   We Will Help You To Keep Your Body Healthy");

        System.out.println("\nPlease Enter Your Name : ");
        String Name = X.nextLine();

        System.out.println("\nPlease Enter Your Gender 'Male,Female' : ");
        String Gender = X.nextLine();

        System.out.println("\nPlease Enter Your Age : ");
        double Age = X.nextDouble();

        System.out.println("\nPlease Enter Your Wight(in Kg) : ");
        double weight = X.nextDouble();

        System.out.println("\nPlease Enter Your High(in Meter) : ");
        double hight = X.nextDouble();

        while (quit != 'n') {
            System.out.println("\n\nA. Calculate Body mass");
            System.out.println("\nB. Calculate Your Burn Rate");
            System.out.println("\nC. Claculate The Time Required To Burn Amont Of Calories");
            System.out.println("\nD. Create Your Nutrients");
            System.out.println("\n\t\tCHOOSE THE SERVICE [A, B, C, D]");
            String ans = X.next();

            BodyMass BodyMassCal = new BodyMass(weight, hight);

            char choose = ans.charAt(0);
            switch (choose) {
                case 'A':

                    System.out.print(BodyMassCal.BM);
                    if (BodyMassCal.BM < 18.5) {
                        System.out.println(" Your BMI in low Range, Watch out yourself");
                    } else if (BodyMassCal.BM >= 18.5 && BodyMassCal.BM <= 24.9) {
                        System.out.println(" Your BMI in normal range, Great!");
                    } else if (BodyMassCal.BM >= 25.0 && BodyMassCal.BM <= 29.9) {
                        System.out.println(" Your BMI is almost in high range, Please Stay away from Chocolate");
                    } else {
                        System.out.println(" Your BMI in high range, Please try to make your life healthy");
                    }
                    break;
                case 'B':
                    Opr[] m = new Opr[2];
                    if (Gender.equalsIgnoreCase("female")) {
                        System.out.println(m[0] = new burnRateF(hight, weight, Age));
                    } else {

                        System.out.println(m[1] = new burnRateM(hight, weight, Age));
                    }

                    break;
                case 'C':

                    System.out.println("Please Enter the Amont of Calories :");
                    double calories = X.nextDouble();
                    BodyMass.TimeReq wlkTime = BodyMassCal.new TimeReq(weight, calories);
                    System.out.println("You must walk in 4km/h for " + Math.round(wlkTime.result) + " hours");
                    break;
                case 'D':
                    ArryCls.nutrients();
                    break;
                default:
                    System.out.println("invaild choice!!");
            }

            System.out.println("\nDo you want to choose another Service?");
            input = X.next().toLowerCase();

            quit = input.charAt(0);
            if (input.equalsIgnoreCase("no")) {
                gdBy B = new gdBy();
                B.Bye();
            }
        }
    }
}
