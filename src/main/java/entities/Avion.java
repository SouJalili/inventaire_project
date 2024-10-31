package entities;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private String type_avion;
    @Column
	private int capacite;
    @Column
	private Date annee_fabrication;
    @Column
	private String model;
    @OneToMany(mappedBy = "avion")
	private List<vol>vol;
}
