package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller 라고 하면 메서드가 String을 반환했을 때 뷰 이름이 반환되지만
// @RestController 라고 하면 http body에 내용을 담아서 반환함.
// @RestController RestApi 만들 때 핵심적인 컨트롤러
@Slf4j
// @Slf4j 는 다음 코드를 자동으로 넣어준다: private final Logger log = LoggerFactory.getLogger(getClass());
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
