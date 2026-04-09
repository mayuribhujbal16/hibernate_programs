package test;

import java.util.List;

public class Answers 
{
	private int id;
	private String ansname;
	private String postedby;
	private List<Question> questions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnsname() {
		return ansname;
	}
	public void setAnsname(String ansname) {
		this.ansname = ansname;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	

}
