package class_and_method.class_challenge_date;

public class Date {
    int day;
    int month;
    int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String dateFormattedToBr() {
        String formattedDay;
        String formattedMonth;

        if (this.day < 10) {
            formattedDay = String.format("0%d", this.day);
        } else {
            formattedDay = String.format("%d", this.day);
        }

        if (this.month < 10) {
            formattedMonth = String.format("0%d", this.month);
        } else {
            formattedMonth = String.format("%d", this.month);
        }
        return String.format("%s/%s/%s", formattedDay, formattedMonth, this.year);
    }
}
