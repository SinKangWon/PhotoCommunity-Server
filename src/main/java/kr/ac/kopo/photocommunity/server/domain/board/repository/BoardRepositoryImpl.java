package kr.ac.kopo.photocommunity.server.domain.board.repository;

import kr.ac.kopo.photocommunity.server.domain.board.dto.Board;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    private final SqlSession sqlSession;

    @Override
    public List<Board> findAllByMarkerNum(Long markerNum) {
        return sqlSession.selectList("board.findAllByMarkerNum", markerNum);
    }

    @Override
    public void createBoard(Board board) {
        sqlSession.insert("board.create", board);
    }
}

