package univ.kunsan.board.list.service.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import univ.kunsan.board.list.service.Board;

@Getter
@Setter
@ToString
public class BoardDTO extends Board implements Serializable
{
    
    private static final long serialVersionUID = -3779821913760046011L;

    /** search begin Date */
    private String searchBgnDe = "";

    /** search condition */
    private String searchCnd = "";

    /** search end Date */
    private String searchEndDe = "";

    /** search word */
    private String searchWrd = "";

    /** sort order(DESC, ASC) */
    private long sortOrdr = 0L;

    /** search usable (yes, no) */
    private String searchUseYn = "";

    /** current page index */
    private int pageIndex = 1;

    /** page unit */
    private int pageUnit = 10;

    /** page size */
    private int pageSize = 10;

    /** first page index */
    private int firstIndex = 1;

    /** last page index */
    private int lastIndex = 1;

    /** record count percent page */
    private int recordCountPerPage = 10;

    /** record number */
    private int rowNo = 0;

    /** first register name */
    private String frstRegisterNm = "";

    /** last updater name */
    private String lastUpdusrNm = "";

    /** is expired(Y,N) */
    private String isExpired = "N";

    /** parents sort order */
    private String parntsSortOrdr = "";

    /** parents reply location */
    private String parntsReplyLc = "";

    /** board type code */
    private String bbsTyCode = "";

    /** board attribute code */
    private String bbsAttrbCode = "";

    /** board name */
    private String bbsNm = "";

    /** file attach posible(Yes, No) */
    private String fileAtchPosblAt = "";

    /** posible attach file number */
    private int posblAtchFileNumber = 0;

    /** reply posible(Yes, No) */
    private String replyPosblAt = "";

    /** views count(true, false) */
    private boolean plusCount = false;

    /** sub page index (for checking comments and Satisfaction survey) */
    private String subPageIndex = "";
}