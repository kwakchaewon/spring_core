package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        // 1. 회원가입
        Member memberA = new Member(1L,"memberA", Grade.VIP);
        memberService.join(memberA);

        // 2. 회원 조회
        Member findMember = memberService.findMember(1L);

        System.out.println("new member: " + memberA.getName());
        System.out.println("find member: " + findMember.getName());
    }
}