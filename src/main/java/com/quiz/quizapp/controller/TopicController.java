package com.quiz.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizapp.entity.Topic;
import com.quiz.quizapp.service.TopicService;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping("/saveTopic")
    public Topic saveTopic(@RequestBody Topic topic) {

        return topicService.saveTopic(topic);

    }

}