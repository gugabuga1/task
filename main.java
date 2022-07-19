import task001.task1;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String ...args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("3*1=3\n" +
                    "3*2=6\n" +
                    "3*3=9\n" +
                    "3*4=12\n" +
                    "3*5=15\n" +
                    "3*6=18\n" +
                    "3*7=21\n" +
                    "3*8=24\n" +
                    "3*9=27\n" +
                    "3*10=30");
            input = sc.nextLine();
        }
        String[] numbers = input.split("\\s");
        int i[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            i[j] = Integer.valueOf(numbers[j]);
        }
        System.out.println(Arrays.toString(i));



    }

}

