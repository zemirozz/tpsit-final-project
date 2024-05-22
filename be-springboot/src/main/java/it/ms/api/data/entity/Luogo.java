package it.ms.api.data.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "luogo")
public class Luogo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Nome")
	private String Nome;

	@Column(name = "Descrizione")
	private String Descrizione;

    @ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) //comando per fare la FK
	@JoinColumn(name = "Id_Tipo")
	private Tipo_Luogo id_Tipo;

    @ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) //comando per fare la FK
    @JoinColumn(name = "CAP")
	private Citta id_Citta;

    

	public Luogo() {

	}

	public Luogo(String Nome, String Descrizione, Tipo_Luogo id_Tipo, Citta id_Citta) {
		this.Nome = Nome;
        this.Descrizione = Descrizione;
        this.id_Tipo = id_Tipo;
        this.id_Citta = id_Citta;
	}

    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    public Tipo_Luogo getid_Tipo() {
        return id_Tipo;
    }

    public void setid_Tipo(Tipo_Luogo id_tipo) {
        id_Tipo = id_tipo;
    }

    public Citta getid_Citta() {
        return id_Citta;
    }

    public void setid_Citta(Citta id_citta) {
        id_Citta = id_citta;
    }

    @Override
    public String toString() {
        return "Luogo [id=" + id + ", Nome=" + Nome + ", Descrizione=" + Descrizione + ", id_Tipo=" + id_Tipo + ", id_Citta="
                + id_Citta + "]";
    }

	
}
