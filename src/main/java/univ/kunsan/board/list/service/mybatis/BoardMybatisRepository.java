package univ.kunsan.board.list.service.mybatis;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import univ.kunsan.board.list.service.Board;
import univ.kunsan.board.list.service.dto.BoardDTO;

@Repository
public class BoardMybatisRepository
{
    @Resource
    BoardMybatisMapper boardMybatisMapper;

    public BoardDTO getBoardArticle(String bbsId, String nttId)
    {
        return boardMybatisMapper.getBoardArticle(bbsId, nttId);
    }

    public int updateBoardArticle(Board board)
    {
        return boardMybatisMapper.updateBoardArticle(board);
    }

    public int insertBoardArticle(Board board)
    {
        return boardMybatisMapper.insertBoardArticle(board);
    }

    public int deleteBoardArticle(Board board)
    {
        return boardMybatisMapper.deleteBoardArticle(board);
    }

    public List<BoardDTO> getBoardList(String bbsId)
    {
        return boardMybatisMapper.getBoardList(bbsId);
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

    public long getMaxNttId()
    {
        return boardMybatisMapper.getMaxNttId();
    }
}
