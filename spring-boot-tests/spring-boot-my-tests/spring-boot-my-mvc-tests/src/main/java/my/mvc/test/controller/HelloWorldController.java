package my.mvc.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @version        V2.0
 * @date           2017-08-01 15:00:19
 * @author         xin.huang
 */
@RestController
@RequestMapping("/test/")
public class HelloWorldController {

    /**
     * 测试
     *
     * @return String
     */
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello() {
		System.out.println("----------------------------");
        return "Hello,World!";
    }

}
