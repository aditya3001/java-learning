package com.example.designpattern;

enum Genre {
	
	HORROR(20){
		
		@Override
		public String getGenreName() {
			return this.name();
		}
	}
	, THRILLER(30){
		@Override
		public String getGenreName() {
			return this.name();
		}
	};
	
	private int num;
	
	private Genre(int n) {
		this.num = n;
	}
	
	public abstract String getGenreName();
}
public class EnumsAbstractMethod {

	public static void main(String[] args) {
		System.out.println(Genre.HORROR.getGenreName());
	}
}
