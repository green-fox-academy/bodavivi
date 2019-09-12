public class CodingHours {
    public static void main(String[] args) {
        int averageCodingHoursDaily = 6;
        int semestersWeekLong = 17;
        int daysPerWeek = 7;
        int workdays = 5;
        int hourPerDay = 24;


        System.out.println(averageCodingHoursDaily * semestersWeekLong * workdays);

        double averageWorkHoursWeekly = 52;
        double b = semestersWeekLong;
        double c = hourPerDay;
        double d = daysPerWeek;


        System.out.println((((averageWorkHoursWeekly) / (c * d)) * 100) + " %");
    }
}
