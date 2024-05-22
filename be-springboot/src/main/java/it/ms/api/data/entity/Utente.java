package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

	@Column(name = "Nome")
	private String Nome;

	@Column(name = "Cognome")
	private String Cognome;

	@Column(name = "Username")
	private String Username;

    @Column(name = "Password") // sarà memorizzata hashata
	private String Password;


	public Utente() {
        
	}

	public Utente(String Nome, String Cognome, String Username, String Password) {
		this.Nome = Nome;
		this.Cognome = Cognome;
        this.Username = Username;
        this.Password = Password;
	}

	public int getId() {
		return this.Id;
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getCognome() {
		return this.Cognome;
	}

	public void setCognome(String Cognome) {
		this.Cognome = Cognome;
	}

	@Override
	public String toString() {
		return "Utente [id=" + Id + ", Nome=" + Nome + ", Cognome=" + Cognome + ", Username=" + Username + "]";
	}
}
