public class Time {
    private int seconds;

    public Time(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Количество секунд не может быть отрицательным.");
        }
        this.seconds = seconds % (24 * 60 * 60);
    }

    public int getHours() {
        return seconds / 3600;
    }

    public int getMinutes() {
        return (seconds / 60) % 60;
    }

    public int getSeconds() {
        return seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}