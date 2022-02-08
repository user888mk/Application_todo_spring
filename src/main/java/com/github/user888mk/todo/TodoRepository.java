package com.github.user888mk.Application_todo_spring.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer> {

}