--create �� ������ ���̺��� drop �� �����.
drop table account;

create table account(
 ano varchar(20) primary key,
 aowner varchar(10) not null,
 abalance number not null
);

insert into account values('111-111','ȫ�浿',1000000);
insert into account values('222-222','������',0);
--Ŀ���� ���� ������ ������ ���̽��� ���� ��쳪 �׷� ���� ��������.
select*from account;
--Ŀ���ϱ� ���� ������� ���ư��� ����̴�.������ Ŀ�Ա����� �ѹ��� ������ ���̴�.���� �۾��� ����Ѵ�.
rollback;
select*from account;
--commit (���� �۾��� ���������� �����Ѵ�.(�ݿ��Ѵ�))
insert into account values('111-111','ȫ�浿',1000000);
insert into account values('222-222','������',0);
select*from account;
commit;

--��ɴ����� Ʈ����� ó��
update account set abalance=abalance-10000 where ano='111-111';
update account set abalance=abalance+10000 where ano='222-222';
select*from account;
rollback;
