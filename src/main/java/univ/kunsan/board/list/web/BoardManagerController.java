package univ.kunsan.board.list.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("/board/{bbsId}")
    public List<BoardDTO> getBoardList(@PathVariable("bbsId") String bbsId, BoardDTO boardDTO)
    {
        return boardManagerService.selectBoardList(bbsId, boardDTO);
    }

    /**
     * get board article
     * 
     * @return
     */
    @GetMapping("/board/{bbsId}/{nttId}")
    public BoardDTO getBoardArticle(@PathVariable("bbsId") String bbsId, @PathVariable("nttId") String nttId)
    {
        boardManagerService.plusViews(bbsId, nttId);

        return boardManagerService.selectBoardArticle(bbsId, nttId);
    }

    /**
     * update board article
     * 
     * @param board
     * @return
     */
    @PutMapping("/board")
    public String updateBoardArticle(@RequestBody Board board)
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

    /**
     * add board article
     * 
     * @param board
     * @return
     */
    @PostMapping("/board")
    public String insertBoardArticle(@RequestBody Board board)
    {
        // user auth check
        // file check
        // check reply or parent

        boardManagerService.insertBoardArticle(board);

        return "success";
    }

    /**
     * delete board article
     * 
     * @param board
     * @return
     */
    @DeleteMapping("/board")
    public String deleteBoardArticle(@RequestBody Board board)
    {
        boardManagerService.deleteBoardArticle(board);

        return "success";
    }
}