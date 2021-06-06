package com.ib.trainingcommon.bo;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author YH
 *
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Course implements Serializable {

	private static final long serialVersionUID = -4411308073357929416L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute
	private Integer id;
	private String titre;
	private String description;
	private String programme;
	private String certification;
	private Integer audiance;
	private Integer finance;
	private Date length;
	//protected List<Intra> intras;

	/**
	 * 
	 * @param id
	 * @param titre
	 * @param description
	 * @param programme
	 * @param certification
	 * @param audiance
	 * @param finance
	 * @param length
	 */

	public Course(Integer id,String titre , String description, String programme, String certification, Integer audiance,
			Integer finance, Date length) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.programme = programme;
		this.certification = certification;
		this.audiance = audiance;
		this.finance = finance;
		this.length = length;

	}
	

	/**
	 * Function to confirm inscription
	 */
//	public boolean confirmEnrollement() {
//		if() {
//			return false;
//		}else {
//			return true;
//		}
//	}

	public Course() {
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
	 * @param titre the titre to set
	 */
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the program
	 */
	public String getProgramme() {
		return programme;
	}

	/**
	 * @param programme the program to set
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}

	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}

	/**
	 * @return the audience
	 */
	public Integer getAudiance() {
		return audiance;
	}

	/**
	 * @param audiance the audience to set
	 */
	public void setAudiance(Integer audiance) {
		this.audiance = audiance;
	}

	/**
	 * @return the finance
	 */
	public Integer getFinance() {
		return finance;
	}

	/**
	 * @param finance the finance to set
	 */
	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	/**
	 * @return the length
	 */
	public Date getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Date length) {
		this.length = length;
	}

	public void add(Course course) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Course [id=" + id +  ", titre=" + titre + ", description=" + description + ", programme=" + programme + ", certification=" + certification +  ", audiance=" + audiance +", finance=" + finance +", length=" + length +"]";
	}

}
