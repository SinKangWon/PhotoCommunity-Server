package kr.ac.kopo.photocommunity.server.domain.board.dto;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
public class CreateBoard {
    private String title;
    private String tag;
    private List<MultipartFile> files;
    private List<String> fileNames;
    private Long memberNum;
    private String lat;
    private String lon;
}
