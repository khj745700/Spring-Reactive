package chapter6;


import reactor.core.publisher.Mono;

/**
 * Mono 기본 개념 예제
 *  - 원본 데이터의 emit 없이 onComplete signal 만 emit 한다.
 */
public class Example6_2 {
    public static void main(String[] args) {
        Mono
            .empty() // 빈 친구도 보낼수 있다고 했음.
            .subscribe(
                    none -> System.out.println("# emitted onNext signal"), // 데이터를 전달 받을 것이 없으므로,
                    error -> {},
                    () -> System.out.println("# emitted onComplete signal") // onComplete signal이 가는 것임.
            );
    }

    /**
     *  subscribe의 람다 표현식 파라미터 에서
     *  1번 람다식은 onNext Signal을 전송하면 실행됨.
     *  2번 람다식은 onError Signal을 전송하면 실행됨.
     *  3번 람다식은 onComplete Signal을 전송하면 실행됨.
     */
}
