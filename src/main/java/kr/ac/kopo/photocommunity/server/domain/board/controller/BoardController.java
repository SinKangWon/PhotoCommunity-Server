package kr.ac.kopo.photocommunity.server.domain.board.controller;

import kr.ac.kopo.photocommunity.server.domain.board.dto.Board;
import kr.ac.kopo.photocommunity.server.domain.board.dto.BoardRequest;
import kr.ac.kopo.photocommunity.server.domain.board.service.BoardService;
import kr.ac.kopo.photocommunity.server.domain.marker.service.MarkerService;
import kr.ac.kopo.photocommunity.server.domain.member.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    @GetMapping
    public List<Board> list(@PathVariable Long markerNum) {
        return boardService.boardList(markerNum);
    }

    @PostMapping
    public void create(@RequestBody BoardRequest request, @SessionAttribute Member member) {
        boardService.createBoard(request, member);
    }
}
