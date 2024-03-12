package hello.mvcbasic.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    // @ResponseBody -> 이거 붙이면 그냥 문자를 던짐
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello model!");

        return "response/hello";
    }

    @RequestMapping("/response/hello") // 컨트롤러의 경로와 뷰의 논리적 이름이 일치하면 작동 됨
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello model!");
    }
}
