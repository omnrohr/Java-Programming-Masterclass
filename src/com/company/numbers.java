package com.company;

public class numbers {
    public static void main(String[] args)
    {
        int latterlyNumber = 65;
        char charNumber = 65;
        char latterlyCharacter = 'D';
        char uniCodeChar = '\u0044';
        char arUniCodeChar = '\u0637';
        byte intUniCodeChar = 'A';
        System.out.println("only a number: " + latterlyNumber
                + "\n a number with char type: " + charNumber +
                "\n and a normal letter: "+  latterlyCharacter +
                " \n a unicode number: " + uniCodeChar + "\n"
                + arUniCodeChar + "\n a char with int type: " + intUniCodeChar);
    }
}
