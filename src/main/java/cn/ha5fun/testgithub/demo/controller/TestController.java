package cn.ha5fun.testgithub.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chen
 * @Company ha5fun.com
 * @Description 测试
 * @Date 2021/1/11 1:56 下午
 * @Version 1.0.0
 */
@Controller
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> testHello(){
        return ResponseEntity.ok("测试,不会更改当前版本");
    }
}
