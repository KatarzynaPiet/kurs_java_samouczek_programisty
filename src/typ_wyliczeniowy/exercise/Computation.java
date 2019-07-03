package typ_wyliczeniowy.exercise;

public enum Computation {

    MULTIPLICATION {
        public double perform(double x, double y){
            return x * y;
        }
    },
    DIVISION {
        public double perform(double x, double y){
            return x / y;
        }
    },
    ADDITION {
        public double perform(double x, double y){
            return x + y;
        }
    },
    SUBTRACTION {
        public double perform(double x, double y){
            return x - y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String args[]){
        System.out.println("3.5 * 2 = " + Computation.MULTIPLICATION.perform(3.5, 2));
        System.out.println("-9 : 3 = " + Computation.DIVISION.perform(-9, 3));
        System.out.println("6 + 2.5 = " + Computation.ADDITION.perform(6, 2.5));
        System.out.println("6 - (-2.5) = " + Computation.SUBTRACTION.perform(6, -2.5));
    }

}
