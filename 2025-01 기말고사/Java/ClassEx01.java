// - 객체 지향 프로그래밍의 개념
// 프로그래밍에서 객체를 사용하는 것을 의미하며 데이터와 메서드를 포함하는 '객체'개념에 기반한 프로그래밍임.
// 프로그래의 유연성을 향상하고 유지-관리의 가능성을 높임.
// 데이터 및 데이터의 동작을 단일 위치에 통합하여 프로그램 작동 방식을 더 쉽게 이해할 수 있음.

// - 객체 지향 프로그래밍의 장점
// 개발 속도 향상과 소프트웨어의 유지-관리 향상함.
// 소프트웨어 개발의 생산성 향샹하며 개발 비용 절감됨.

// - 객체 지향 프로그래밍의 구성 요소
// 클래스, 객체, 상속, 캡슐화, 다형성 등이 있음.
// 클래스 : 객체를 생성하기 위한 템플릿으로 속성과 메서드를 포함한 정의의 틀이다.
// 객체 : 클래스의 인스턴스로, 클래스에서 정의한 속성과 메서드를 가진 실제 데이터 단위이다.
// 상속 : 기존 클래스의 속성과 메서드를 새로운 클래스가 물려받는 기능으로 코드 재사용을 가능하게 한다.  
// 캡슐화 : 객체의 속성과 메서드를 하나로 묶고, 외부에서 직접 접근하지 못하도록 보호하는 기능이다.
// 다형성 : 동일한 인터페이스를 사용하여 서로 다른 객체가 다른 방식으로 동작할 수 있는 기능이다.

abstract class Animal { // 추상 클래스: 동물의 공통적인 특징을 정의
    protected String name; // protected: 자식 클래스에서 접근 가능

    public Animal(String name) { // 생성자: 이름 초기화
        this.name = name;
    }

    // 추상 메서드: 자식 클래스에서 반드시 구현해야 함
    public abstract void makeSound();

    // 캡슐화: private/protected 필드를 외부에서 안전하게 접근하도록 getter 제공
    public String getName() {
        return name;
    }
}

// 클래스 및 상속
class Dog extends Animal { // Animal 클래스를 상속받는 Dog 클래스
    public Dog(String name) {
        super(name); // 부모 클래스(Animal)의 생성자 호출
    }

    // 다형성: 부모의 추상 메서드를 오버라이딩하여 강아지 소리 구현
    @Override
    public void makeSound() {
        System.out.println(name + "가(이) 멍멍!");
    }
}

class Cat extends Animal { // Animal 클래스를 상속받는 Cat 클래스
    public Cat(String name) {
        super(name);
    }

    // 다형성: 부모의 추상 메서드를 오버라이딩하여 고양이 소리 구현
    @Override
    public void makeSound() {
        System.out.println(name + "가(이) 야옹!");
    }
}

public class ClassEx01 {
    public static void main(String[] args) {
        // 객체 생성 (객체와 다형성)
        Animal myDog = new Dog("바우");   // Dog 객체를 Animal 타입으로 참조
        Animal myCat = new Cat("냐옹");  // Cat 객체를 Animal 타입으로 참조

        // 다형성: 같은 타입(Animal)으로 서로 다른 동작 수행
        myDog.makeSound(); // Dog의 makeSound() 실행
        myCat.makeSound(); // Cat의 makeSound() 실행

        // 캡슐화된 필드 접근 (getter 사용)
        System.out.println("내 애완동물 이름: " + myDog.getName());
        System.out.println("내 애완동물 이름: " + myCat.getName());
    }
}

// 출력 예시:
// 바우가(이) 멍멍!
// 냐옹가(이) 야옹!
// 내 애완동물 이름: 바우
// 내 애완동물 이름: 냐옹