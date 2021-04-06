package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

//@Componenet should be above the class only
@Getter
@Component
public class HarbourBean {
	@Value("Andaman")
	private String harbourName;
	@Value("Bay Of Bengal")
	private String waterSource;
	@Autowired
	private ShipsBean shipsBean;
	// another way of using value 
//	@Autowired
//	public HarbourBean(@Value("Andaman") String harbourName, @Value("Bay Of Bengal") String waterSource,  ShipsBean shipsBean) {
//		super();
//		this.harbourName = harbourName;
//		this.waterSource = waterSource;
//		this.shipsBean = shipsBean;
//	}
	public void openTime() {
		System.out.println("Harbour is open.................");
	}
	
}
