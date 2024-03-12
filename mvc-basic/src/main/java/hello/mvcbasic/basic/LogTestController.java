package hello.mvcbasic.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // Slf4j 어노테이션을 쓰면 생략 가능

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";
//        log.trace(" info log = " + name); // 이렇게 쓰면 연산이 java언어상에서 연산이 발생함.(쓸모없는 리소스 사용)

        // 의미없는 연산이 없는 올바른 사용법!
        /**
         * 실무에서는 로그를 적극할용하자
         * 1. 파일로 남기는 다양한 설정을 지원함.
         * 2. system.out 보다 성능이 최적화 되어있음.
         */
        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
