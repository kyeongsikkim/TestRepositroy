/*
*/
--bwriter ȫ�浿�� ��� �÷��� �̾Ƴ��� 
select *from board where bwriter='ȫ�浿';


select bno,btitle,bwriter from board 
where bwriter='ȫ�浿';

select btitle,BCONTENT,BSAVEDFILE from board where bwriter='����';

--bno �� 1���� 10������ �Խù��� �������ÿ� 
select *from board where bno>=1 and bno<=10;

--bno �� 1���� 10������ �Խù��� �������ÿ� between and �� �ϳ��� ����ϴ�.
select *from board where bno between 1 and 10 ;

--bwriter �� 'ȫ�� �����ϴ�' �Խù��� bno btitle bwriter%�ǹ̴� ��� �͵� ����� ����.
select bno,btitle,bwriter from board where bwriter LIKE '%ȫ%';
--select bno,btitle,bwriter from board where bwriter='ȫ';�̰Ŵ� ȫ ���ڸ� ���� �Ͷ� 

--�Խù��� �����߿� '�ڹٰ� ���ԵǾ� �ִ�  �Խù���  bno btitle bwrite
select bno,btitle,bwriter from board where btitle LIKE '%�ڹ�%';

select bno,btitle,bwriter,bcontent from board where btitle LIKE '%�ڹ�%' or BCONTENT like '%�ڹ�%';

--and �� or �� 

--�۾��̰� '���ڹ�' ,'��浿','�����'�̴� �Խù��� ��ȣ ���� �۾��̸� �������ÿ� 

select bno,btitle,bwriter,bcontent 
from board 
where BWRITER='���ڹ�' or BWRITER='��浿' or BWRITER='�����';

select bno,btitle,bwriter,bcontent 
from board 
where bwriter in('���ڹ�','��浿','�����');

--÷������ ���� �Խù��� ������ ���ÿ� null �� �����Ͱ� �ƴϴ�. ���ǹ̴� null �� �����͸� ��������� �������� null �� �����Ͱ� �ƴ϶� is �� ����.
select * from board where BORIGINALFILENAME is null;
--÷�� ������ �ִ� �Խù��� ������ ���ÿ� =�� ���Ķ�� �ǹ��̰� <> �� �ٸ��� ���� ���̴�.null �������Ͱ� �ƴϱ� ������ �̷��� �� �ϸ� �ȵȴ�.is  �� �����Ͱ� �ֳ� ���� Ȯ�� �Ҷ� ����� �Ѵ�.
select * from board where BORIGINALFILENAME is not null;

--�Խù��� �ۼ��� ����� �̸��� �������ÿ� (�ߺ� �����ϰ�) �����Ͷ� �ǹ��̴�.
select distinct bwriter from board; 
--�Խñ��� �� ��¥�� 2016�� �� �Խñ��� �������ÿ�
select *from board where '2016.01.01'<bdate and bdate<='2016.12.31';
--�Խñ��� �� ��¥�� 2016�� �� �Խñ��� �������ÿ�
select *from board where bdate between'2016.01.01' and '2016.12.31';

--bno->��ȣ,btitle->����,bwriter->�۾��̷� �÷� �̸��� �����ؼ� �������ÿ� ��� ���̶�� �Ѵ�.as �� ������ �����ϴ�. ����¸��ٲ�� ���̴� ���� ��� ���� �ƴ�.
select bno as ��ȣ ,btitle as ����,bwriter �۾��� from board;

/*
����
*/
--�Խù� ��ȣ�� �������� �ø��������� �������ÿ� �⺻ �����ص� asc 
select *from board order by bno asc;
--2017 �⵵�� �ۼ��� �Խù��� ��ȣ�� �������� ������������ �������ÿ�
select *from board where bdate between '2017.01.01' and '2017.12.31' order by bno desc; 

--�۾��̸� �������� 1�� �����ϰ� �� ��¥�� �������� 2�� ���� �Ͻÿ� 
select *from board order by bwriter asc ,bdate desc;

/*����¡ ó��*/
--���� �Ǿ� �ִ� ������� �� ��ȣ �ű��
select rownum,bno,btitle,bwriter,bdate,bhitcount
from board;

--������  ��ȣ �ޱ�� 
select rownum,bno,btitle,bwriter,bdate,bhitcount
from (select bno,btitle,bwriter,bdate,bhitcount from board order by bno desc)
where rownum<=6;
--Ư�� �� ��ȣ ���ϸ� ��������(Top N�� �������� �ϳ��� �����ö����� rownum �� ���δ�. rownum �� �����ö����� �ϳ��� �ο��ؼ� ������ ��� �������� �𸥴�.
select rownum,bno,btitle,bwriter,bdate,bhitcount
from (select bno,btitle,bwriter,bdate,bhitcount from board order by bno desc)
where rownum<=10;
--rownum �� �̷��� ������ �ȵȴ�.rownum>=10 �̰Ŵ� �Ұ��ϴ�. ��� ������ ���� ���̺��� ����� ���� �ٽ� �̾ƿ´�.
select r,bno,btitle,bwriter,bdate,bhitcount
from(
  select rownum as r,bno,btitle,bwriter,bdate,bhitcount
  from (
  select bno,btitle,bwriter,bdate,bhitcount from board order by bno desc
  )
  --  where rownum <=(pageNo*rowsPerPage)(2*10)
   where rownum <=(2*10)
  )
--where r>=((PageNo-1)*rowsPerPage+1);((2-1)*10+1)
 where r>=((2-1)*10+1);
--���ȣ ������ �̿��ؼ� �������� �������ȣ�� �� ���ȣ ������ �Խù� �������� 
/*
��� ���ϱ�
*/
--��ü ��� ���ϱ�
select count(*) from board;
--count �ڿ� �÷��� ���� �Ǹ��� bno �� ���� 
select count(bno) from board;

select count(bsavedfile) from board;

--Ư�� ���ǿ� �´� ��� ���ϱ� ȫ�浿�� �ƴѰ��� ����� � �̳� 
select count(*) from board where bwriter<>'ȫ�浿';

select rownum,mid,mname
from(select rownum as r,mid,mname,mpassword,mdate,mtel,memail,mage,maddress
from (select mid,mname,mpassword,mdate,mtel,memail,mage,maddress 
from member order by mid desc  ) 
 where rownum <=(2*10)
 ) 
 where r>=((2-1)*10+1);
					




