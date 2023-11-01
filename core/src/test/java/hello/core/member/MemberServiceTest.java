package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    // 이때 memberService 는 MemberService 와 MemberServiceImpl 에 의존함.
    // DIP 위반: 구현 클래스에 의존
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        // given: 테스트 객체
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        // when: 멤버 서비스에 조인을 했을 때,
        memberService.join(memberA);
        Member memberB = memberService.findMember(1L);

        // then: 회원가입 대상과 찾으려는 대상이 같은가?
        Assertions.assertThat(memberA).isEqualTo(memberB);
    }
}
