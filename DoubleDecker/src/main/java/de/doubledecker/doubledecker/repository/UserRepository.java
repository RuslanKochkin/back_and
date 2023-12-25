package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
