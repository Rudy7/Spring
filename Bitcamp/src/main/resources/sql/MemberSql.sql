SELECT * from MEMBER;
SELECT * from MOBILE;
alter table MOBILE add model varchar2(20);
alter table MOBILE add telecom varchar2(5);
alter table MOBILE DROP COLUMN cutomer_name;
insert INTO MOBILE values(cutomer_num.nextval,'sangwoo','010-1234-1111','sysdate','skt','ganote');
select * from tab;