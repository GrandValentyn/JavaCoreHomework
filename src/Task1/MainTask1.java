package Task1;

import java.util.Scanner;

public class MainTask1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("quit")) {
            switch (choice) {
                case "1":
                    isMonthExists();
                    break;
                case "2":
                    outputMonthWithSameSeason();
                    break;
                case "3":
                    outputMonthWithSameDays();
                    break;
                case "4":
                    outputMonthWithLessDays();
                    break;
                case "5":
                    outputMonthWithMoreDays();
                    break;
                case "6":
                    nextSeason();
                    break;
                case "7":
                    previousSeason();
                    break;
                case "8":
                    outputMonthWithEvenCountOfDays();
                    break;
                case "9":
                    outputMonthWithOddCountOfDays();
                    break;
                case "11":
                    isMonthHasEvenCountOfDays();
                    break;
            }
            choice = scanner.nextLine();
        }
    }
    public static void isMonthExists() {
        System.out.println("Input your month:");
        String monthStr = scanner.nextLine();
        boolean isMonthExists = false;
        for (Months month : Months.values()) {
            if (monthStr.equalsIgnoreCase(month.toString())) {
                isMonthExists = true;

            }
        }
        String isExist = isMonthExists ? "This month exists" : "This month not exists";
        System.out.println(isExist);
    }

    public static void outputMonthWithSameSeason() {
        System.out.println("Input your month:");

        String monthStr = scanner.nextLine();
        Months sameMonth = null;
        boolean isMonthExist = false;
        for (Months month : Months.values()) {
            if (monthStr.equalsIgnoreCase(month.name())) {
                isMonthExist = true;
                sameMonth = month;
            }
        }
        if (sameMonth == null) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Months with same season:");
        for (Months month : Months.values()) {
            if (month.getSeason().toString().equalsIgnoreCase(monthStr) && month.name() != sameMonth.name()) {
                System.out.println(month.name());
            }
        }
    }
    public static void outputMonthWithSameDays() {
        System.out.println("Input count of days in month:");
        int countOfDays = scanner.nextInt();
        System.out.println("Outputs months with same days:");
        for (Months month : Months.values()) {

            if (month.getDays() == countOfDays) {
                System.out.println(month.name());
            }
        }
    }

    public static void outputMonthWithLessDays() {
        System.out.println("Input count of days in month:");
        int countOfDays = scanner.nextInt();
        System.out.println("Outputs months with less days:");
        for (Months month : Months.values()) {

            if (month.getDays() < countOfDays) {
                System.out.println(month.name());
            }
        }
    }

    public static void outputMonthWithMoreDays() {
        System.out.println("Input count of days in month:");
        int countOfDays = scanner.nextInt();
        System.out.println("Outputs months with more days:");

        for (Months month : Months.values()) {

            if (month.getDays() > countOfDays) {
                System.out.println(month.name());
            }
        }
    }
    public static void nextSeason() {
        System.out.println("Input season:");
        String seasonStr = scanner.nextLine();
        Seasons nextSeason = null;
        boolean isSeasonExists = false;
        for (Seasons season : Seasons.values()) {
            if (seasonStr.equalsIgnoreCase(season.name())) {
                nextSeason = Seasons.values()[(season.ordinal() + 1) % 4];
                isSeasonExists = true;
            }
        }
        String output = isSeasonExists ? "Next season will be " + nextSeason.name() : "Season doesn't exists";
        System.out.println(output);
    }

    public static void previousSeason() {
        System.out.println("Input season:");
        String seasonStr = scanner.nextLine();
        Seasons previousSeason = null;
        boolean isSeasonExists = false;
        for (Seasons season : Seasons.values()) {
            if (seasonStr.equalsIgnoreCase(season.name())) {

                int newOrdinal = season.ordinal() == 0 ? 3 : season.ordinal() - 1;
                previousSeason = Seasons.values()[newOrdinal];
                isSeasonExists = true;
            }
        }
        String output = isSeasonExists ? "Previous season will be " + previousSeason.name() : "Season doesn't exists";
        System.out.println(output);
    }

    public static void outputMonthWithEvenCountOfDays() {
        System.out.println("Months with even count of days: ");
        for (Months month : Months.values()) {
            if (month.getDays() % 2 == 0) {
                System.out.println(month.name());
            }
        }
    }

    public static void outputMonthWithOddCountOfDays() {
        System.out.println("Months with odd count of days: ");
        for (Months month : Months.values()) {
            if (month.getDays() % 2 != 0) {
                System.out.println(month.name());
            }
        }
    }

    public static void isMonthHasEvenCountOfDays() {
        System.out.println("Input month:");
        String monthStr = scanner.nextLine();
        boolean hasEvenCount = false;
        for (Months month : Months.values()) {
            if (monthStr.equalsIgnoreCase(month.name().toString())) {
                hasEvenCount = isMonthHasEvenCountOfDayBool(month);
            }
        }
        String output = hasEvenCount ? String.format("This month %s has even count of days ", monthStr) : "This month hasn't even count of days";
    }
    public static boolean isMonthHasEvenCountOfDayBool(Months month) {
        if (month.getDays() % 2 == 0) {
            return true;
        }
        return false;

    }
}
