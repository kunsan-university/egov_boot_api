package univ.kunsan.board;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestApplication
{
    @Autowired
    private MockMvc mvc;

    MultiValueMap<String, String> info = new LinkedMultiValueMap<>();

    @Test
    public void testUpdateBoardArticle() throws Exception
    {
        info.add("bbsId", "BBSMSTR_AAAAAAAAAAAA");
        info.add("lastUpdusrId", "USRCNFRM_00000000000");
        info.add("ntceBgnde", "20201222");
        info.add("ntceEndde", "99991231");
        info.add("nttCn", "오늘의 단어는 가나다라마바사");
        info.add("nttId", "14");
        info.add("nttNo", "0");
        info.add("nttSj", "1342567");
        info.add("parnts", "0");
        info.add("inqireCo", "0");
        info.add("replyLc", "0");

        mvc.perform(put("/boardArticle").params(info))
           .andExpect(status().isOk());
    }

    @Test
    public void testInsertBoardArticle() throws Exception
    {
        info.add("atchFileId","");
        info.add("bbsId","BBSMSTR_AAAAAAAAAAAA");
        info.add("frstRegisterId","USRCNFRM_00000000000");
        info.add("frstRegisterPnttm","");
        info.add("lastUpdusrId","");
        info.add("lastUpdusrPnttm","");
        info.add("ntceBgnde","10000101");
        info.add("ntceEndde","99991231");
        info.add("ntcrId","");
        info.add("ntcrNm","");
        info.add("nttCn","werht");
        info.add("nttId","0");
        info.add("nttNo","0");
        info.add("nttSj","asdfxzcvbfedsh");
        info.add("parnts","0");
        info.add("password","");
        info.add("inqireCo","0");
        info.add("replyAt","N");
        info.add("replyLc","0");
        info.add("sortOrdr","0");
        info.add("useAt","");
        info.add("ntceEnddeView","");
        info.add("ntceBgndeView","");

        mvc.perform(post("/boardArticle").params(info))
           .andExpect(status().isOk());
    }

    @Test
    public void testDeleteBoardArticle() throws Exception
    {
        // ("nttSj", "이 글은 작서자에 의하여 삭제되었습니다.");
        info.add("atchFileId","");
        info.add("bbsId","BBSMSTR_AAAAAAAAAAAA");
        info.add("frstRegisterId","");
        info.add("frstRegisterPnttm","");
        info.add("lastUpdusrId","USRCNFRM_00000000000");
        info.add("lastUpdusrPnttm","");
        info.add("ntceBgnde","");
        info.add("ntceEndde","");
        info.add("ntcrId","");
        info.add("ntcrNm","");
        info.add("nttCn","werht");
        info.add("nttId","11");
        info.add("nttNo","0");
        info.add("nttSj","이 글은 작성자에 의해서 삭제되었습니다.");
        info.add("parnts","0");
        info.add("password","");
        info.add("inqireCo","0");
        info.add("replyAt","");
        info.add("replyLc","0");
        info.add("sortOrdr","3");
        info.add("useAt","");
        info.add("ntceEnddeView","");
        info.add("ntceBgndeView","");

        mvc.perform(delete("/boardArticle").params(info))
           .andExpect(status().isOk());
    }
}
