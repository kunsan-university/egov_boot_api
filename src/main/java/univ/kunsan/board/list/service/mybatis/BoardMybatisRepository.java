package univ.kunsan.board.list.service.mybatis;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import univ.kunsan.board.list.service.dto.BoardDTO;

@Repository
public class BoardMybatisRepository
{
    @Resource
    BoardMybatisMapper boardMybatisMapper;

    public BoardDTO getBoardArticle()
    {
        return boardMybatisMapper.getBoardArticle();
    }

    public List<BoardDTO> getBoardList()
    {
        return boardMybatisMapper.getBoardList();
    }

    public int setBoard(Map<String, Object> params)
    {
        return boardMybatisMapper.setBoard(params);
    }

    Integer getViews()
    {
        return boardMybatisMapper.getViews();
    }

    Integer updateViews()
    {
        return boardMybatisMapper.updateViews();
    }
}
