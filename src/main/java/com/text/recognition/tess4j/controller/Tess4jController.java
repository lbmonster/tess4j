package com.text.recognition.tess4j.controller;

import com.text.recognition.tess4j.service.ITess4jService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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
    public String getTess4jRecognition(@RequestParam("file") MultipartFile multipartFiles) {
        if (multipartFiles != null) {
            try {
                return tess4jService.getTess4jRecognition(multipartFiles.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
