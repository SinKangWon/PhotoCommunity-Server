package kr.ac.kopo.photocommunity.server.domain.marker.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marker {
    private Long markerNum;
    //위도
    private String lat;
    //경도
    private String lon;
    private String address;


}
