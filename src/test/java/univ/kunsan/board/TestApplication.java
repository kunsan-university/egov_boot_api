package univ.kunsan.board;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.swing.text.AbstractDocument.Content;

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

    @Test
    public void testUpdateBoardArticle() throws Exception
    {
        MultiValueMap<String, String> info = new LinkedMultiValueMap<>();

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
}
