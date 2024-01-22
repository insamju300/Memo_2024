package koreaIt.memo.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Memo {
	private int id;
	private LocalDateTime regDate;
	private String content;
	Memo() {
		
	}
	Memo(String content) {
		this.content = content;
	}
	Memo(int id, LocalDateTime regDate, String content) {
		super();
		this.id = id;
		this.regDate = regDate;
		this.content = content;
	}
	public Memo(Map<String, Object> map) {
		this.id = (int)map.get("id");
		this.regDate = (LocalDateTime)map.get("regDate");
		this.content = (String)map.get("content");		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String getRegDateString() {
		return this.regDate.format(DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss"));
	}
	

}
