package io.javabrains.springboot.cource_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springboot.cource_api.topic.Topic;

public interface TopicRepository extends JpaRepository<Topic, String>{

}
