package com.design.pattern.creational.builder;

public class User {
	private String name;
	private String userId;
	//optional
	private String role;
	public String getName() {
		return name;
	}
	public String getUserId() {
		return userId;
	}
	public String getRole() {
		return role;
	}
	
	private User(UserBuilder builder) {
		this.name=builder.name;
		this.role=builder.role;
		this.userId=builder.userId;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", role=" + role + "]";
	}


	public static class UserBuilder{
		private String name;
		private String userId;
		//optional
		private String role;
		
//		public UserBuilder() {
//			
//		}
		
		
//		public UserBuilder(String name,String userId) {
//			this.name=name;
//			this.userId=userId;
//			
//		}
        

		public UserBuilder setRole(String role) {
			this.role = role;
			return this;
		}
		
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}


		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}


		public User build() {
			return new User(this);
		}
		
		
	}

}
