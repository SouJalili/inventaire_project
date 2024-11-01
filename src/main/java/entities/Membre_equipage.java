package entities;
import jakarta.persistence.*;

@Entity
@Data
public class Membre_equipage {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private String nom_complet;
	@Column
	private String fonction;
	@Column
	private String num_licence;
	@Column
	private String nationalite;
	@ManyToOne
	private vol vol;
	
}
