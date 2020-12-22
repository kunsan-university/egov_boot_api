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
	 * 조회수
	 */
	private int inqireCo = 0;
	/**
	 * 답장여부
	 */
	private String replyAt = "";
	/**
	 * 답장위치
	 */
	private String replyLc = "0";
	/**
	 * 정렬순서
	 */
	private long sortOrdr = 0L;
	/**
	 * 사용여부
	 */
	private String useAt = "";
	/**
	 * 게시 종료일
	 */
	private String ntceEnddeView = "";
	/**
	 * 게시 시작일
	 */
	private String ntceBgndeView = "";

}
