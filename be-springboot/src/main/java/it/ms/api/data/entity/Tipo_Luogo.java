package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_Luog")
public class Tipo_Luogo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

	@Column(name = "Descrizione")
	private String Descrizione;

	public Tipo_Luogo() {

	}

	public Tipo_Luogo(String Descrizione) {
		this.Descrizione = Descrizione;
	}

	public int getId() {
		return this.Id;
	}

	public String getDescrizione() {
		return this.Descrizione;
	}

	@Override
	public String toString() {
		return "Tipo_Luogo [Id=" + Id + ", Descrizione=" + Descrizione + "]";
	}
}
