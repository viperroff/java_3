
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
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        //1.6.3



    }
}