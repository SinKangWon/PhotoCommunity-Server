package kr.ac.kopo.photocommunity.server.repository;

import kr.ac.kopo.photocommunity.server.model.Marker;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MarkerRepository {
    private final SqlSession sqlSession;


    public MarkerRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Marker> list() {
        return sqlSession.selectList("marker.List");
    }
}
