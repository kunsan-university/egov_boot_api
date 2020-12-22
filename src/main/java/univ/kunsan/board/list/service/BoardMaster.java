package univ.kunsan.board.list.service;

import java.io.Serializable;

public class BoardMaster implements Serializable
{
    /**
     * serialVersion UID
     */
    private static final long serialVersionUID = 2821358749509367821L;

    /** board attribute code */
    private String bbsAttrbCode = "";

    /** board id */
    private String bbsId = "";

    /** board introduce */
    private String bbsIntrcn = "";

    /** board name */
    private String bbsNm = "";

    /** board type code */
    private String bbsTyCode = "";

    /** file attach possible(YES, NO) */
    private String fileAtchPosblAt = "";

    /** first register id */
    private String frstRegisterId = "";

    /** first register datetime */
    private String frstRegisterPnttm = "";

    /** last updater id */
    public String lastUpdusrId = "";

    /** last updated datetime */
    private String lastUpdusrPnttm = "";

    /** possible attach file number */
    private int posblAtchFileNumber = 0;

    /** possible attach file size */
    private String posblAtchFileSize = "";

    /** reply possible(YES, NO) */
    private String replyPosblAt = "";

    /** template id */
    private String tmplatId = "";

    /** use(YES,NO) */
    private String useAt = "";

    /** board use flag */
    private String bbsUseFlag = "";

    /** target id */
    private String trgetId = "";

    /** register code */
    private String registSeCode = "";

    /** unique id */
    private String uniqId = "";

    /** template name */
    private String tmplatNm = "";

    /** option (comment, stsfdg) */
    private String option = "";

    /** comment possible(YES,NO) */
    private String commentAt = "";

    /** satisfaction(YES,NO) */
    private String stsfdgAt = "";
}
