package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

        // 1. @Configuration, @Bean 을 통해 설정 클래스와 빈 정의
        // 2. 어노테이션에서 구성 정보 가져오기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // 3. 빈을 끌고 와 객체 정의
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        // 4. 회원가입
        Member memberA = new Member(1L,"memberA", Grade.VIP);
        memberService.join(memberA);

        // 5. 회원 조회
        Member findMember = memberService.findMember(1L);

        System.out.println("new member: " + memberA.getName());
        System.out.println("find member: " + findMember.getName());
    }
}
