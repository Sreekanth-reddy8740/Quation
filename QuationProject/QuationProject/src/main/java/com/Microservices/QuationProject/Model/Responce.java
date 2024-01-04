package com.Microservices.QuationProject.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Responce {
	
	private Integer id;
	private String responce;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResponce() {
		return responce;
	}
	public void setResponce(String responce) {
		this.responce = responce;
	}
	@Override
	public String toString() {
		return "Responce [id=" + id + ", responce=" + responce + "]";
	}
	public Responce(Integer id, String responce) {
		super();
		this.id = id;
		this.responce = responce;
	}
	public Responce() {
		
	}
	
	
}
