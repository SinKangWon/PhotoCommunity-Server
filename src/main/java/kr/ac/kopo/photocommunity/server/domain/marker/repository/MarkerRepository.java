package kr.ac.kopo.photocommunity.server.domain.marker.repository;


import kr.ac.kopo.photocommunity.server.domain.marker.dto.Marker;

public interface MarkerRepository {

    Long findByPoint(Marker marker);

    void createMarker(Marker marker);
}
