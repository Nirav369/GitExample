package com.springREST.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("one","December, January, Febrauary", "Winter months"),
			new Topic("Two","March, April, May", "Spring months"),
			new Topic("Three","June, July, August","Summer months"),
			new Topic("Four", "September, October, November", "Fall months")
			));
	
	public List<Topic> getTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll()
		.forEach(topics::add);//Method Reference
		return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic); 
		
		
	}

	public void updateTopic(String id, Topic topic) {
		/*for (int i =0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}

}
