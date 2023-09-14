package kr.ac.kopo.photocommunity.server.model;

import lombok.Getter;

@Getter
public class Marker {
    int id;
    String latitude; //위도
    String longitude; //경도
    String address;
}
