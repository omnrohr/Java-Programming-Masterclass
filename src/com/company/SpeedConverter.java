package com.company;

public class SpeedConverter {
    public static void main(String [] args) {
//        System.out.println(toMilesPerHour(75.114));
//        printConversion(75.114);
//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-1024);
//        printMegaBytesAndKiloBytes(5000);
//        System.out.println(shouldWakeUp(true,1));
//        System.out.println(shouldWakeUp(false,2));
//        System.out.println(shouldWakeUp(true,8));
//        System.out.println(shouldWakeUp(true,-1));
//        System.out.println(shouldWakeUp(true,25));
//        System.out.println(shouldWakeUp(false,0));
//        System.out.println(isLeapYear(1));
//        System.out.println(isLeapYear(4));
//        System.out.println(isLeapYear(50));
//        System.out.println(isLeapYear(100));
//        System.out.println(isLeapYear(400));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(hasTeen(9,99,19));
//        System.out.println(hasTeen(23,15,42));
//        System.out.println(hasTeen(22,23,34));
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5, 4));
        System.out.println(area(-1, 4));











    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) return -1;
        System.out.println(Math.round(kilometersPerHour / 1.609344));
        return Math.round(kilometersPerHour / 1.609344);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) System.out.println("Invalid Value");
        else {
            int result = (int) Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
    if (kiloBytes < 0) System.out.println("Invalid Value");
    else {
        int kb = kiloBytes % 1024;
        int mb = kiloBytes / 1024; //no need to round the print method return int directly
        System.out.println(kiloBytes+" KB = "+mb+" MB and "+kb+" KB");
        System.out.println(kiloBytes+" KB = "+kiloBytes / 1024+" MB and "+kiloBytes % 1024+" KB");
    }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (hourOfDay >23 || hourOfDay <0) return false;
//        if (hourOfDay >8 && hourOfDay <22 && barking) return false;
//        else if (hourOfDay >8 && hourOfDay <22 && !barking) return true;
//        else if (hourOfDay <8  && barking) return true;
//        else return false;
//        if (barking && (hourOfDay <8 || hourOfDay >22)) return true;
//        return (barking && ((hourOfDay >0 || hourOfDay<8) || (hourOfDay >22 || hourOfDay<23));
//        return (hourOfDay <=23 && hourOfDay>=0) && (barking && (hourOfDay<8 || hourOfDay >22));
        return (hourOfDay >=0 && hourOfDay <= 23) && (barking && (hourOfDay < 8 || hourOfDay > 22));

    }

        public static boolean shouldWakeUp1(boolean barking, int hourOfDay) {
            if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
                return false;
            }
            return true;
        }

    public static boolean isLeapYear(int year){
        return (year >=1 && year <=9999) && year%4==0 && (year % 400 ==0 || year % 100 !=0);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return (int)(1000*num1-1000*num2) ==0;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        return num1+num2 == num3;
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        return num1 >=13 && num1 <=19 || num2 >=13 && num2 <=19 || num3 >=13 && num3 <=19;
    }
    public static boolean isTeen(int num1){
        return num1>=13 && num1 <=19;
    }
    public static double area(double radius){
        return (radius>=0) ? radius * radius * Math.PI: -1;
    }
    public static double area(double x, double y){
        return (x >0 && y >0) ? x*y : -1;
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440 ;


            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static void printEqual(int a, int b, int c){
        if (a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        } else if (a==b && b==c){
            System.out.println("All numbers are equal");
        } else if (a!=b && a!=c && b!=c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        }
        else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        }
        return false;
    }
}
