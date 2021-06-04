package com.ib.trainingcommon.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2075547226763221041L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	@Column(nullable = false, unique = true)
	private String nom;

//	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
//	@JoinTable(name = "utilisateur_role", joinColumns = @JoinColumn(name = "nom", referencedColumnName = "nom"), inverseJoinColumns = @JoinColumn(name = "login", referencedColumnName = "login", updatable = true))
//	private List<Utilisateur> utilisateurs;

	public Role() {
		super();
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
