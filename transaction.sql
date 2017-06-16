--create 로 생성된 테이블은 drop 로 지운다.
drop table account;

create table account(
 ano varchar(20) primary key,
 aowner varchar(10) not null,
 abalance number not null
);

insert into account values('111-111','홍길동',1000000);
insert into account values('222-222','스프링',0);
--커밋을 하지 않으면 데이터 베이스를 껏을 경우나 그런 경우는 없어진다.
select*from account;
--커밋하기 전에 원래대로 돌아가는 방법이다.마지막 커밋까지만 롤백이 가능한 것이다.현재 작업을 취소한다.
rollback;
select*from account;
--commit (현재 작업을 영구적으로 저장한다.(반영한다))
insert into account values('111-111','홍길동',1000000);
insert into account values('222-222','스프링',0);
select*from account;
commit;

--기능단위의 트랜잭션 처리
update account set abalance=abalance-10000 where ano='111-111';
update account set abalance=abalance+10000 where ano='222-222';
select*from account;
rollback;
