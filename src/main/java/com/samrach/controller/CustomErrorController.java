package com.samrach.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorController {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model) {
        String errorMessage = "An error occurred: " + ex.getMessage();
        model.addAttribute("errorMessage", errorMessage);
        return "error"; // Return the name of the error view template
    }
}
