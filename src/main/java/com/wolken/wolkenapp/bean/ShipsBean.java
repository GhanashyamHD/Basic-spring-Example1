package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ShipsBean {
	@Value("INS Gomathi")
	private String shipName;
	@Value("F-21")
	private String type;
//	@Autowired
//	public ShipsBean(@Value("INS Gomathi") String shipName, @Value("F-21") String type) {
//		super();
//		this.shipName = shipName;
//		this.type = type;
	//}
	public void locate() {
		System.out.println("The ship is in the Cochin-base ");
	}

}
