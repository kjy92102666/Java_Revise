*작업관리자에서 우선순위 설정이 Thread 설정.(보통:5)
==Thread==

스레드 상태 : new(탄생)-runnable(준비-running,실행중)
-watting(대기).  Object.wait()->WAITTING-runnable(준비)
-timed_waitting(시간 대기). sleep()->timed_waitting-(타임아웃)->runnable(준비)
-terminated(종료). 스레드 종료-terminated(종료).
-block(봉쇄). IO작업요청->block(봉쇄)-(작업완료)->runnable(준비)

스레드의 우선순위. 최대값(10,MAX), 최소값(1,MIN), 보통(5,NORMAL)



인터럽트(1.h/w : )






``1``