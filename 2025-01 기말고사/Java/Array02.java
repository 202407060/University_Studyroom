// - 1차원 배열을 이용하여 문자열 저장하고 출력하기
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        String[] Ary; // 문자형(문자열) 배열 선언
        Ary = new String[3]; // 배열에 3개의 문자열을 저장할 공간 할당

        Scanner sc = new Scanner(System.in);
        System.out.println("3개의 문자열을 입력하세요:");
        for (int i = 0; i < Ary.length; i++) {
            Ary[i] = sc.nextLine(); // 문자열 입력 받아 배열에 저장
        }
        System.out.println("입력한 문자열은:");
        for (int i = 0; i < Ary.length; i++) {
            System.out.print(Ary[i] + " "); // 배열에 저장된 문자열 출력
        }
    }
}

// 출력 :
// 3개의 문자열을 입력하세요:
// Hello
// Java
// !
// 입력한 문자열은:
// Hello Java ! 
// 종료 코드 0(으)로 완료된 프로세스