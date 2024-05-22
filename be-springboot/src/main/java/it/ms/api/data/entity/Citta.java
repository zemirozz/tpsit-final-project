package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "citta")
public class Citta {
    
    @Id
    private int CAP;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descrizione")
    private String descrizione;

    @Column(name = "Nazione")
    private String nazione;

    public Citta(){}
    
    public Citta(String nome, String descrizione, String nazione) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.nazione = nazione;
	}


	public long getCAP() {
		return CAP;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDscrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	@Override
	public String toString() {
		return "Citta [CAP=" + CAP + ", nome=" + nome + ", desc=" + descrizione + ", nazione=" + nazione + "]";
	}
}