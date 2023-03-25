package com.mbsystems.securitylesson02.repository;

import com.mbsystems.securitylesson02.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findUsersByUsername( String username);
}
