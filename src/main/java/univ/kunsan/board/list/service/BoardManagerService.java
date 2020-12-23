package univ.kunsan.board.list.service;

import java.util.List;

import univ.kunsan.board.list.service.dto.BoardDTO;

public interface BoardManagerService
{
    List<BoardDTO> selectBoardList();

    BoardDTO selectBoardArticle();

    boolean updateBoardArticle(Board board);

    boolean insertBoardArticle(Board board);
}
