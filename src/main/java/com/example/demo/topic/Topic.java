package com.example.demo.topic;

public class Topic {

    private String topcId;
    private String topicName;
    private String topicDesc;

    public Topic() {
    }

    public Topic(String topcId, String topicName, String topicDesc) {
        this.topcId = topcId;
        this.topicName = topicName;
        this.topicDesc = topicDesc;
    }

    public String getTopcId() {
        return topcId;
    }

    public void setTopcId(String topcId) {
        this.topcId = topcId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topcId='" + topcId + '\'' +
                ", topicName='" + topicName + '\'' +
                ", topicDesc='" + topicDesc + '\'' +
                '}';
    }
}
