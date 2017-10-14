package com.igt.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igt.todoapp.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, String> {

}