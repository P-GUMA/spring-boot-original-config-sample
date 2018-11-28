package lab.pguma.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping("/")
    @ResponseBody
    public String URL() {
        return sampleService.URL();
    }

}
