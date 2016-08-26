package com.taotao.evaluate.controller;

import com.taotao.evaluate.pojo.comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("evaluate")
@Controller
public class EvaluateController {


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("evaluate");
        comment comment = new comment();
        return mv;
    }
}