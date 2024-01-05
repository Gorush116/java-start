public class CommentJava {

    public static void main(String[] args) {
        System.out.println("hello java1"); // hello java1 을 출력합니다.
//        System.out.println("hello java2");

        /*
        System.out.println("hello java3");
        System.out.println("hello java4");
        */

        /**
         * feedback
         * 1. if와 메소드명을 문맥에 맞게 일치시켜라 -> 검증메소드를 통과한다면 조건값이 true일 때 진행하여야 하고, false일 때 예외 처리
         * 2. 같은 목적의 코드끼리는 뭉쳐놓기 -> 중복체크, 빈값체크 등 같은 종류의 코드는 묶어놓는다.
         * 3. lambda parameter 연관성 있는 알파벳 사용 -> 테이블(t), vo(v), param(p) 등..
         * 4. @Test 시에는 DI를 @Autowired 로 사용
         * 4-1. 테스트시에는 실패하는 케이스를 우선적으로 작성할 것
         * 5. try~catch의 사용 이유 : runtimeError 방지(중요) / 예외 발생시 경우 에 따른 처리를 자세히 하기 위해
         */
    }
}
