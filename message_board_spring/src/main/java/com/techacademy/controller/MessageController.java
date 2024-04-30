package com.techacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techacademy.service.MessageService;

@Controller
@RequestMapping("message")
public class MessageController {
    @Autowired
    private MessageService service;
    
    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String getList(Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("messagelist", service.getMessageList());
        // message/list.htmlに画面遷移
        return "message/list";
        }
}
