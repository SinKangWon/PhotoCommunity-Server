package kr.ac.kopo.photocommunity.server.domain.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDetail {
    private Long boardNum;
    private String title;
    private String tag;
    private Date regDate;

    private List<String> attachName;

    private String memberName;
    private String memberEmail;

    private String markerAddress;
}
