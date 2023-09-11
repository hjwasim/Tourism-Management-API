package in.hjwasim.tourismdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Hjwasim
 */
@Entity
@Getter
@Setter
@ToString
public class Package extends BaseEntity {
    private String placeName;
    private Double tariffPrice;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    @JsonIgnore
    private Branch branch;
}
