package com.apcompany.user.pojo;

import java.sql.Timestamp;
import java.util.List;


public class TQuestions {
	private long id;
	private String question;
	private int status;
	private Timestamp ctime;
	private Timestamp utime;
	private List<TChoises> choices;
	private TAnswers tAnswers;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Timestamp getCtime() {
		return ctime;
	}
	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	public Timestamp getUtime() {
		return utime;
	}
	public void setUtime(Timestamp utime) {
		this.utime = utime;
	}
	
	public TAnswers gettAnswers() {
		return tAnswers;
	}
	public void settAnswers(TAnswers tAnswers) {
		this.tAnswers = tAnswers;
	}
	public List<TChoises> getChoices() {
		return choices;
	}
	public void setChoices(List<TChoises> choices) {
		this.choices = choices;
	}
	@Override
	public String toString() {
		return "TQuestions [id=" + id + ", question=" + question + ", status=" + status + ", ctime=" + ctime
				+ ", utime=" + utime + ", choices=" + choices + ", tAnswers=" + tAnswers + "]";
	}

}
