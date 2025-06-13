// 생성자(constructor)와 new 연산자 예제
// 생성자: 객체가 생성될 때 호출되는 메서드로, 객체의 초기화를 담당함
// 기본 생성자: 매개변수가 없는 생성자 (명시하지 않으면 컴파일러가 자동으로 추가)
// new 연산자: 클래스로부터 객체(인스턴스)를 생성할 때 사용

// abstract: 추상 클래스/메서드에 사용, 직접 객체 생성 불가(상속 필요)
// final: 클래스(상속 금지), 메서드(오버라이딩 금지), 변수(값 변경 금지)에 사용
// static: 클래스 변수/메서드에 사용, 객체 생성 없이 클래스명으로 접근 가능

class Car {
    private String model; // 멤버 변수

    // 기본 생성자
    public Car() {
        this.model = "기본모델";
    }

    // 매개변수가 있는 생성자
    public Car(String model) {
        this.model = model;
    }

    // static 메서드: 객체 생성 없이 호출 가능
    public static void staticInfo() {
        System.out.println("이것은 자동차 클래스의 static 메서드입니다.");
    }

    // final 메서드: 오버라이딩 불가
    public final void showModel() {
        System.out.println("자동차 모델: " + model);
    }
}

// abstract 클래스 예시 (직접 객체 생성 불가)
abstract class Animal {
    public abstract void sound(); // 추상 메서드
}

public class NewEx01 {
    public static void main(String[] args) {
        // new 연산자를 사용하여 객체 생성
        Car car1 = new Car(); // 기본 생성자 호출
        Car car2 = new Car("스포츠카"); // 매개변수 생성자 호출

        car1.showModel(); // 자동차 모델: 기본모델
        car2.showModel(); // 자동차 모델: 스포츠카

        Car.staticInfo(); // static 메서드 호출

        // Animal a = new Animal(); // 오류! 추상 클래스는 객체 생성 불가
    }
}


// 출력:
// 자동차 모델: 기본모델
// 자동차 모델: 스포츠카
// 이것은 자동차 클래스의 static 메서드입니다.
// (추상 클래스는 객체 생성 불가, 오류 발생)

// 종료 코드 0(으)로 완료된 프로세스