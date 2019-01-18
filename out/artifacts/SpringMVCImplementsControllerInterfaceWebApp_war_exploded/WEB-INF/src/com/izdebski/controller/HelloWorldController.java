package com.izdebski.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
        return new ModelAndView("main", "message", "Welcome to Spring MVC world!!!");
    }

}