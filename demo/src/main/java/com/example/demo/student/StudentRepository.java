package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//For Data Access
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
