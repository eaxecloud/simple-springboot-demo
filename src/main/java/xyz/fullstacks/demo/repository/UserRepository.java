package xyz.fullstacks.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.fullstacks.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}