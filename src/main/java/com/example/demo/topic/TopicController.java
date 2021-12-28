package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> topics(){

        /* We Can directly return the list however if we want to make it a Service as we are going to use this list multiple times, so we can create a new classs that will register as @Service and then can use this to reuturn the values as in line 27 */
//        return Arrays.asList(
//                new Topic("spring", "Spring Framework", "First Spring Framework"),
//                new Topic("java", "Java Core", "Getting Started with Java"),
//                new Topic("hibernate", "Hibernate Framework", "Learning ORM")
//        );

        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    //public Topic getTopic(@PathVariable("id") String  topicId){ // both will work line(32, 33), recommended line 33
    public Topic getTopic(@PathVariable String  id){
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){

        topicService.addTopic(topic);

    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){

        topicService.updateTopic(id, topic);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deteleTopic( @PathVariable String id){

        topicService.deleteTopic(id);
    }

}
