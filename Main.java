
public class Main {
    public static void main(String[] args) {

        //1.6.1
        try{
            House house1 = new House(0);
            System.out.println(house1);
        }catch (IllegalArgumentException e){
            System.out.println("Исключение: " + e.getMessage());
        }


        //1.6.2

        try {
            Time time1 = new Time(3600);
            System.out.println(time1);

            Time time2 = new Time(90000);
            System.out.println(time2);

            Time time3 = new Time(-3600);
            System.out.println(time3);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        //1.6.3

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(-3, 4);
        try {
            Fraction f3 = new Fraction(5, 0);
            System.out.println("f3: " + f2);
            System.out.println(f1.div(0));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println(f1.sum(f2));
        System.out.println(f1.minus(f2));
        System.out.println(f1.multiplication(f2));
        System.out.println(f1.div(f2));


        //1.6.4



    }
}