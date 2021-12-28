package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("spring", "Spring Framework", "First Spring Framework"),
            new Topic("java", "Java Core", "Getting Started with Java"),
            new Topic("hibernate", "Hibernate Framework", "Learning ORM")
    ));

    public List<Topic> getAllTopics(){

        return topics;
    }

    public Topic getTopic(String topicID){

       return  topics.stream().filter(t -> t.getTopcId().equals(topicID)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {

        for(int i=0; i< topics.size();i++){
            if(topics.get(i).getTopcId().equals(id)){
                topics.set(i, topic);
                return;
            }

        }

    }

    public void deleteTopic(String id) {

//        /* One way to delete from list */
//        for(int i=0; i< topics.size();i++){
//            Topic t = topics.get(i);
//            if(t.getTopcId().equals(id)){
//                topics.remove(t);
//                return;
//            }

        /*Another way to delete */

        topics.removeIf(t -> t.getTopcId().equals(id));

        }



}
