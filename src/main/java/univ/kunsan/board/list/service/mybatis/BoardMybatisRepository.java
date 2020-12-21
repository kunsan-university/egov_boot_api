package univ.kunsan.board.list.service.mybatis;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import univ.kunsan.board.list.service.dto.BoardDTO;

@Repository
public class BoardMybatisRepository
{
    @Resource
    BoardMybatisMapper boardMybatisMapper;

    public BoardDTO getBoard()
    {
        return boardMybatisMapper.getBoard();
    }

    public int setBoard(Map<String, Object> params)
    {
        return boardMybatisMapper.setBoard(params);
    }
}
