package kr.ac.kopo.photocommunity.server.domain.board.repository;

import kr.ac.kopo.photocommunity.server.domain.board.dto.Board;

import java.util.List;

public interface BoardRepository {
    List<Board> findAllByMarkerNum(Long markerNum);

    void createBoard(Board board);
}
