public class House {
    private int floors = 1;

    public House(int floors) {
        if(floors < 1){
            throw new IllegalArgumentException("неположительное количество этажей");
        }
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "Дом с " + floors + " этажами";
    }
}