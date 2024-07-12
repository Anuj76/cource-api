package io.javabrains.springboot.cource_api.cource;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
}
