package in.hjwasim.tourismdb.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Hjwasim
 */
@Entity
@Getter
@Setter
@Builder
@ToString
public class Branch extends BaseEntity {
    private String name;
    private String place;
    private String website;
    private Long contact;
    private String email;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "branch")
    private List<Package> packageList;
}
