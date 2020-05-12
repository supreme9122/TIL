# Git 과 GitHub란?

- 버전관리 툴
  (버전별 백업관리, 형상관리)
- 통상 프로젝트를 진행 할 때 수정사항이 발생하면 수정 내용과 날짜 및 버전 정보를 파일명에 표시하고 저장을 해야 할것이다. 이렇게 무자비하게 보관하다보면 용량 부담이 클것이다. 이런 점을 보안하기 위해 만든 것이 Git이다.

# Git과 Github의 차이점

Git은 버전관리 위한 소프트웨어
Github은 Git으로 Local내 저장돼서 원격전송된 내역들이 저장되는 공간을 제공하는 서비스이다.

ex)
Git은 영상을 찍는 앱
Github는 유튜브로 생각하기

#  Git 명령어
###  $ git init

>Windows Terminal 또는 Git Bash에서 이동한 경로 (ex : c:\user\name\GitTest\....)내에 .git이라는 투명한 폴더의 Git의 Local내 저장소를 만들게 된다. 한번 지정하고 나면 그후로 지정할 필요가 없음.

###  $ git status

>저장소의 상태를 확인하기 위해 사용 하는 명령어.
>현재 브랜치의 이름과 추가변경된 파일 및 디렉토리 목록을 표시

### $ git add -A 

>변동이 있는 파일 및 폴더(수정, 추가, 삭제) 전체를 저장소(.git)에 저장

### $ git add name

>변동 파일 및 폴더의 name(제목)을 저장소(.git)에 저장

### $ git commit -m "(작업수행내용)"
>수행된 작업을 기록하는것.
>-a옵션 지정시 변경된 파일을 검색하고 인덱스에 추가하는 작업도 동시에 실행
>
>ex) git commit -am "A first commit"

### $ git remote

>원격 저장소를 조작하는데 사용

- git remote : 원격 저장소의 이름 목록 표시
- git remote -v : 원격 저장소에 대한 자세한 목록
- git remote add [name] [url] : 원격 저장소 추가
- git remote remove [name] : 원격 저장소를 제거

### $ git push [name] master

>마지막 commit 내용을 원격저장소(GitHub)로 전송한다.
>
>TIP 경고를 무시하고 강제로 push 하기
>
>[방법 1] -f 옵션
>–force 옵션과 동일하다.
>
>$ git push origin [branch name] -f
>
>[방법 2] +[branch name]
>해당 branch를 강제로 push한다.
>
>$ git push origin +[branch name]

### $ git branch

>브랜치에 대한 다양한 작업을 수행하기 위한것.
- git branch [branch-name] : 브랜치 만들기
- git branch : 브랜치 목록보기
- git branch -d [branch-name] : 지정한 브렌치를 삭제

### $ git branch -d 브랜치 이름

>브랜치 삭제

### $ git branch -D

>병합하지 않은 브랜치 강제 삭제

### $ git checkout
>로컬 저장소의 브랜치를 전활 할때 사용.

### $ git log 
>지금까지 해왔던 작업 기록을 확인하는것.

### $ git grep
>저장소의 파일 내용에서 검색하고자 할 때 사용.
- git grep"검색 단어"

### $ git merge
>현재 브랜치에 다른 지점에서 변경 사항을 병합할때 사용

### $ git log -p

>지금까지 작업 했던 내역을 출력해줌(자세하게)

### $ git diff

>현재 작업중인 변경사항을 보여줌 (commit 전)

### $ git commit -a

>git add없이 바로 업로드

### $ git commit -am

>git commit -a, git commit -m을 동시에 적용



### $ git clone [url] (저장할 폴더 이름``생략가능``)

>기존 원격 저장소를 로컬에 다운로드하기 위하여 사용하는것.

### $ git reset --hard ******(로그 앞 6자리)

>과거 내용을 원상태로 복원하는것.

### $ git pull [name] master

>원격 브랜치의 변경 사항을 캡처하기 위해서 사용



### $ git reset head [file]

>git add 취소하기(파일 상태를 Unstage로 변경)
>
>뒤에 파일명이 없으면 add한 전체를 취소한다.



### $ git reset

>[방법 1] commit을 취소하고 해당 파일들은 staged 상태로 워킹 디렉터리에 보존
>
>```
>$ git reset --soft HEAD^
>```
>
>[방법 2] commit을 취소하고 해당 파일들은 unstaged 상태로 워킹 디렉터리에 보존
>
>```
>$ git reset --mixed HEAD^ // 기본 옵션
>
>$ git reset HEAD^ // 위와 동일
>
>$ git reset HEAD~2 // 마지막 2개의 commit을 취소
>```
>
>[방법 3] commit을 취소하고 해당 파일들은 unstaged 상태로 워킹 디렉터리에서 삭제
>
>```
>$ git reset --hard HEAD^
>```




*** git 명령어 관련 좋은 블로그**

[빨간당무 마을](https://redcarrot.tistory.com/227)

[Heee's Development](https://gmlwjd9405.github.io/2018/05/25/git-add-cancle.html)