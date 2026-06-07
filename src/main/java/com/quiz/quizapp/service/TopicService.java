package com.quiz.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quizapp.entity.Topic;
import com.quiz.quizapp.repository.TopicRepository;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public Topic saveTopic(Topic topic) {

        return topicRepository.save(topic);

    }

}
