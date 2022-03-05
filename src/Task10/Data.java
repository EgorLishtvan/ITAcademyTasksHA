package Task10;

public class Data {
    int day = 31;
    int month = 12;
    int year = 2020;

    public void NextDate() {
        if (month == 12 & day == 31) {
            year += 1;
            month = 1;
            day = 1;
            System.out.println("Next data is: \n month: " + month + "\n day: " + day + "\n year: " + year);
        } else if (day > 0 & day < 32 & month > 0 & month < 13) {
            day += 1;
            month += 1;

            System.out.println("Next data is: \n month: " + month + "\n day: " + day + "\n year: " + year);
        } else {
            System.out.println("Incorrect data");
        }

    }
}
