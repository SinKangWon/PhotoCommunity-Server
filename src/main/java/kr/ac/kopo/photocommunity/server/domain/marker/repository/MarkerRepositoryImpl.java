package kr.ac.kopo.photocommunity.server.domain.marker.repository;

import kr.ac.kopo.photocommunity.server.domain.marker.dto.Marker;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MarkerRepositoryImpl implements MarkerRepository{
    private final SqlSession sqlSession;

    public List<Marker> list() {
        return sqlSession.selectList("marker.List");
    }

    @Override
    public Long findByPoint(Marker marker) {
        return sqlSession.selectOne("marker.countByPoint", marker);
    }

    @Override
    public void createMarker(Marker marker) {
        sqlSession.insert("marker.create", marker);
    }
}
