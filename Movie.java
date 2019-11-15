package com.test.refactor;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW = 1;
    public static final int REGULAR = 0;

    private String title;
    private int code;
       
    
	public Movie(String title, int code) {
		this.title = title;
		this.code = code;
	}
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}


}
