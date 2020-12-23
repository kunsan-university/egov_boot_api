package univ.kunsan.board.list.service.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import univ.kunsan.board.list.service.Board;
import univ.kunsan.board.list.service.dto.BoardDTO;

@Mapper
public interface BoardMybatisMapper
{
    BoardDTO getBoardArticle();

    int updateBoardArticle(Board board);

    int insertBoardArticle(Board board);

    List<BoardDTO> getBoardList();

    int setBoard(Map<String, Object> params);

    Integer getViews();

    Integer updateViews();

    long getMaxNttId();
}
