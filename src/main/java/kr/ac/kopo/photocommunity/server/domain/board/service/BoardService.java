package kr.ac.kopo.photocommunity.server.domain.board.service;

import kr.ac.kopo.photocommunity.server.domain.board.dto.Board;
import kr.ac.kopo.photocommunity.server.domain.board.dto.BoardRequest;
import kr.ac.kopo.photocommunity.server.domain.member.dto.Member;

import java.io.IOException;
import java.util.List;

public interface BoardService {

    List<Board> boardList(Long markerNum);

    void create(BoardRequest request, Member member) throws IOException;


    Feat: 게시글 목록 불러오기 및 게시물 작성

            좌표에 따른 게시글 목록 확인
     게시물 작성 - MultipartFile 을 활용한 파일 업로드

}
