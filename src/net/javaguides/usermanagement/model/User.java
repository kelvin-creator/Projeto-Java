package net.javaguides.usermanagement.model;

public class User {
	private int id;
	private String nome;
	private String email;
	private String cidade;	
		
	public User(int id, String nome, String email, String cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
	}
	
	
	
	
	
	
	public User(String nome, String email, String cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
	}






	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
}
