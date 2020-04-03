package zn.qyh.springboot.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曲逸涵
 * @date 2020/2/13 18:55
 * @Email:2628908921@qq.com
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello 你好";
    }
}
