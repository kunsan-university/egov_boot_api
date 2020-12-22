package univ.kunsan.board.list.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.kunsan.board.list.service.BoardManagerService;
import univ.kunsan.board.list.service.dto.BoardDTO;
import univ.kunsan.board.list.service.mybatis.BoardMybatisRepository;

@RestController
public class BoardManagerController
{

    @Autowired
    BoardManagerService boardManagerService;

    @Autowired
    BoardMybatisRepository boardMybatisRepository;

    /**
     * search board list
     * 
     * @return
     */
    @GetMapping("/boardList")
    public List<BoardDTO> getBoardList()
    {
        return boardManagerService.selectBoardList();
    }

    @GetMapping("/boardArticle")
    public BoardDTO getBoardArticle()
    {
        return boardManagerService.selectBoardArticle();
    }
}