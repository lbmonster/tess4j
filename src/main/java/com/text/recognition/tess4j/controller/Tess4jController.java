package com.text.recognition.tess4j.controller;

import com.text.recognition.tess4j.service.ITess4jService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author intasect
 */
@RestController
@RequestMapping("/tess4j")
@Api("图片识别")
@CrossOrigin
public class Tess4jController {

    private final ITess4jService tess4jService;

    public Tess4jController(ITess4jService tess4jService) {
        this.tess4jService = tess4jService;
    }

    @PostMapping("/recognition")
    @ApiOperation(value = "发票识别",tags = "发票识别",notes = "发票识别")
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
