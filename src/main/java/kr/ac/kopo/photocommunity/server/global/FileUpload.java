package kr.ac.kopo.photocommunity.server.global;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUpload {
    private final static String root = "C:\\upload\\photoCommunity\\";
    private final static String boardPath = "board\\";

    public static String fileUpload(MultipartFile attach, String type) throws IOException {
        String filename = UUID.randomUUID().toString().substring(0, 8);
        String fileType = attach.getContentType().substring(attach.getOriginalFilename().lastIndexOf(".") + 1);
            switch (type) {
                case "board":
                    attach.transferTo(new File(root + boardPath + filename + "." + fileType));
                    break;
            }
            return filename;
    }
}
