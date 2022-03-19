package baekjoon.onearr;

import java.util.ArrayList;
import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<10; i++){
            int temp = scanner.nextInt() % 42;

            // 동일한 값이 없을때에만 입력
            if(!arr.contains(temp)){
                arr.add(temp);
            }
        }
        System.out.println(arr.size());
    }
}
