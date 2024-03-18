CREATE TABLE TEST_JAVA(
    id varchar2(20) NOT NULL, --아이디 // 없는게 정상, primary key  에 포함. 
    pwd varchar2(30) NOT NULL, --비밀번호
    name varchar2(30) NOT NULL, -- 이름
    CONSTRAINT pk_member_java PRIMARY KEY(id)  -- 기본키 지정
);
commit;
insert into TEST_JAVA values ('lsy','1234','이상용');
insert into TEST_JAVA values ('lsy2','1234','이상용2');
insert into TEST_JAVA values ('lsy3','1234','이상용3');
select * from TEST_JAVA;
SELECT id,pwd,name FROM TEST_JAVA;

select * from tb_member;
select * from tb_member where id = 'lsy';



CREATE SEQUENCE boarder_seq
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 9999
    NOCYCLE
    NOCACHE
    NOORDER;
    
    
    
    CREATE TABLE BOARDER_JAVA(
		    id number(20) NOT NULL,  
		    writer varchar2(30) NOT NULL, 
		    subject varchar2(100) NOT NULL,
	content varchar2(2000) NOT NULL,
	regDate varchar2(30) NOT NULL,
    viewsCount number(20) NOT NULL,
		    CONSTRAINT pk_boarder_java PRIMARY KEY(id)  -- 기본키 지정
		);
        
        insert into BOARDER_JAVA values (boarder_seq.NEXTVAL,'이상용','제목1','내용1','2024-03-15:16:25:00',0);
        insert into BOARDER_JAVA values (boarder_seq.NEXTVAL,'이상용2','제목2','내용2','2024-03-15:16:35:00',0);
        insert into BOARDER_JAVA values (boarder_seq.NEXTVAL,'이상용3','제목3','내용3','2024-03-15:16:45:00',0);
        commit;
select * from BOARDER_JAVA;
select * from BOARDER_JAVA order by regDate desc;

select * from BOARDER_JAVA where id=5;

update BOARDER_JAVA set subject='변경제목4', content='변경내용4' where id=5;
commit;







