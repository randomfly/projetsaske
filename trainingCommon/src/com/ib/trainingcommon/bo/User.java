package com.ib.trainingcommon.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6255651151865666912L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "first_name")
	private String firstName;
	@Column(nullable = false, unique = true)
	private String login;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "login", referencedColumnName = "login"), inverseJoinColumns = @JoinColumn(name = "nom", referencedColumnName = "nom", updatable = true))
	private List<Role> roles = new ArrayList<Role>();

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String nom, String prenom, String login, String password) {
		super();
		this.id = id;
		this.lastName = nom;
		this.firstName = prenom;
		this.login = login;
		this.password = password;
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
		return lastName;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.lastName = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return firstName;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.firstName = prenom;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + lastName + ", prenom=" + firstName + ", login=" + login + ", password="
				+ password + "]";
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
