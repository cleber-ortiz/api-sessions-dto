package br.com.tipo.api.sessions.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;
	@SerializedName("token")
	@JsonProperty("token")	
	private String token;
	@SerializedName("userId")
	@JsonProperty("userId")	
	private String userId;
	@SerializedName("device")
	@JsonProperty("device")	
	private String device;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
}
