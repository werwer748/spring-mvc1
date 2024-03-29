package hello.mvcbasic.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        log.info("GET /mapping/users");
        return "get users";
    }

    @PostMapping
    public String addUser() {
        log.info("POST /mapping/users");
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        log.info("GET /mapping/users/ userId={}", userId);
        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        log.info("PATCH /mapping/users/ userId={}", userId);
        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        log.info("DELETE /mapping/users/ userId={}", userId);
        return "delete userId=" + userId;
    }
}
