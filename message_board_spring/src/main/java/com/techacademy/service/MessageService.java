package com.techacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.entity.Message;
import com.techacademy.repository.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    /** 全件を検索して返す */
    public List<Message> getUserList() {
        // リポジトリのfindAllメソッドを呼び出す
        return messageRepository.findAll();
    }
}
