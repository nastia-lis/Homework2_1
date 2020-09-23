package geekbrains.homework;

public enum DayOfWeek {
    SUNDAY(0), MONDAY(8), TUESDAY(8), WEDNESDAY(8), THURSDAY(8), FRIDAY(8), SATURDAY(0);
    private int workingHours;

    DayOfWeek(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

}
