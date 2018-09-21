package com.company;

public class Main {

    public static void main(String[] args) {
        String input = "abcdefg";
        int index = 0;
        String odd = "";
        String even = "";
        while(index < input.length())
        {
            if(index%2 == 0)
            {
                even = even + input.substring(index,index + 1);
            }
            else
            {
                odd = odd + input.substring(index,index + 1);
            }
            index++;
        }
        System.out.println("Input = "+ input);
        System.out.println("oddCharacters = " + odd);
        System.out.println("evenCharacters = " + even);
        System.out.println("evenFirstoddSecond = " + even + odd);
    }
}
