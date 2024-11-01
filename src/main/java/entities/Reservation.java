package entities;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column
private String vol_reserve;
@Column
private String passager_reservant;
@Column
private Date date_reservation;
@Enumerated(EnumType.STRING)
@Column(length = 16)
private ReservationStatut status;
@Column
private int prix_total;
@ManyToOne
private Passager passager;
@ManyToOne
private Vol vol;
	
}
