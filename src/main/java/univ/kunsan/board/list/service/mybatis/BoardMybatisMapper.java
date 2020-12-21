package univ.kunsan.board.list.service.mybatis;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import univ.kunsan.board.list.service.dto.BoardDTO;

@Mapper
public interface BoardMybatisMapper
{
    BoardDTO getBoard();

    int setBoard(Map<String, Object> params);
}
