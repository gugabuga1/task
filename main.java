import task001.task1;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String ...args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 2 3 4 5");
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

