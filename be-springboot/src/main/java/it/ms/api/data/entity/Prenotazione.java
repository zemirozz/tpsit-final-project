package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Prenotazione")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Luogo Id;

    @ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) //comando per fare la FK
	@JoinColumn(name = "id_Luogo")
	private Luogo id_Luogo;

	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) //comando per fare la FK
    @JoinColumn(name="id_Lista")
	private Lista_Attivita id_Lista;

	public Prenotazione() {

	}

	public Prenotazione(Luogo id_Luogo, Lista_Attivita id_Lista) {
        this.id_Luogo = id_Luogo;
        this.id_Lista = id_Lista;
	}

    public Luogo getId() {
        return Id;
    }

    public Luogo getid_Luogo() {
        return id_Luogo;
    }

    public void setid_Luogo(Luogo id_Luogo) {
        this.id_Luogo = id_Luogo;
    }

    public Lista_Attivita getid_Lista() {
        return id_Lista;
    }

    public void setid_Lista(Lista_Attivita id_Lista) {
        this.id_Lista = id_Lista;
    }

    @Override
    public String toString() {
        return "Prenotazione [id=" + Id + ", Luogo=" + id_Luogo + ", id_Lista=" + id_Lista + "]";
    }

	
}
