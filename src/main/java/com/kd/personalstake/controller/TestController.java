package com.kd.personalstake.controller;

import com.kd.personalstake.domain.EvCg;
import com.kd.personalstake.service.EvCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private EvCgService evCgService;

    @GetMapping("/springboot")
    public EvCg test() {
        return evCgService.selectByPrimaryKey("3110100000000002");
    }
}
