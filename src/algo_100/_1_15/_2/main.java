package algo_100._1_15._2;

public class main {
    public static void main(String[] args) {

        // 첫번째 방법 : 배열 사용시
        int [] arr = new int[10];
        // An = An-1+ An-2
        // a1 = 1, a2 = 1

        // 초기화화
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i< 10; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 1; i< 10; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        // 2번째 방법 : 배열 미사용시
        int prevPrevNum = 1; // An-2
        int prevNum = 1; // An-1
        System.out.print(prevPrevNum+" ");
        System.out.print(prevNum+" ");
        for (int i = 1; i< 10; i++){
            int curNum = prevPrevNum+prevNum;
            System.out.print(curNum+ " ");

            prevPrevNum = prevNum;
            prevNum = curNum;
        }

    }
}
