package univ.kunsan.board.list.service;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;

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
    public List<BoardDTO> selectBoardList()
    {
        List<BoardDTO> boardList = boardMybatisRepository.getBoardList();

        return boardList;
    }

    // return type will fixed list or map
    public BoardDTO selectBoardArticle()
    {
        // views increment(true, false)
        // boardDTO.setPlusCount(true);

        // last upader nick id
        // boardDTO.setLastUpdusrId("유저닉네임");

        return boardMybatisRepository.getBoardArticle();

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
}
