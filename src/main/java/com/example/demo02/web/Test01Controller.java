package com.example.demo02.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Test01Controller {

    @RequestMapping("/test01")
    public String test01() {
        return "ok test01";
    }

    @RequestMapping("/test02")
    public String test02() {
        return "ok test02";
    }

}
