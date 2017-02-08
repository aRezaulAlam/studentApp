package com.agroho.repository;

import com.agroho.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: rezaul || Date: 2/5/17.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
