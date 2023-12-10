package com.mbip.mbip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecycleController {

    @GetMapping("/recycle")
    public String showRecyclePage() {
    return "chartRecycle";
    }
}
