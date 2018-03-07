SELECT * from MEMBER;
SELECT * from MOBILE;
alter table MOBILE add model varchar2(20);
alter table MOBILE add telecom varchar2(5);
alter table MOBILE DROP COLUMN cutomer_name;
insert INTO MOBILE values(cutomer_num.nextval,'sangwoo','010-1234-1111','sysdate','skt','ganote');
select * from tab;
//추가
INSERT INTO USERPHONE values(seq.nextval,1,'ㅊㅊㅊ','010-999-9998','SKT');
//속성 수정
ALTER TABLE USERPHONE MODIFY(seq varchar2(20));
//이름 변경
ALTER TABLE USERPHONE RENAME COLUMN seq TO phoneId;

drop table USERPHONE;
select * from mobile;
select * from tab;

create sequence seq;
select * from user_sequences;
select * from member;
create table mobile(
    seq NUMBER primary key,
    thumbnail varchar2(20),
    model varchar2(20)
);
INSERT INTO mobile values(seq.nextval,'G6','G6');
INSERT INTO mobile values(seq.nextval,'galaxynote5','Galaxy Note5');
INSERT INTO mobile values(seq.nextval,'galaxynote8','Galaxy Note8');
desc USERPHONE;
drop table USERPHONE;
select * from mobile;
select * from tab;

create sequence seq;
select * from user_sequences;
select * from member;
create table mobile(
    seq NUMBER primary key,
    thumbnail varchar2(20),
    model varchar2(20)
);
INSERT INTO mobile values(seq.nextval,'G6','G6');
INSERT INTO mobile values(seq.nextval,'galaxynote5','Galaxy Note5');
INSERT INTO mobile values(seq.nextval,'galaxynote8','Galaxy Note8');
desc USERPHONE;
create table USERPHONE(
    phoneid varchar2(20) primary key,
    pseq NUMBER,
    mid varchar2(20),
    phonenum varchar2(20),
    telecom varchar2(20),
    foreign key(mId) references member(id),
    foreign key(pSeq) references mobile(seq)
);
select p_seq as pSeq from USERPHONE;
INSERT INTO USERPHONE values(seq.nextval,1,'ㅊㅊㅊ','010-999-9998','SKT');
select * from USERPHONE;

ALTER TABLE USERPHONE MODIFY(seq varchar2(20));
ALTER TABLE USERPHONE RENAME COLUMN seq TO phoneId;

