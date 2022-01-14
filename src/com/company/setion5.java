package com.company;


import java.util.Scanner;

public class setion5 {

    public static void main(String[] args) {

//        printNumberInWord(-1);
//        printNumberInWord(0);
//        printNumberInWord(1);
//        printNumberInWord(2);
//        printNumberInWord(3);
//        printNumberInWord(4);
//        printNumberInWord(5);
//        printNumberInWord(6);
//        printNumberInWord(7);
//        printNumberInWord(8);
//        printNumberInWord(9);
//        System.out.println(isLeapYear(2017));
//        System.out.println(calculateInterest(1000, 2.0f));
//        calculateInterest(1000, 1,3);
//        System.out.println(isPrimeNumber(18));
//        primeList(19,50);
//        numbersDividedBy3and5(1, 1000);
//        System.out.println(sumOdd(1,11));
//        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
//        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
//        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
//        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32023));
//        System.out.println(isPalindrome(-222));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(getEvenDigitSum(22536));
//        System.out.println(hasSharedDigit(21,12));
//        System.out.println(hasSameLastDigit(9, 99, 999));
//        System.out.println(getGreatestCommonDivisor1(81,153));
//        printFactors(6);
//        System.out.println(isPerfectNumber(-1));
//        System.out.println(getLargestPrime(45));
//        printSquareStar(5);
//        printSquareStar2(-5);
//        getUserName();
//        sumTenInputs1();
//        minMaxChallenge();
        inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4,2.1,2.5,1));
    }


    private static void printDayOfTheWeek(int day) {

//        if(day == 0) {
//            System.out.println("Sunday");
//        } else if(day == 1) {
//            System.out.println("Monday");
//        } else if(day == 2) {
//            System.out.println("Tuesday");
//        } else if(day == 3) {
//            System.out.println("Wednesday");
//        } else if(day == 4) {
//            System.out.println("Thursday");
//        } else if(day == 5) {
//            System.out.println("Friday");
//        } else if(day == 6) {
//            System.out.println("Saturday");
//        } else {
//            System.out.println("Invalid day");
//        }

        switch(day) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void printNumberInWord(int number) {


        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
    public static boolean isLeapYear(int year){
        return (year<1||year>=9999) ? false: ((year%4==0)&&(year%100!=0))||(year%400==0);
    }

    public static int getDaysInMonth(int month, int year){
        return ((month<1)||(month>12)||(year<1)||(year>9999))? -1: (isLeapYear(year)&&month==2)? 29: (month==11 || month==4 || month==6 || month==9)? 30: (month==2)? 28: 31;
    }
    public static float calculateInterest(int amount, float interestRate){
        return amount*interestRate/100;
    }
    public static void calculateInterest(int amount, int startInterestRate, int limitInterestRate){
            int i =1;
        for (;;) {
            System.out.println("10,000 at " + i + "% interest " + String.format("%.2f",calculateInterest(amount, i)));
            i++;
            if (i >5) break;
        }
    }
    public static boolean isPrimeNumber(int num){
        if (num <2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++ ){
                if (num % i == 0) return false;
            } return true;
        }
    }
    public static void primeList(int start, int limit){
        if (start>=limit|| start <2 || limit <2) System.out.println("invalid values");
        int count = 0;
        for (int i = start; i<= limit; i++){
                if(isPrimeNumber(i)) {
                    count++;
                    System.out.println(i);
                    if (count == 3)break;
                }
        }
    }
    public static void numbersDividedBy3and5(int start, int limit){
        int sum=0;
        int total =0;
        for (int i= start; i<=limit; i++){
            if (i%3==0 && i%5==0){
                total += i;
                sum++;
                System.out.println(i);
                if (sum ==5)break;
            }

        }System.out.println(total);

    }
    public static boolean isOdd(int number){
        if (number>0 && number%2 !=0)return true;
        else return false;
    }
    public static int sumOdd(int start, int end){
        int total = 0;
        if (start <=0 || end <=0 || end <=start)return -1;
        else {
            for (int i = start; i <= end; i++)
                if (isOdd(i)) total += i;

        }return total;
    }
    public static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }
        int sum = 0;
        while (number>0){
            int digit = number%10;
            sum += digit;
            number /=10;
        }return sum;
    }
    public static boolean isPalindrome(int number){
        if (number<0) number*=-1;
        int rNumber = 0;
        int temp = number;
        while (temp>0){
            rNumber *=10;
            int digit = temp%10;
            rNumber += digit;
            temp /=10;
        }

        if (number == rNumber) return true;
        else return false;
    }
    public static int sumFirstAndLastDigit(int number){
        if (number <=0) return -1;
        int firstDigit = number%10;
        while (number>9){
            number /= 10;
        }return number + firstDigit;
    }
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;
        int sum = 0;
        while (number>0){
            int digit = number%10;
            if (digit%2 ==0){
                sum += digit;
                number/= 10;
                continue;
            }
            number /=10;
        }return sum;
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1<10 || num1 >99||num2<10 || num2 >99)return false;
        return (num1/10 == num2/10) || (num1%10 == num2 % 10)||(num1/10 == num2%10)||(num1%10==num2/10);
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 < 10 || num1 > 1000 || num2 <9 || num2 >1000 || num3 < 10 || num3 > 1000) return false;
        return (num1%10 == num2%10 || num1%10 == num3%10 || num2%10 == num3%10);
    }
    public static boolean isValid(int num){
        if(num >9 && num < 1001)return true;
        return false;
    }
    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 <10 || num2 <10)return -1;
        int minimum = num1 > num2 ? num2 : num1;
        while (minimum > 1){
            if (num1 % minimum ==0 && num2 % minimum == 0)break;
            minimum--;
        }return minimum;
    }
    public static int getGreatestCommonDivisor1(int first, int second) { //81, 153

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
    public static void printFactors(int number){
        if (number<1) System.out.println("Invalid Value");
        int factor = 1;
        while (factor <= number){
            if (number%factor == 0) System.out.println(factor);
            factor++;
        }
    }
    public static boolean isPerfectNumber(int number){
        if (number <1) return false;
        int sum = 0;
        int factor= number<2 ? number:number/2;
        while (factor>0){
            if(number%factor ==0)sum+=factor;
            factor--;
        }
        return sum==number;
    }
    public static boolean isPerfectNumber1(int number) {

        int sumOfProperDivisors = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number / 2; i += increment)
            if (number % i == 0)
                sumOfProperDivisors += i;

        return sumOfProperDivisors == number && number > 1;
    }
    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        return ((bigCount >= 0 && smallCount >= 0 && goal > 0) && (goal <= 5*bigCount + smallCount) && (smallCount >= goal%5));
    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = number/2; i > 1; i--) {
            if ((number % i) == 0) {
                number = i;
            }
        }
        return number;
    }
    public static int getLargestPrime1(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1) System.out.print("1"); // top and bottom rows
                    else if(column==0) System.out.print("2"); // left column
                    else if(column==number-1) System.out.print("3"); // right column
                    else if(column==row) System.out.print("4"); // diagonal down to right
                    else if(column==number-1-row) System.out.print("5"); // diagonal down to left
                        // alternative to lines 7-11 // if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");  // empty space between numbers
                }
                System.out.println(""); // puts a return to the row
            }
        }
    }
    public static void printSquareStar1(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
    public static void printSquareStar2(int num){
        if (num < 5) System.out.println("invalid");
        for (int s =0; s<num; s++){
            for (int a =0; a<num;a++){
                if(s==0 || s==num-1) System.out.print("*");
                else if(a==0) System.out.print("*");
                else if(a==num-1) System.out.print("*");
                else if(a==s) System.out.print("*");
                else if(a==num-1-s) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
    public static void getUserName(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;
            scanner.nextLine();
            System.out.println("enter your name: ");
            String name = scanner.nextLine();
            if (age >0 && age<100)
                System.out.println("So your name is: " + name + " , and your age is: " + age);
            else System.out.println("Invalid age!!!");
        }else System.out.println("Invalid age!!!");
        scanner.close();
    }
    public static void sumTenInputs(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i <=10; i++){
            System.out.println("enter number #" + i + " :");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int input = scanner.nextInt();
                if (input >=0){
                    sum += input;
                }else {
                    System.out.println("invalid input the numbers should be >=0!!!");
                    scanner.nextLine();
                    i--;
                }
            }else {
                System.out.println("invalid input!!!");
                scanner.nextLine();
                i--;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
    public static void sumTenInputs1(){
        Scanner scanner = new Scanner(System.in);
        int counter =1;
        int sum =0;
        while (counter<=11){
            System.out.println("input number #" + counter + " :");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                sum+= scanner.nextInt();
                counter++;
            }else System.out.println("invalid input!!!");
//            if (counter ==11) break;
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
    public static void minMaxChallenge(){
        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number # "+counter+" :" );
            boolean isAnINt = scanner.hasNextInt();
            if(isAnINt){
                int input = scanner.nextInt();
                if (input > max) max = input;
                if (input < min) min = input;
                counter++;
                } else {
                System.out.println("Invalid input");
                scanner.nextLine();
                }if (counter == 11)break;
            }scanner.close();
    }
    public static void minMaxNum(){
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min= "+ min + ", max= " + max);
        scanner.close();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number: ");
            boolean isAnIint = scanner.hasNextInt();
            if (isAnIint){
                sum += scanner.nextInt();
                counter++;
            }else break;
            scanner.nextLine();
        }
        System.out.println("SUM = "+ sum + " AVG = " + Math.round((double)sum/counter));
        scanner.close();
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }
}
