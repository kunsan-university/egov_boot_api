package univ.kunsan.board.list.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import univ.kunsan.board.list.service.dto.BoardDTO;
import univ.kunsan.board.list.service.mybatis.BoardMybatisRepository;

@Slf4j
@Service
public class BoardManagerServiceImpl implements BoardManagerService
{
    @Autowired
    private BoardMybatisRepository boardMybatisRepository;

    @Override
    public List<BoardDTO> selectBoardList(String bbsId, Board board)
    {
        board.setBbsId(bbsId);

        return boardMybatisRepository.getBoardList(board);
    }

    // return type will fixed list or map
    public BoardDTO selectBoardArticle(String bbsId, String nttId)
    {
        // views increment(true, false)
        // boardDTO.setPlusCount(true);

        // last upader id
        // boardDTO.setLastUpdusrId("유저닉네임");

        return boardMybatisRepository.getBoardArticle(bbsId, nttId);

        // board master infomation will add
    }

    public boolean updateBoardArticle(Board board)
    {
        try
        {
            boardMybatisRepository.updateBoardArticle(board);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public boolean insertBoardArticle(Board board)
    {
        try
        {
            board.setNtcrNm("");
            board.setPassword("");
            // not reply board article
            board.setParnts("0");
            board.setReplyLc("0");
            board.setReplyAt("N");

            Long nttId = boardMybatisRepository.getMaxNttId();
            board.setNttId(nttId);

            boardMybatisRepository.insertBoardArticle(board);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public boolean deleteBoardArticle(Board board)
    {
        try
        {
            boardMybatisRepository.deleteBoardArticle(board);
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public void plusViews(String bbsId, String nttId)
    {
        int views = boardMybatisRepository.getViews(bbsId, nttId);

        boardMybatisRepository.updateViews(bbsId, nttId, Integer.toString(views));
    }
}
