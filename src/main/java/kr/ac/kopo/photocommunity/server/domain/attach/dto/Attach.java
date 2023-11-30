package kr.ac.kopo.photocommunity.server.domain.attach.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attach {
    private Long attachNum;
    private Long boardNum;
    private String filename;
}
