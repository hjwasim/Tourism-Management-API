package in.hjwasim.tourismdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Hjwasim
 */
@NoRepositoryBean
public interface BaseRepository<T1, T2> extends JpaRepository<T1, T2> {
}
