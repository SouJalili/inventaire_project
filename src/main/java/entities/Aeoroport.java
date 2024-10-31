package entities;
import jakarta.persistence.*;

@Entity
@Data
public class Aeoroport {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private String aeoroport_IATA;
	@Column
	private String nom_aeroport;
	@Column
	private String ville;
	@Column
	private String pays;
	@Column
	private int capacite;
	
	
}
