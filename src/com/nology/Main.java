package com.nology;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static String pigLatinize(String input) {

        String[] words = input.split("\\s+");
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            if (vowels.contains(word.charAt(0))) {
                output.append(word).append("way");
            }
            else {
                for (int i = 0; i < word.length(); i++) {
                    if (vowels.contains(word.charAt(i))) {
                        output.append(word.substring(i, word.length()))
                                .append("-")
                                .append(word.substring(0,i))
                                .append("ay ");
                        break;
                    }
                }
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(pigLatinize("pig"));
        System.out.println(pigLatinize("pig latin"));
        System.out.println(pigLatinize("banana"));
        System.out.println(pigLatinize("matt"));
        System.out.println(pigLatinize("will"));
        System.out.println(pigLatinize("ash"));
        System.out.println(pigLatinize("robert"));
        System.out.println(pigLatinize("ollie"));
    }
}
