package sem2;

import java.util.ArrayList;

public class Daalgavar10 {
    
   public static void main (String args[])
   {
        int month = 3;
        int day = 23;
        ArrayList<String> zodiacSign = new ArrayList<String>();
        switch (month) {
        case 1:
            if (day < 20) {
                zodiacSign.add("Capricorn");
            } else {
                zodiacSign.add("Aquarius");
            }
            System.out.println("Aquarius");
            break;
        case 2:
            if (day < 18) {
                zodiacSign.add("Aquarius");
            } else {
                zodiacSign.add("Pisces");
            }
            System.out.println("Pisces");
            break;
        case 3:
            if (day < 21) {
                zodiacSign.add("Pisces");
            } else {
                zodiacSign.add("Aries");
            }
            System.out.println("Aries");
            break;
        case 4:
            if (day < 20) {
                zodiacSign.add("Aries");
            } else {
                zodiacSign.add("Taurus");
            }
            System.out.println("Taurus");
            break;
        case 5:
            if (day < 21) {
                zodiacSign.add("Taurus");
            } else {
                zodiacSign.add("Gemini");
            }
            System.out.println("Gemini");
            break;
        case 6:
            if (day < 21) {
                zodiacSign.add("Gemini");
            } else {
                zodiacSign.add("Cancer");
            }
            System.out.println("Cancer");
            break;
        case 7:
            if (day < 23) {
                zodiacSign.add("Cancer");
            } else {
                zodiacSign.add("Leo");
            }
            System.out.println("Leo");
            break;
        case 8:
            if (day < 23) {
                zodiacSign.add("Leo");
            } else {
                zodiacSign.add("Virgo");
            }System.out.println("Virgo");
            break;
        case 9:
            if (day < 23) {
                zodiacSign.add("Virgo");
            } else {
                zodiacSign.add("Libra");
            }
            System.out.println("Libra");
            break;
        case 10:
            if (day < 23) {
                zodiacSign.add("Libra");
            } else {
                zodiacSign.add("Scorpio");
            }
            System.out.println("Scorpio");
            break;
        case 11:
            if (day < 22) {
                zodiacSign.add("Scorpio");
            } else {
                zodiacSign.add("Sagittarius");
            }
            System.out.println("Sagittarius");
            break;
        case 12:
            if (day < 22) {
                zodiacSign.add("Sagittarius");
            } else {
                zodiacSign.add("Capricorn");
            }
            System.out.println("Capricorn");
            break;
        }
        
    }
}