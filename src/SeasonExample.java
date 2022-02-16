package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Locale.ROOT;

public class SeasonExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter month: ");
        String month = br.readLine();


        Season season;
        switch (month.toLowerCase(ROOT)) {
//            switch (month) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("No this month");
                season = null;
                //  }
                // System.out.println(season.toString());
                //}
        }

    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
