// - 2차원 배열을 이용하여 두 행렬의 합 구하기

// 2차원 배열: 행과 열로 이루어진 배열로, 표 형태의 데이터를 저장할 때 사용
// 예시: int[][] arr = new int[행][열];

// Array04.java
public class Array04{
    public static void main(String[] args) {
        int rows = 2, columns = 3; // 행과 열의 개수 지정

        // 첫 번째 2차원 배열(행렬) 선언 및 초기화
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 두 번째 2차원 배열(행렬) 선언 및 초기화
        int[][] secondMatrix = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // 두 행렬의 합을 저장할 2차원 배열 생성
        int[][] sum = new int[rows][columns];

        // 각 행과 열을 순회하며 두 행렬의 같은 위치 값을 더함
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // 결과 행렬(합)을 출력
        System.out.println("두 행렬의 합:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
        System.out.println();
    }
}

// 출력:
// 두 행렬의 합:
// 8 10 12 
// 14 16 18 