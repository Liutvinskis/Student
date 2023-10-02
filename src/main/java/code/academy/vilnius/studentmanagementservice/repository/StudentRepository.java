package code.academy.vilnius.studentmanagementservice.repository;

import code.academy.vilnius.studentmanagementservice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
