package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;

public class MemberApp {
    public static void main(String[] args) {

        // memberService 객체의 impl 클래스 주입은 appConfig 를 통해 맡기자!
        //        MemberService memberService = new MemberServiceImpl();

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();




        // 1. 회원가입
        Member memberA = new Member(1L,"memberA", Grade.VIP);
        memberService.join(memberA);

        // 2. 회원 조회
        Member findMember = memberService.findMember(1L);

        System.out.println("new member: " + memberA.getName());
        System.out.println("find member: " + findMember.getName());
    }
}
