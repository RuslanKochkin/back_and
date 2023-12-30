package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    }

