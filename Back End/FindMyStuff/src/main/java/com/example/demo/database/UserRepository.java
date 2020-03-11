package com.example.demo.database;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer>{

    @Query(
            value = "SELECT password FROM user u WHERE u.username = ?1",
            nativeQuery = true
    )
    String findPasswordByUsername(String username);

    User findByUsername(String username);
}
