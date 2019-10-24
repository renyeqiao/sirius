package org.henry.sirius.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description
 * @auther renyeqiao
 * @create 2019-10-24 17:32
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "helloworld";
    }
}
