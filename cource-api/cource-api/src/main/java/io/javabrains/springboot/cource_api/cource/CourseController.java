package io.javabrains.springboot.cource_api.cource;

import java.util.List;

//import org.javadev.springbootquickstart.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.javabrains.springboot.cource_api.topic.Topic;

@RestController
public class CourseController {

  @Autowired
  private CourseService courseService;

  @GetMapping("/topics/{id}/courses")
  public List<Course> getAllCourses(@PathVariable String id) {
    return courseService.getAllCourses(id);
  }

  @GetMapping("/topics/{topicId}/courses/{id}")
  public Course getCourse(@PathVariable String id) {
    return courseService.getCourse(id);
  }

  @PostMapping("/topics/{topicId}/courses")
  public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
    course.setTopic(new Topic(topicId, "", ""));
    courseService.addCourse(course);
  }

  @PutMapping("/topics/{topicId}/courses/{id}")
  public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
    course.setTopic(new Topic(topicId, "", ""));
    courseService.updateCourse(course);
  }

  @DeleteMapping("/topics/{topicId}/courses/{id}")
  public void deleteCourse(@PathVariable String id) {
    courseService.deleteCourse(id);
  }

}