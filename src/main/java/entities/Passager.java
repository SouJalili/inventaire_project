package entities;
import jakarta.persistence.*;

@Entity
@Data
public class Passager extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column
	private int num_passeport;
    @Column
	private String num_CIN;
    @Column
	private String nationalite;
    @Column
	private String adresse;
    @Column
	private double telephone;
    @OneToMany(mappedBy = "passager")
    private List<Reservation>reservation;
    
	}
    
    
}
