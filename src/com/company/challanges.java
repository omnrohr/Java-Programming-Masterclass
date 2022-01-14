package com.company;

public class challanges {
    public static void main(String [] args) {
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("your final score was: " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("your final score was: " + highScore);

//        int position = calculateHighScorePlayer(100);
//        displayHighScorePosition("obada", position);
//        checkNumber(1);
//        System.out.println(toMilesPerHour(75.114))
//        printConversion(75.114);
//        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        getDurationString(61,61);

    }
    public static void challenge1(){
        double one = 20.00;
        double tow = 80.00;
        double total = (one + tow) * 100;
        int remainder = (int)total % 40;
        boolean isNoRemainder = remainder ==0 ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder) System.out.println("Got some remainder: " + remainder);

        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        if (score >= 8000 && score <=10000){
            System.out.println("ABC");
        } else if (score >= 5000){
            System.out.println("DEF");
        } else {
            System.out.println("go to hill");
        }
    }
    public static int calculateScore(boolean gameOver,
                                     int score, int levelCompleted,
                                     int bonus) {
        if (gameOver){
            int finaleScore = score + (levelCompleted * bonus);
            finaleScore += 2000;
            return  finaleScore;
        }return -1;
    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " Manage to get into position\n" + position + " is your position");
    }
    public static int calculateHighScorePlayer(int score){
//        if (score>=1000) return 1;
//        else if (score >= 500 && score <1000) return 2;
//        else if (score < 500 && score >=100) return 3;
//        return 4;
        int position = 4;
        if (score >= 1000) position = 1;
        else if (score >=500) position = 2;
        else if (score >= 100) position = 3;
        return position;
    }
    public static void checkNumber (int num){
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");

    }
    public static int toMilesPerHour(double kilometersPerHour){
//        double result = -1;
//        if (kilometersPerHour > 0){
//            result = (kilometersPerHour / 1.609344);
//        }
//
//        return (int)Math.round(result);

        if (kilometersPerHour < 0) return -1;
        System.out.println(Math.round(kilometersPerHour / 1.609344));
        return (int) Math.round(kilometersPerHour / 1.609344);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour >0) System.out.println("Invalid Value");
        int result = (int)Math.round(kilometersPerHour / 1.609);
        System.out.println(kilometersPerHour + "km/h = " + result + "mi/h.");
    }
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || (inches <0 || inches >12 )) return -1;
        else return (calcFeetAndInchesToCentimeters(inches) + feet) * 12 * 2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0)  return -1;
        else return  inches / 12;
    }
//    Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
//
//    You should validate that the first parameter minutes is >= 0.
//
//    You should validate that the 2nd parameter seconds is >= 0 and <= 59.
//
//    The method should return پgInvalid valueپh in the method if either of the above are not true.
//
//    If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format پgXXh YYm ZZsپh where XX represents a number of hours, YY the minutes and ZZ the seconds.
//
//    Create a 2nd method of the same name but with only one parameter seconds.
//
//    Validate that it is >= 0, and return پgInvalid valueپh if it is not true.
//
//    If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//
//    Call both methods to print values to the console.
//
//            Tips:
//    Use int or long for your number data types is probably a good idea.
//	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
//    Methods should be static as we have used previously.
//
//            Bonus:
//    For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
//    Create a new console project and call it SecondsAndMinutesChallenge
    public static void getDurationString (int minutes, int seconds){
        if (minutes <0 || seconds <0) {
            System.out.println("Invalid value");
        } else {
            int leftSeconds = seconds % 60;
            int leftMinutes = minutes % 60 + seconds /60;
            int hours = minutes/60;
            System.out.println("0"+hours + "h 0" + leftMinutes + "m 0" + leftSeconds + "s");

        }
    }
}
