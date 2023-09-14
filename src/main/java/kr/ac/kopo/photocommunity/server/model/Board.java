package kr.ac.kopo.photocommunity.server.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Getter
public class Board {
    private int id;
    private String title;
    private String contents;
    private String tag;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date regDate;
    private int coordId;
    private double latLngX;
    private double latLngY;
    private String latLngName;
    private String memberId;
    private String memberName;
    private String memberEmail;
    private List<MultipartFile> attach;
    private List<Attach> attachs;
    private int cnt;
}
