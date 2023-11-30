package kr.ac.kopo.photocommunity.board;

import kr.ac.kopo.photocommunity.server.domain.board.repository.BoardRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoardTest {

    private final BoardRepository boardRepository;

    public BoardTest(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Test
    @DisplayName("boardDetail")
    void boardDetail() {

    }
}