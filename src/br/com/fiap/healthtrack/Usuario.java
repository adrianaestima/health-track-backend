package br.com.fiap.healthtrack;

import java.io.Serializable;


/**
 * Classe Usu?rio
 * @author Aline Soares
 * @version 0.1
 */

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idUser; //Id do usu?rio
	private String name; //Nome do usu?rio
	private String birthdate; //Data de nascimento do usu?rio
	private String genre; //G?nero do usu?rio
	private Double height; //Altura do usu?rio
	private String email; //Email do usu?rio
	private String password; //Senha do usu?rio
	
	
	/**
	 * @param idUser
	 * @param name
	 * @param birthdate
	 * @param genre
	 * @param height
	 * @param email
	 * @param password
	 */
	
	public Usuario(int idUser, String name, String birthdate, String genre, Double height, String email,
			String password) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.birthdate = birthdate;
		this.genre = genre;
		this.height = height;
		this.email = email;
		this.password = password;
	}
	
	/**
	 * Realizar login
	 * @param Email
	 * @param Senha
	 */
	public void login(String email, String password) {
		
		this.email = "alinedmsoares@gmail.com";
		this.password = "123Abc";
				
		if(email == this.email && password == this.password) {
			
			System.out.println("Login v?lido");
		} else {
			
			System.out.println("Login inv?lido");
		}
	}
	
	/**
	 * Verificar id do usu?rio
	 */
	public int getIdUser() {
		return idUser;
	}
	/**
	 * Configurar id do usu?rio
	 * @param novo id do usu?rio
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	/**
	 * Verificar nome do usu?rio
	 */
	public String getName() {
		return name;
	}
	/**
	 * Configurar nome do usu?rio
	 * @param novo nome do usu?rio
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Verificar data de nascimento do usu?rio
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * Configurar data de nascimento do usu?rio
	 * @param nova data de nascimento do usu?rio
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	/**
	 * Verificar g?nero do usu?rio
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * Configurar g?nero do usu?rio
	 * @param novo g?nero do usu?rio
	 */

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	/**
	 * Verificar altura do usu?rio
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * Configurar altura do usu?rio
	 * @param nova altura do usu?rio
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	/**
	 * Verificar email do usu?rio
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Configurar email do usu?rio
	 * @param novo email do usu?rio
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verificar senha do usu?rio
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Configurar senha do usu?rio
	 * @param nova senha do usu?rio
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
