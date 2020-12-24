package univ.kunsan.board;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import univ.kunsan.board.list.service.Board;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestApplication
{
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    MultiValueMap<String, String> info = new LinkedMultiValueMap<>();

    String contentToObject(Board board) throws Exception
    {
        return objectMapper.writeValueAsString(board);
    }

    @Test
    public void testUpdateBoardArticle() throws Exception
    {
        Board board = new Board();

        board.setBbsId("BBSMSTR_AAAAAAAAAAAA");
        board.setLastUpdusrId("USRCNFRM_00000000000");
        board.setNtceBgnde("20201222");
        board.setNtceEndde("99991231");
        board.setNttCn("오늘의 단어는 가나다라마바사");
        board.setNttId(14);
        board.setNttNo(0);
        board.setNttSj("1342567");
        board.setParnts("0");
        board.setInqireCo(0);
        board.setReplyLc("0");

        mvc.perform(put("/board")
           .content(contentToObject(board))
           .contentType(MediaType.APPLICATION_JSON)
           .accept(MediaType.APPLICATION_JSON))
           .andExpect(status().isOk());
    }

    @Test
    public void testInsertBoardArticle() throws Exception
    {
        Board board = new Board();

        board.setAtchFileId("");
        board.setBbsId("BBSMSTR_AAAAAAAAAAAA");
        board.setFrstRegisterId("USRCNFRM_00000000000");
        board.setFrstRegisterPnttm("");
        board.setLastUpdusrId("");
        board.setLastUpdusrPnttm("");
        board.setNtceBgnde("10000101");
        board.setNtceEndde("99991231");
        board.setNtcrId("");
        board.setNtcrNm("");
        board.setNttCn("werht");
        board.setNttId(0);
        board.setNttNo(0);
        board.setNttSj("asdfxzcvbfedsh");
        board.setParnts("0");
        board.setPassword("");
        board.setInqireCo(0);
        board.setReplyAt("N");
        board.setReplyLc("0");
        board.setSortOrdr(0);
        board.setUseAt("");
        board.setNtceEnddeView("");
        board.setNtceBgndeView("");

        String reqBody = contentToObject(board);

        mvc.perform(post("/board")
           .content(reqBody)
           .contentType(MediaType.APPLICATION_JSON)
           .accept(MediaType.APPLICATION_JSON))
           .andExpect(status().isOk());
    }

    @Test
    public void testDeleteBoardArticle() throws Exception
    {
        Board board = new Board();

        board.setAtchFileId("");
        board.setBbsId("BBSMSTR_AAAAAAAAAAAA");
        board.setFrstRegisterId("");
        board.setFrstRegisterPnttm("");
        board.setLastUpdusrId("USRCNFRM_00000000000");
        board.setLastUpdusrPnttm("");
        board.setNtceBgnde("");
        board.setNtceEndde("");
        board.setNtcrId("");
        board.setNtcrNm("");
        board.setNttCn("werht");
        board.setNttId(11);
        board.setNttNo(0);
        board.setNttSj("이 글은 작성자에 의해서 삭제되었습니다.");
        board.setParnts("0");
        board.setPassword("");
        board.setInqireCo(0);
        board.setReplyAt("");
        board.setReplyLc("0");
        board.setSortOrdr(3);
        board.setUseAt("");
        board.setNtceEnddeView("");
        board.setNtceBgndeView("");

        mvc.perform(delete("/board")
           .content(contentToObject(board))
           .contentType(MediaType.APPLICATION_JSON)
           .accept(MediaType.APPLICATION_JSON))
           .andExpect(status().isOk());
    }

    @Test
    public void testGetBoardList() throws Exception
    {
        mvc.perform(get("/board/{bbsId}", "BBSMSTR_AAAAAAAAAAAA"))
           .andExpect(status().isOk());
    }

    @Test
    public void testGetBoardArticle() throws Exception
    {
        mvc.perform(get("/board/{bbsId}/{nttId}", "BBSMSTR_AAAAAAAAAAAA", "5"))
           .andExpect(status().isOk());
    }
}
