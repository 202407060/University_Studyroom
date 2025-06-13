// - 2차원 배열
// 2차원 배열 선언
// 다차원 배열은 1차원 배열과 매우 유사하지만, 행과 열이 여러 개임
// 2차원 배열은 데이터가 행과 열에 저장되는 표 형식으로 데이터를 나타냄

// - 2차원 배열을 이용하여 과목 점수의 평균 구하기
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        // 2차원 배열 선언 방법
        // int[][] Array = new int [3][4];
        // 자료형[][] 배열명 = new 자료형 [행 크기][열 크기];

        // 2차원 배열 초기화
        // int Array[][] = {{1,2,3,4},{5,6,7,8}};
        // 자료형 배열명[][] = {{값1,값2,값3},{값4,값5,값6}};

        double[][] marks = new double[2][3]; // 2차원 배열 선언 (2명의 학생, 3개의 열: 국어, 수학, 평균)

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("학생번호" + (i + 1));
            System.out.print("국어 점수 : ");
            marks[i][0] = s.nextDouble(); // 국어 점수 입력

            System.out.print("수학 점수 : ");
            marks[i][1] = s.nextDouble(); // 수학 점수 입력

            marks[i][2] = (marks[i][0] + marks[i][1]) / 2; // 평균 점수 계산
        }

        for (int i = 0; i < 2; i++){
            System.out.println("학생번호" + (i + 1));
            System.out.print("국어 : " + marks[i][0] + " ");
            System.out.print("수학 : " + marks[i][1] + " ");
            System.out.println("평균 : " + marks[i][2]); // 평균 점수 출력
        }
    }
}

// 출력 :
// 학생번호1
// 국어 점수 : 90
// 수학 점수 : 80
// 학생번호2
// 국어 점수 : 70
// 수학 점수 : 60
// 학생번호1
// 국어 : 90.0 수학 : 80.0 평균 : 85.0
// 학생번호2
// 국어 : 70.0 수학 : 60.0 평균 : 65.0

// 종료 코드 0(으)로 완료된 프로세스