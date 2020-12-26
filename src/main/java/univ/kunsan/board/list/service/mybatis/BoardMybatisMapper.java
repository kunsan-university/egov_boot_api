package univ.kunsan.board.list.service.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import univ.kunsan.board.list.service.Board;
import univ.kunsan.board.list.service.dto.BoardDTO;

@Mapper
public interface BoardMybatisMapper
{
    BoardDTO getBoardArticle(@Param("bbsId") String bbsId, @Param("nttId") String nttId);

    int updateBoardArticle(Board board);

    int insertBoardArticle(Board board);

    int deleteBoardArticle(Board board);

    List<BoardDTO> getBoardList(Board board);

    int setBoard(Map<String, Object> params);

    int getViews(@Param("bbsId") String bbsId, @Param("nttId") String nttId);

    Integer updateViews(@Param("bbsId") String bbsId, @Param("nttId") String nttId, @Param("inqireCo") String inqireCo);

    long getMaxNttId();
}
