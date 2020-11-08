
class BodyMass {

    double high;
    double weight;
    double BM;

    public BodyMass(double weight, double high) {

        BM = weight / (high * high);

    }

    class TimeReq {

        double weight;
        double calMin;
        double result;
        double calories;
        double WalkTm;

        public TimeReq(double weight, double calories) {
            if (weight <= 45.5) {
                calMin = 3.9;
            } else if (weight > 45.5 && weight <= 54.5) {
                calMin = 4.7;
            } else if (weight > 54.5 && weight <= 63.6) {
                calMin = 5.5;
            } else if (weight > 63.6 && weight <= 72.7) {
                calMin = 6.3;
            } else if (weight > 72.7 && weight <= 81.8) {
                calMin = 7.1;
            } else if (weight > 81.8 && weight <= 90.9) {
                calMin = 7.8;
            } else {
                calMin = 8.6;
            }

            result = (calories / calMin) / 60.0;

        }

        TimeReq() {

        }

    }
}

class gdBy {

    public void Bye() {

        System.out.println("\nGood Bye , See you Soon");
    }
}
