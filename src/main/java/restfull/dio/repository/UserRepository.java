package restfull.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restfull.dio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
