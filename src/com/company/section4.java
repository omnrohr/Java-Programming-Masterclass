package com.company;
public class section4 {
        public static int toMilesPerHour(double kilometersPerHour){
            if (kilometersPerHour < 0) return -1;
            System.out.println(Math.round(kilometersPerHour / 1.609344));
            return (int) Math.round(kilometersPerHour / 1.609344);
        }
        public static void printConversion(double kilometersPerHour){
            if (kilometersPerHour >0) System.out.println("Invalid Value");
            int result = (int)Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + "km/h = " + result + "mi/h.");
        }

}
