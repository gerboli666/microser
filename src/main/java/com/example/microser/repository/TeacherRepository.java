package com.example.microser.repository;

import com.example.microser.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findTeacherById(Long id);

    List<Teacher> deleteTeacherById(Long id);
}
