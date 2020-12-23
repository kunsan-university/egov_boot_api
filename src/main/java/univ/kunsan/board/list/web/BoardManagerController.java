package univ.kunsan.board.list.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.kunsan.board.list.service.Board;
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

    /**
     * get board article
     * 
     * @return
     */
    @GetMapping("/boardArticle")
    public BoardDTO getBoardArticle()
    {
        return boardManagerService.selectBoardArticle();
    }

    @PutMapping("/boardArticle")
    public String updateBoardArticle(Board board)
    {
        // 1. user info
        // 2. user auth?
        // 3. attach file?
        // 4. bean validator?
        // 5. bindingResult.hasErrors()?
        // 6. isAuthored?
        // 7. lastUpdater user set
        // 8. set board attribute(ntcrNm, password, Nttcn)

        try
        {
            boardManagerService.updateBoardArticle(board);
        }
        catch (Exception e) 
        {
            return "failure";
        }

        return "success";
    }

    @PostMapping("boardArticle")
    public String insertBoardArticle(Board board)
    {
        // user auth check
        // file check
        // check reply or parent

        boardManagerService.insertBoardArticle(board);

        return "success";
    }
}