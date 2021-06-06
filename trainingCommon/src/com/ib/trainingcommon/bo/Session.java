/**
 * 
 */
package com.ib.trainingcommon.bo;

import java.util.Date;

/**
 * @author YH
 *
 */
public class Session {

	private Integer id;
	private Boolean isRemote;
	private String room;
	private Date start;
	private Date end;
	private Boolean isOnGoing;

	/**
	 * @param id
	 * @param isRemote
	 * @param room
	 * @param start
	 * @param end
	 * @param isOnGoing
	 */

	public Session(Integer id, Boolean isRemote, String room, Date start, Date end, Boolean isOnGoing) {
		super();
		this.id = id;
		this.isRemote = isRemote;
		this.room = room;
		this.start = start;
		this.end = end;
		this.isOnGoing = isOnGoing;
	}

	/**
	 * 
	 */
	public Session() {
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
	 * @return the isRemote
	 */
	public Boolean getIsRemote() {
		return isRemote;
	}

	/**
	 * @param isRemote the isRemote to set
	 */
	public void setIsRemote(Boolean isRemote) {
		this.isRemote = isRemote;
	}

	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * @return the start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * @return the isOnGoing
	 */
	public Boolean getIsOnGoing() {
		return isOnGoing;
	}

	/**
	 * @param isOnGoing the isOnGoing to set
	 */
	public void setIsOnGoing(Boolean isOnGoing) {
		this.isOnGoing = isOnGoing;
	}

	public void add(Session session) {
		// TODO Auto-generated method stub

	}

}
