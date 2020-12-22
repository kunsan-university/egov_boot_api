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
        List<Map> results = new ArrayList<Map>();

        // for(BoardDTO boardDTO: boardList)
        // {
        //     Map<String, Object> board = new HashMap<>();
            
        // }


        return boardList;
    }

    public BoardDTO selectBoardArticle()
    {
        return boardMybatisRepository.getBoard();
    }
}
