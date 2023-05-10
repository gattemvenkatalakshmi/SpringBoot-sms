package net.javavenky.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javavenky.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
