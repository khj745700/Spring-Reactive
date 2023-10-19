package chapter6;


import reactor.core.publisher.Mono;

/**
 * Mono 기본 개념 예제
 *  - 1개의 데이터를 생성해서 emit한다.
 */
public class Example6_1 {
    public static void main(String[] args) {
        Mono.just("Hello Reactor") // Mono는 0 또는 1개의 데이터를 emit 하는 Publisher -> RxJava 에서는 Maybe + Single 이라 생각하면 됨.
                .subscribe(System.out::println);
    }
}
