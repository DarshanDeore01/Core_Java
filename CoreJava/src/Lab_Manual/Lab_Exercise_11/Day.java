package Lab_Manual.Lab_Exercise_11;

public enum Day {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), 
    THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int dayNumber;

    // Constructor to set the day number
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Method to get the day number
    public int getDayNumber() {
        return this.dayNumber;
    }
}
