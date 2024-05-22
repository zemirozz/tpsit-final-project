package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Lista_Attivita")
public class Lista_Attivita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

	@Column(name = "NomeLista")
	private String NomeLista;

    @ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) //comando per fare la FK
    @JoinColumn(name="Id_Utente", nullable = false)
    private Utente Id_Utente;

	public Lista_Attivita() {

	}

	public Lista_Attivita(String NomeLista, Utente Id_Utente) {
        this.NomeLista = NomeLista;
        this.Id_Utente = Id_Utente;
	}

	public long getId() {
		return Id;
	}

	public String getNomeLista() {
		return NomeLista;
	}

	public void setNomeLista(String NomeLista) {
		this.NomeLista = NomeLista;
	}

	public Utente getId_Utente() {
		return Id_Utente;
	}

	public void setId_Utente(Utente Id_Utente) {
		this.Id_Utente = Id_Utente;
	}


	@Override
	public String toString() {
		return "Lista_Attività [id=" + Id + ", NomeLista=" + NomeLista + ", desc=" + Id_Utente + "]";
	}
}
