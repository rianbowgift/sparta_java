//interface Predator {
//    String bark();
//}
//
//abstract class Animal {
//    public String hello() {
//        return "hello";
//    }
//}
//
//class Dog extends Animal {
//}
//
//class Lion extends Animal implements Predator {
//    public String bark() {
//        return "Bark bark!!";
//    }
//}
//
//public class Sample {
//    public static void main(String[] args) {
//        Animal a = new Lion();
//        Lion b = new Lion();
//        Predator c = new Lion();
//
//        System.out.println(a.hello());  // 1번
//        System.out.println(a.bark());   // 2번
//        //실제 구현체는 bark가 없다.
//        System.out.println(b.hello());  // 3번
//        System.out.println(b.bark());   // 4번
//        System.out.println(c.hello());  // 5번
//        //실제 구현체인 인터페이스 프레데터는 헬로메소드가 없다
//        System.out.println(c.bark());   // 6번
//    }
//}