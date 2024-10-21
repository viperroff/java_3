public class Human {
    private String name;
    private int height = 170;

    public Human(String name, int height){
        this.name = name;
        if(height < 10 || height > 300){
            throw new ArithmeticException("Долбоеб?");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "New User with name " + name + "and height " + height;
    }
}
