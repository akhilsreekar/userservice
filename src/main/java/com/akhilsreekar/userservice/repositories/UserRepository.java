package com.akhilsreekar.userservice.repositories;

import com.akhilsreekar.userservice.models.User;
import com.akhilsreekar.userservice.services.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User save(User user);

    Optional<User> findByEmail(String email);
}
