package kr.ac.kopo.photocommunity.server.domain.board.dto;


import kr.ac.kopo.photocommunity.server.domain.attach.dto.Attach;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardRequest {
    private String title;
    private String tag;

    private List<MultipartFile> files;
    private List<Attach> attaches;

    private Long memberNum;

    private Long markerNum;
    private String lat;
    private String lon;
    private String address;



}
