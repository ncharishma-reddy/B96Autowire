package com.tns.auto;

public class Human {

	private Heart heart;//CREATING the reference of heart class in human

		public Human(){
			super();
		}
	public Human(Heart heart) {
			super();
			this.heart = heart;
		}
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
	}
		else {
			System.out.println("dead");
		}
	}
	
}
