package kr.ac.kopo.photocommunity.server.service;

import kr.ac.kopo.photocommunity.server.model.Marker;
import kr.ac.kopo.photocommunity.server.repository.MarkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkerService {
    private final MarkerRepository markerRepository;

    public MarkerService(MarkerRepository markerRepository) {
        this.markerRepository = markerRepository;
    }

    public List<Marker> list() {
        return markerRepository.list();
    }

}
