/*
*/
--bwriter 홍길동인 모든 컬럼을 뽑아내라 
select *from board where bwriter='홍길동';


select bno,btitle,bwriter from board 
where bwriter='홍길동';

select btitle,BCONTENT,BSAVEDFILE from board where bwriter='김경식';

--bno 가 1에서 10사이의 게시물을 가져오시오 
select *from board where bno>=1 and bno<=10;

--bno 가 1에서 10사이의 게시물을 가져오시오 between and 는 하나로 취급하다.
select *from board where bno between 1 and 10 ;

--bwriter 가 '홍을 포함하는' 게시물의 bno btitle bwriter%의미는 어떤게 와도 상관이 없다.
select bno,btitle,bwriter from board where bwriter LIKE '%홍%';
--select bno,btitle,bwriter from board where bwriter='홍';이거는 홍 한자만 갖고 와라 

--게시물의 제목중에 '자바가 포함되어 있는  게시물의  bno btitle bwrite
select bno,btitle,bwriter from board where btitle LIKE '%자바%';

select bno,btitle,bwriter,bcontent from board where btitle LIKE '%자바%' or BCONTENT like '%자바%';

--and 와 or 를 

--글쓴이가 '감자바' ,'김길동','라즈베리'이니 게시물의 번호 제목 글쓴이를 가져오시오 

select bno,btitle,bwriter,bcontent 
from board 
where BWRITER='감자바' or BWRITER='김길동' or BWRITER='라즈베리';

select bno,btitle,bwriter,bcontent 
from board 
where bwriter in('감자바','김길동','라즈베리');

--첨부파일 없는 게시물을 가지고 오시오 null 은 데이터가 아니다. 저의미는 null 인 데이터를 가져오라는 뜻이지만 null 은 데이터가 아니라서 is 를 쓴다.
select * from board where BORIGINALFILENAME is null;
--첨부 파일이 있는 게시물을 가지고 오시오 =은 같냐라는 의미이고 <> 은 다르냐 묻는 것이다.null 은데이터가 아니기 때문에 이렇게 비교 하면 안된다.is  는 데이터가 있냐 없냐 확인 할때 사용을 한다.
select * from board where BORIGINALFILENAME is not null;

--게시물을 작성한 사람의 이름을 가져오시오 (중복 제거하고) 가져와라 의미이다.
select distinct bwriter from board; 
--게시글을 쓴 날짜가 2016년 인 게시글을 가져오시오
select *from board where '2016.01.01'<bdate and bdate<='2016.12.31';
--게시글을 쓴 날짜가 2016년 인 게시글을 가져오시오
select *from board where bdate between'2016.01.01' and '2016.12.31';

--bno->번호,btitle->제목,bwriter->글쓴이로 컬럼 이름을 변경해서 가져오시오 결과 셋이라고 한다.as 는 생략이 가능하다. 결과셋만바뀌는 것이다 실제 결과 값이 아닌.
select bno as 번호 ,btitle as 제목,bwriter 글쓴이 from board;

/*
정렬
*/
--게시물 번호를 기준으로 올림차순으로 가져오시오 기본 생략해도 asc 
select *from board order by bno asc;
--2017 년도에 작성한 게시물의 번호를 기준으로 내림차순으로 가져오시오
select *from board where bdate between '2017.01.01' and '2017.12.31' order by bno desc; 

--글쓴이를 기준으로 1차 정렬하고 쓴 날짜를 기준으로 2차 정렬 하시오 
select *from board order by bwriter asc ,bdate desc;

/*페이징 처리*/
--저장 되어 있는 순서대로 행 번호 매기기
select rownum,bno,btitle,bwriter,bdate,bhitcount
from board;

--정렬후  번호 메기기 
select rownum,bno,btitle,bwriter,bdate,bhitcount
from (select bno,btitle,bwriter,bdate,bhitcount from board order by bno desc)
where rownum<=6;
--특정 행 번호 이하만 가져오기(Top N을 가져오기 하나씩 가져올때마다 rownum 을 먹인다. rownum 은 가져올때마다 하나씩 부여해서 앞으로 몇개를 가져올지 모른다.
select rownum,bno,btitle,bwriter,bdate,bhitcount
from (select bno,btitle,bwriter,bdate,bhitcount from board order by bno desc)
where rownum<=10;
--rownum 은 미래를 예측이 안된다.rownum>=10 이거는 불가하다. 몇개가 들어올지 몰라서 테이블을 만들어 놓고 다시 뽑아온다.
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
--행번호 범위를 이용해서 가져오기 시작행번호와 끝 행번호 사이의 게시물 가져오기 
/*
행수 구하기
*/
--전체 행수 구하기
select count(*) from board;
--count 뒤에 컬럼이 들어가게 되면은 bno 의 개수 
select count(bno) from board;

select count(bsavedfile) from board;

--특정 조건에 맞는 행수 구하기 홍길동이 아닌것의 행수가 몇개 이냐 
select count(*) from board where bwriter<>'홍길동';

select rownum,mid,mname
from(select rownum as r,mid,mname,mpassword,mdate,mtel,memail,mage,maddress
from (select mid,mname,mpassword,mdate,mtel,memail,mage,maddress 
from member order by mid desc  ) 
 where rownum <=(2*10)
 ) 
 where r>=((2-1)*10+1);
					




