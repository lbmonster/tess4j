package com.text.recognition.tess4j.controller;

import com.text.recognition.tess4j.service.ITess4jService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author intasect
 */
@RestController
@RequestMapping("/tess4j")
public class Tess4jController {

    private final ITess4jService tess4jService;

    public Tess4jController(ITess4jService tess4jService) {
        this.tess4jService = tess4jService;
    }

    @PostMapping("/recognition")
    public String getTess4jRecognition() {
        return tess4jService.getTess4jRecognition();
    }

}
