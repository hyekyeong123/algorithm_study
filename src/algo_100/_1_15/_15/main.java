package algo_100._1_15._15;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Student st1 = new Student("손오공","1682");
        Student st2 = new Student("저팔계","1672");
        Student st3 = new Student("사오정","1818");

        ArrayList <Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student student : list){
            System.out.println(student.getName());
            System.out.println(student.getNo());
        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();

        while(true){
            System.out.println("계속 검색을 하고 싶으면 y, 종료하고 싶으면 n을 입력해주세요.");
            String input = scanner.next();
            if(input.equals("y")){
                System.out.println("학생 이름을 입력해주세요.");
                String name = scanner.next();

                boolean flag = false;
                for (Student student : list){
                    if(name.equals(student.getName())){
                        System.out.println("해당하는 학생의 학번은 "+student.getNo()+"입니다.");
                        result.add(student.getNo());
                        flag = true;
                    }
                }

                if(!flag){
                    System.out.println("없는 학생 이름입니다."); // 한번도 if문에 해당한적 없음
                }
            }else if(input.equals("n")){
                break;
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}

