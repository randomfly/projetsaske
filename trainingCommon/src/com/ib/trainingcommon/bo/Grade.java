/**
 * 
 */
package com.ib.trainingcommon.bo;


public class Grade {

	private Integer id;
	private Integer userIdTrainee;
	private Integer userIdTrainer;
	private Integer sessionId;

	/**
	 * @param id
	 * @param userIdTrainee
	 * @param userIdTrainer
	 * @param sessionId
	 */
	public Grade(Integer id, Integer userIdTrainee, Integer userIdTrainer, Integer sessionId) {
		super();
		this.id = id;
		this.userIdTrainee = userIdTrainee;
		this.userIdTrainer = userIdTrainer;
		this.sessionId = sessionId;
	}

	/**
	 * 
	 */
	public Grade() {
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
	 * @return the userIdTrainee
	 */
	public Integer getUserIdTrainee() {
		return userIdTrainee;
	}

	/**
	 * @param userIdTrainee the userIdTrainee to set
	 */
	public void setUserIdTrainee(Integer userIdTrainee) {
		this.userIdTrainee = userIdTrainee;
	}

	/**
	 * @return the userIdTrainer
	 */
	public Integer getUserIdTrainer() {
		return userIdTrainer;
	}

	/**
	 * @param userIdTrainer the userIdTrainer to set
	 */
	public void setUserIdTrainer(Integer userIdTrainer) {
		this.userIdTrainer = userIdTrainer;
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

	public void add(Grade grade) {
		// TODO Auto-generated method stub

	}

}
