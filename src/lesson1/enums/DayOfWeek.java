package lesson1.enums;

public enum DayOfWeek {
    Monday("40"), Tuesday("32"), Wednesday("24"),
    Thursday("16"), Friday("8"),
    Saturday("Сегодня выходной"), Sunday("Сегодня выходной");

    private String workingHours;

    DayOfWeek(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }

}
