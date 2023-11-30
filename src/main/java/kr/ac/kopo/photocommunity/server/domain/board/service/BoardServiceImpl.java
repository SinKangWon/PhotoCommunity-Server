package kr.ac.kopo.photocommunity.server.domain.board.service;

import kr.ac.kopo.photocommunity.server.domain.attach.dto.Attach;
import kr.ac.kopo.photocommunity.server.domain.attach.repository.AttachRepository;
import kr.ac.kopo.photocommunity.server.domain.board.dto.Board;
import kr.ac.kopo.photocommunity.server.domain.board.dto.BoardRequest;
import kr.ac.kopo.photocommunity.server.domain.board.repository.BoardRepository;
import kr.ac.kopo.photocommunity.server.domain.marker.dto.Marker;
import kr.ac.kopo.photocommunity.server.domain.marker.repository.MarkerRepository;
import kr.ac.kopo.photocommunity.server.domain.member.dto.Member;
import kr.ac.kopo.photocommunity.server.global.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;
    private final MarkerRepository markerRepository;
    private final AttachRepository attachRepository;
    @Override
    public List<Board> boardList(Long markerNum) {
        return boardRepository.findAllByMarkerNum(markerNum);
    }

    @Override
    @Transactional
    public void create(final BoardRequest request, final Member member) throws IOException {
        Marker marker = Marker.builder()
                .lat(request.getLat())
                .lon(request.getLon())
                .build();

        Long markerNum = markerRepository.findByPoint(marker);
        if (markerNum.equals(null)) {
            markerRepository.createMarker(marker);
        }
        Board board = Board.builder()
                .memberNum(member.getMemberNum())
                .title(request.getTitle())
                .tag(request.getTag())
                .markerNum(marker.getMarkerNum())
                .build();

        boardRepository.createBoard(board);
        if (request.getFiles() != null && !request.getFiles().isEmpty()) {
            for (MultipartFile file : request.getFiles()) {
                Attach attach = Attach.builder()
                        .boardNum(board.getBoardNum())
                        .filename(FileUpload.fileUpload(file, "board"))
                        .build();
                attachRepository.createAttach(attach);
            }
        }
    }
}
