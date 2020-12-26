package univ.kunsan.board.list.service;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board implements Serializable
{
    /**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = -8868310931851410226L;
	/**
	 * attatch File Id
	 */
	private String atchFileId = "";
	/**
	 * Board Id
	 */
	private String bbsId = "";
	/**
	 * First Register Id
	 */
	private String frstRegisterId = "";
	/**
	 * First Regist Point
	 */
	private String frstRegisterPnttm = "";
	/**
	 * Last Update User Id
	 */
	private String lastUpdusrId = "";
	/**
	 * Last Update Point
	 */
	private String lastUpdusrPnttm = "";
	/**
	 * Notice Start date
	 */
	private String ntceBgnde = "";
	/**
	 * Notice End Date
	 */
	private String ntceEndde = "";
	/**
	 * Noticer Id
	 */
	private String ntcrId = "";
	/**
	 * Noticer Name
	 */
	private String ntcrNm = "";
	/**
	 * Notice Content
	 */
	private String nttCn = "";
	/**
	 * Notice Id
	 */
	private long nttId = 0L;
	/**
	 * Notice Number
	 */
	private long nttNo = 0L;
	/**
	 * Notice Subject
	 */
	private String nttSj = "";
	/**
	 * Parent Number
	 */
	private String parnts = "0";
	/**
	 * Password
	 */
	private String password = "";
	/**
	 * Views
	 */
	private int inqireCo = 0;
	/**
	 * Reply (YES, NO)
	 */
	private String replyAt = "";
	/**
	 * Reply location
	 */
	private String replyLc = "0";
	/**
	 * Sort order
	 */
	private long sortOrdr = 0L;
	/**
	 * Use (Yes, NO)
	 */
	private String useAt = "";
	/**
	 * notice end date
	 */
	private String ntceEnddeView = "";
	/**
	 * notice begin date
	 */
	private String ntceBgndeView = "";

}