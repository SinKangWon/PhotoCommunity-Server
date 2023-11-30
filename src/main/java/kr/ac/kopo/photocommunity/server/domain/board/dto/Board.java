package kr.ac.kopo.photocommunity.server.domain.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Board {

    private Long boardNum;
    private String title;
    private String tag;
    private Date regDate;

    private Long markerNum;

    private Long memberNum;
}
