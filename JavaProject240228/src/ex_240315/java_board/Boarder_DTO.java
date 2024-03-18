package ex_240315.java_board;

public class Boarder_DTO {
	// DTO(Data Transfer Object) , 모델 객체. 
	// 디비의 컬럼의 내용과 동일하고
	// 게터 세터를 만들기.
	// 자동 생성. 
	private int id;
	private String writer;
    private String subject;
    private String content;
    private String regDate;
    private int viewsCount;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getViewsCount() {
		return viewsCount;
	}
	public void setViewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}

}
