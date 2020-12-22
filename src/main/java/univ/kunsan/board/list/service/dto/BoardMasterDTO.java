package univ.kunsan.board.list.service.dto;

import java.io.Serializable;

import univ.kunsan.board.list.service.BoardMaster;

public class BoardMasterDTO extends BoardMaster implements Serializable
{
    /**
     *  serialVersion UID
     */
    private static final long serialVersionUID = -8070768280461816170L;

    /** search begin date */
    private String searchBgnDe = "";

    /** search condition */
    private String searchCnd = "";

    /** search end date */
    private String searchEndDe = "";

    /** search word */
    private String searchWrd = "";

    /** sort order(DESC,ASC) */
    private String sortOrdr = "";

    /** search use(yes,yn) */
    private String searchUseYn = "";

    /** page index */
    private int pageIndex = 1;

    /** page unit */
    private int pageUnit = 10;

    /** page size */
    private int pageSize = 10;

    /** firstIndex */
    private int firstIndex = 1;

    /** lastIndex */
    private int lastIndex = 1;

    /** record count per page */
    private int recordCountPerPage = 10;

    /** row number */
    private int rowNo = 0;

    /** first register name */
    private String frstRegisterNm = "";

    /** board type code name */
    private String bbsTyCodeNm = "";

    /** board attribute code name */
    private String bbsAttrbCodeNm = "";

    /** template name */
    private String tmplatNm = "";

    /** last updater name */
    private String lastUpdusrNm = "";

    /** auth flag */
    private String authFlag = "";

    /** template course */
    private String tmplatCours = "";
}
