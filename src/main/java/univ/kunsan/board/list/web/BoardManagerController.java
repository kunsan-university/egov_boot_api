package univ.kunsan.board.list.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.kunsan.board.list.service.dto.BoardDTO;

@RestController
public class BoardManagerController
{
    
    /**
     * search board list
     * 
     * @return
     */
    @GetMapping("/boardList")
    public Map<String, Object> getList()
    {
        BoardDTO boardDTO = new BoardDTO();

        Map<String, Object> boardMap = new HashMap<String, Object>();

        boardMap.put("bbsId", "BBSMSTR_AAAAAAAAAAAA");

        return boardMap;
    }
}