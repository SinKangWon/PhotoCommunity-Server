package kr.ac.kopo.photocommunity.server.domain.attach.repository;

import kr.ac.kopo.photocommunity.server.domain.attach.dto.Attach;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AttachRepositoryImpl implements AttachRepository{

    private final SqlSession sqlSession;

    @Override
    public void createAttach(Attach attach) {
        sqlSession.insert("attach.create", attach);
    }
}
