package top.hubby.controller;

import cn.hutool.core.util.StrUtil;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class JavaController {

    @GetMapping("/java")
    public String index(@RequestParam("name") String name) {
        log.info("name: {}", name);
        return StrUtil.format("Hello, {}!", name);
    }
}
