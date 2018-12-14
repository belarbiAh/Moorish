package yb.github.moorish.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import yb.github.moorish.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	@Query(value = "SELECT * FROM User u where u.email = : email")
	User findByEmail(@Param("email") String email);

}
