package kr.ac.kopo.photocommunity.server.controller;

import kr.ac.kopo.photocommunity.server.model.Marker;
import kr.ac.kopo.photocommunity.server.service.MarkerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarkerRestController {

    final private MarkerService markerService;

    public MarkerRestController(MarkerService markerService) {
        this.markerService = markerService;
    }

    @GetMapping("/marker")
    public ResponseEntity<List<Marker>> markerList() {
        return ResponseEntity.ok()
                .body(markerService.list());
    }
}
