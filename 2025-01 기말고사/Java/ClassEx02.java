// - 클래스와 객체의 개념
// 객체지향 프로그래밍은 객체를 조립하여 프로그램을 만드는 것이다.
// class 키워드를 사용하여 클래스를 구현하고 객체는 클래스의 인스턴스로
// 클래스 자체의 복사본이며, 특정 유형의 데이터를 유용하게 만드는 메서드와
// 변수로 구성된다.

class Person { // 클래스 선언: 사람(Person)을 표현하는 설계도
    // 멤버 변수(필드): 객체가 가질 데이터(속성)
    // 멤버 변수는 클래스 내부에 선언된 변수로, 객체의 상태(정보)를 저장함
    private String name; // 이름 (멤버 변수)
    private int age;     // 나이 (멤버 변수)

    // 생성자: 객체가 생성될 때 호출되어 멤버 변수 초기화
    public Person(String name, int age) {
        this.name = name; // 전달받은 name을 멤버 변수에 저장
        this.age = age;   // 전달받은 age를 멤버 변수에 저장
    }

    // 멤버 메서드: 객체가 수행할 수 있는 동작(기능)
    // 멤버 메서드는 클래스 내부에 정의된 함수로, 객체의 행동(기능)을 구현함
    public void introduce() {
        // 객체의 정보를 출력하는 메서드
        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}

public class ClassEx02 {
    public static void main(String[] args) {
        // Person 클래스의 객체(인스턴스) 생성
        Person person = new Person("홍길동", 25); // 생성자를 통해 이름과 나이 초기화
        person.introduce(); // 객체의 메서드 호출: 자기소개 출력
    }
}