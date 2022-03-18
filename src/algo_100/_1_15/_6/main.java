package algo_100._1_15._6;

import java.util.ArrayList;
import java.util.List;

// 나의 풀이

public class main {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        List aList = new ArrayList<Integer>();
        List bList = new ArrayList<Integer>();


        // 최대공약수 : 어떤 수로 나눴을때 가장 큰수,
        // 먼저 각각의 약수를 구한다음에 배열에 넣기
        for (int i =1; i<12; i++){
            // i는 12가 될 수 없다.
            if(b % i == 0){
                bList.add(i);
            }
            if(a % i == 0){
                aList.add(i);
            }
        }

        // 각 배열의 공통된 수 중에 가장 큰수
        bList.retainAll(aList);
        int max = 0;
        for (Object c : bList){
            if(max < (int) c){
                max = (int) c;
            }
        }
        System.out.println(max);
    }
}
