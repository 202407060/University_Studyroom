// 생성자 오버로딩과 this 키워드 예제
// 일반 생성자: 매개변수가 있는 생성자

class Student {
    private String name;
    private int age;

    // 일반 생성자: 이름과 나이를 모두 받는 생성자
    public Student(String name, int age) {
        this.name = name; // this는 멤버 변수와 매개변수 구분
        this.age = age;
    }

    // 생성자 오버로딩: 이름만 받는 생성자
    public Student(String name) {
        this(name, 0); // this()로 두 번째 생성자 호출
    }

    // 생성자 오버로딩: 매개변수 없음
    public Student() {
        this("이름없음", 0); // this()를 사용해 다른 생성자 호출
    }

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class NewEx02 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 매개변수 없는 생성자
        Student s2 = new Student("홍길동"); // 이름만 받는 생성자
        Student s3 = new Student("김철수", 20); // 이름과 나이 모두 받는 일반 생성자

        s1.introduce(); // 이름: 이름없음, 나이: 0
        s2.introduce(); // 이름: 홍길동, 나이: 0
        s3.introduce(); // 이름: 김철수, 나이: 20
    }
}