package com.rodrigo.usuariodepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.usuariodepto.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {

};
