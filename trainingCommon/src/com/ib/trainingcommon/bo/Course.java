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
 * 
 * @author ib
 *
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8823563664706694834L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute
	private Integer id;
	@XmlAttribute
	private String isbn;
	// @XmlTransient
	private String titre;
	private Date dateDeParution;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id
	 * @param isbn
	 * @param titre
	 * @param dateDeParution
	 */
	public Course(Integer id, String isbn, String titre, Date dateDeParution) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titre = titre;
		this.dateDeParution = dateDeParution;
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
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the titre
	 */

	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the dateDeParution
	 */
	public Date getDateDeParution() {
		return dateDeParution;
	}

	/**
	 * @param dateDeParution the dateDeParution to set
	 */
	public void setDateDeParution(Date dateDeParution) {
		this.dateDeParution = dateDeParution;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", isbn=" + isbn + ", titre=" + titre + ", dateDeParution=" + dateDeParution + "]";
	}

}
