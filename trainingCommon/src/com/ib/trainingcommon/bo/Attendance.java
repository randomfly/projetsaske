/**
 * 
 */
package com.ib.trainingcommon.bo;

import java.util.Date;

/**
 * @author YH
 *
 */
public class Attendance {

	private Integer id;
	private Integer userId;
	private Integer sessionId;
	private Date date;
	private Boolean isPresent;

	/**
	 * @param id
	 * @param userId
	 * @param sessionId
	 * @param date
	 * @param isPresent
	 */
	public Attendance(Integer id, Integer userId, Integer sessionId, Date date, Boolean isPresent) {
		super();
		this.id = id;
		this.userId = userId;
		this.sessionId = sessionId;
		this.date = date;
		this.isPresent = isPresent;
	}

	/**
	 * 
	 */
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the sessionId
	 */
	public Integer getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the isPresent
	 */
	public Boolean getIsPresent() {
		return isPresent;
	}

	/**
	 * @param isPresent the isPresent to set
	 */
	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}

	public void add(Attendance attendance) {
		// TODO Auto-generated method stub

	}

}
