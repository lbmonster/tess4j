package com.text.recognition.tess4j.service.impl;

import com.text.recognition.tess4j.service.ITess4jService;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.io.File;

/**
 * @author libo
 */
@Service
public class Tess4jImpl implements ITess4jService {


    @Override
    public String getTess4jRecognition() {
        Tesseract1 tesseract1 = new Tesseract1();
        tesseract1.setDatapath("tessdata");
        String result = "";
        File file = new File("E:\\2012\\123.png");
        try {
            result = tesseract1.doOCR(file);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        return result;
    }
}
