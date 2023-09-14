package kr.ac.kopo.photocommunity.server.mapper;

import kr.ac.kopo.photocommunity.server.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BoardMapper {
    Optional<Board> findByCoordId(String coordId);
}
