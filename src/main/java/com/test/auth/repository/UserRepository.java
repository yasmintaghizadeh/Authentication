package com.test.auth.repository;

import com.test.auth.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,String> {

    Optional<UserEntity> findByPhoneNumber(Long phoneNumber);
}
