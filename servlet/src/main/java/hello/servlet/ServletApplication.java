package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan // 스프링에서 서블릿 사용
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

//	@Bean // 스프링빈으로 직접 등록
//	SpringMemberFormControllerV1 SpringMemberFormControllerV1() {
//		return new SpringMemberFormControllerV1();
//	}

}
