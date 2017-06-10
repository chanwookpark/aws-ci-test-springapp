package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "ok!";
    }
}
