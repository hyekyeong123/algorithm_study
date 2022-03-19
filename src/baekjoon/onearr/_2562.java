package baekjoon.onearr;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i<9; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i<9; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}
