package io.javabrains.springboot.cource_api.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> list =new ArrayList<>(Arrays.asList(new Topic("1","spring","javaaaaaaaaaaaaa"),new Topic("2","spring","Spring boot"),new Topic("3","Flask","Python"),new Topic("4","Python","Djangooo")));
	
	
	public List<Topic> getAllTopics(){
		return list;
	}
	
	public Topic getById(String id) {
		for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getId())) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
	public Topic updateById(Topic topic,String id) {
		for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getId())) {
				Topic newTopic = list.get(i);
				newTopic.setDesc(topic.getDesc());
				newTopic.setName(topic.getName());
				return newTopic;
			}
		}
		return null;
	}
	
		
	public void addToList(Topic topic) {
		list.add(topic);
	}
	
	public void deleteById(String id) {
		for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getId())) {
				 list.remove(i);
			}
		}
		
	}
	
}
