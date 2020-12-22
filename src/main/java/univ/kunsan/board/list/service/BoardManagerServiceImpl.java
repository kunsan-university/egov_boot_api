package univ.kunsan.board.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import univ.kunsan.board.list.service.dto.BoardDTO;
import univ.kunsan.board.list.service.mybatis.BoardMybatisRepository;

@Slf4j
@Service
public class BoardManagerServiceImpl implements BoardManagerService
{
    @Autowired
    private BoardMybatisRepository boardMybatisRepository;

    @Override
    public List<BoardDTO> selectBoardList()
    {
        List<BoardDTO> boardList = boardMybatisRepository.getBoardList();

        return boardList;
    }

    public BoardDTO selectBoardArticle()
    {
        // views increment(true, false)
        // boardDTO.setPlusCount(true);

        // last upader nick id
        // boardDTO.setLastUpdusrId("유저닉네임");

        return boardMybatisRepository.getBoardArticle();
    }
}
