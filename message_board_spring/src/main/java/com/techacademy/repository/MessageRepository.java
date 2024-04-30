package com.techacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techacademy.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
