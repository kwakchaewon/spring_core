package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}
	Member memberA= new Member(1L, "memberA",Grade.VIP);


}
