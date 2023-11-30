package kr.ac.kopo.photocommunity.server.domain.attach.repository;

import kr.ac.kopo.photocommunity.server.domain.attach.dto.Attach;

public interface AttachRepository {
    void createAttach(Attach attach);
}
