package org.samuelraymundo.mailloginapi.repositories;

import org.samuelraymundo.mailloginapi.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
