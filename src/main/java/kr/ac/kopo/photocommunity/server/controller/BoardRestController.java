package kr.ac.kopo.photocommunity.server.controller;

import kr.ac.kopo.photocommunity.server.model.Board;
import kr.ac.kopo.photocommunity.server.service.BoardService;
import kr.ac.kopo.photocommunity.server.service.MarkerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardRestController {

    private final BoardService boardService;
    private final MarkerService markerService;

    public BoardRestController(BoardService boardService, MarkerService markerService) {
        this.boardService = boardService;
        this.markerService = markerService;
    }


    @GetMapping("/board/{coordId}")
    public ResponseEntity<List<Board>> list(@RequestParam("coordId")String coordId) {
        return ResponseEntity.ok().body(markerService)
    }
}
