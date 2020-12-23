package univ.kunsan.board.list.service;

import java.util.List;

import univ.kunsan.board.list.service.dto.BoardDTO;

public interface BoardManagerService
{
    List<BoardDTO> selectBoardList(String bbsId);

    BoardDTO selectBoardArticle(String bbsId, String nttId);

    boolean updateBoardArticle(Board board);

    boolean insertBoardArticle(Board board);

    boolean deleteBoardArticle(Board board);
}
