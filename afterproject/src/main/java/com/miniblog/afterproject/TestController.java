package com.miniblog.afterproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TestController {

  @GetMapping("/test")
  public String testMethod(Model model) {
    log.info("접속");

    model.addAttribute("title", "jsp테스트성공");

    return "index";
  }
}
