package entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
@Entity
@Data
public class administrateur extends User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

	} 
	
}

