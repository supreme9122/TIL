# mysql dump에 관하여...

### dump란...

export다. database를 옮기는 작업을 진행 할 때 사용한다. 



### 사용 방법

##### 1. db server 접속, db 계정 로그인,db 정보 확인

* db server IP
* db username, password
* db name



##### dump 명령어
​			**//database만 dump**
​					mysqldump -u root -p [db명] > [dump파일명].sql

​			 ex) mysqldump -u root -p konetic > db_20200715.sql



​			**//database의 table dump**

​					mysqldump -u root -p db명 table명 > [dump파일명].sql



​			**//database의 특정 table 빼기**
​					mysqldump -u root -p db명 --ignore-table=db명.table명 > [dump파일명].sql



##### import 명령어

​			**//database import**
​					mysql -u root -p < [dump파일명].sql

​		  **//database의 table import**
​					mysql -u username -p 현재db명 < [dump파일명].sql