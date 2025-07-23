package com.allvartech.allvaruniversity;

import com.pdftron.pdf.PDFNet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequiredArgsConstructor
public class UploadUpfController {

    @PostMapping("/process-pdfs")
    public String handleFileUpload(@RequestParam("files") MultipartFile[] files, Model model) throws Exception {
        initializePdfLib();
        Path filePath = uploadedFilePath(files);
        System.out.println("rafaeel");
        /*===========================================================================================================*/


        /*===========================================================================================================*/
        return endFileUpload(model);
    }

    private void initializePdfLib() {
        PDFNet.initialize(PDF_NET_LICENSE);
    }

    @GetMapping("/uploadPage")
    public String showUploadPdfsPage(Model model) {
        return "uploadPage";
    }

    private static String endFileUpload(Model model) {
        model.addAttribute("message", "Arquivos processados com sucesso");
        return "uploadPage";
    }

    private Path uploadedFilePath(MultipartFile[] files) throws Exception {
        for (MultipartFile file : files) {
            if (!file.isEmpty()) {
                String uploadDir = System.getProperty("user.dir") + "/uploaded_files/";
                File directory = new File(uploadDir);
                if (!directory.exists()) {
                    if (!directory.mkdirs()) {
                        throw new Exception("Não foi possível criar Pasta: " + uploadDir);
                    }
                }

                Path filePath = Paths.get(uploadDir, file.getOriginalFilename());
                Files.write(filePath, file.getBytes());
                return filePath;
            }
        }

        return null;
    }

    private static final String PDF_NET_LICENSE = "demo:1701685057855:7ca2fcfc0300000000c347b341f64c669d37337c3a382f654457d93f43";
}