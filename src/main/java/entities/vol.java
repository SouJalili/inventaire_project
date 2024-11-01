package entities;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
public class vol {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column
private int num_vol;
@Column
private String vol_IATA;
@Column
private Date date_vol;
@Column
private String aeroport_depart;
@Column
private String aeroport_arrive;
@Column
@OneToMany(mappedBy = "vol")
private List<Membre_equipage>membreEquipage;
	
}
