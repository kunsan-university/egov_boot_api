package univ.kunsan.board.list.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardManagerController {
    
    @GetMapping("/boardList")
    public Map<String, Object> getList()
    {
        Map<String, Object> boardMap = new HashMap<String, Object>();

        boardMap.put("bbsId", "BBSMSTR_AAAAAAAAAAAA");

        return boardMap;
    }
}
