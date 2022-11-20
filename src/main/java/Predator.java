interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Sample {
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번
        //문제없음
        Animal b = new Dog();  // 2번
        //
        Animal c = new Lion();  // 3번
        Dog d = new Animal();  // 4번
        //실제로 구현하는 dog클래스보다 animal이 상위라 구현이안되나?
        Predator e = new Lion();  // 5번
        //인터페이스가 되는군요
    }


}