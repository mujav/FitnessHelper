
interface OP {

    public double result();

    public String toString();

}

public abstract class Opr implements OP {

    private String opName;

    public Opr(String op) {
        opName = op;

    }

    public abstract double result();

    public String toString() {

        return opName;
    }
}

class burnRateF extends Opr {

    private double hight;
    private double weight;
    private double Age;

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }

    public burnRateF(double a, double b, double c) {
        super("burnRateF");

        hight = a;
        weight = b;
        Age = c;

    }

    @Override
    public double result() {
        return (10 * weight) + (6.25 * hight * 100) - (5 * Age) - 161;

    }

    public String toString() {
        return ("Your Burning Rate is : " + result());

    }
}

class burnRateM extends Opr {

    private double hight;
    private double weight;
    private double Age;

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }

    public burnRateM(double a, double b, double c) {
        super("burnRateM");

        hight = a;
        weight = b;
        Age = c;

    }

    @Override
    public double result() {

        return (10 * weight) + (6.25 * hight * 100) - (5 * Age) + 5;
    }

    public String toString() {
        return ("Your Burning Rate is : " + result());

    }
}
