package ex_240315.java_board;

public class README {
// 화면
	// 1) 목록 화면(회원가입 리스트 화면), 
	// 버튼 글쓰기 
	// 2) 게시글 작성(회원가입 화면)
	// id(sequence 만들어서 자동생성), 작성자(자동)-> 임시 수동입력, 제목, 내용, 등록날짜(자동), 조회수(기본:0) 
	// 3) 게시글 상세보기(회원가입 상세보기 화면) 
	// 제목, 내용, 수정날짜(자동),
	// 시간이 되면, 회원을 붙여서, 아니면, 그냥 작성하기. 
	// 4) 회원리스트 데이터베이스 연동 까지 하고, 아니면, 일단.
	
	// 준비물)데이터 베이스 준비 하기. 
	// 시퀀스 준비물 
//	CREATE SEQUENCE boarder_seq
//    INCREMENT BY 1
//    START WITH 1
//    MINVALUE 1
//    MAXVALUE 9999
//    NOCYCLE
//    NOCACHE
//    NOORDER;
	// 기본 사용법 
	// INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
//    VALUES (emp_seq.NEXTVAL
//            , 'TIGER'
//            , 'ANALYST'
//            , 7566
//            , TRUNC(SYSDATE)
//            , 3000
//            , NULL
//            , 20)
	
	// id(sequence 만들어서 자동생성), 작성자(자동), 제목, 내용, 등록날짜(자동), 조회수(기본:0) 
/*
	CREATE TABLE BOARDER_JAVA(
		    id int(20) NOT NULL,  
		    writer varchar2(30) NOT NULL, 
		    subject varchar2(100) NOT NULL,
	content varchar2(2000) NOT NULL,
	regDate varchar2(30) NOT NULL,
    viewsCount int(20) NOT NULL,
   CONSTRAINT pk_boarder_java PRIMARY KEY(id)  -- 기본키 지정
		);
	*/

	/*
	 샘플로 데이터 한번 입력 해보기. 
	 insert into BOARDER_JAVA values (boarder_seq.NEXTVAL,'이상용','제목1','내용1','2024-03-15:16:25:00',0);
	 */
//	조회해서 자동 증가하는 부분 확인함.
//	select * from BOARDER_JAVA;
	
//	화면구현
	
//	1) 조회하는 화면, Member_List 참고하기.
	
	
}
