package hello.mvcbasic.basic;

import lombok.Data;

/**
 * Data?
 * `@Getter` , `@Setter` , `@ToString` , `@EqualsAndHashCode` , `@RequiredArgsConstructor`(final, @NonNull 붙은거만 생성자!)
 * 를 자동으로 만들어준다.... 여태 개뻘짓함 ㅠㅜ
 */
@Data
public class HelloData {

    private String username;
    private int age;
}
