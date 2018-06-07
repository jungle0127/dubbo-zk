package com.wst.mqttdubboclient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.westone.cm2.mqtt.model.service.MqttGateService;
import com.westone.cm2.mqtt.model.service.dto.AddMqttUserRsp;
import com.westone.cm2.mqtt.model.service.dto.SendMsgRsp;


public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		MqttGateService gateService = context.getBean(MqttGateService.class);
//		AddMqttUserRsp userRsp = gateService.addMqttUser(0, "test-topic");
	//	System.out.println(String.format("resultcode:%s,userName:%s,pwd:%s,topicName:%s,comment:%s", Integer.toHexString(userRsp.resultCode),userRsp.username, userRsp.password,userRsp.topicName,userRsp.comment));
		//resultcode:0,userName:6d5a7bba-4f3f-4d64-a323-68b39c45dbe6,pwd:e9cc6fa6-e09b-44c0-9cd3-2f0179f82397,topicName:ps-topic,comment:ok
		// resultcode:0,userName:ac79c3b3-4f83-4e35-b823-fbea3752e6fc,pwd:4b4facae-0d45-4209-a1fd-15679834f122,topicName:test-topic,comment:ok
		SendMsgRsp rsp = gateService.sendMsgToTopic("test-topic", "jinghe".getBytes());
		System.out.println("=========================");
		System.out.println(rsp.toString());
		System.out.println(Integer.toHexString(rsp.resultCode));
		System.out.println("=========================");
		context.close();
	}
}
