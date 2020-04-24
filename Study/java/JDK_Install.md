# JAVA 설치 과정

#### ① JDK를 설치하기 위해 [오라클 다운로드](www.oracle.com/downloads)에 접속한다.



![JDKInstall1](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall1.png)



#### 자바를 클릭 후 



#### ![JDKInstall2](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall2.png)



#### JAVA(JDK)for Developers를 클릭한다.



#### ![JDKInstall3](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall3.png)



#### 설치를 원하는 버전의 JDK를 다운로드한다.



![JDKInstall5](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall5.png)



#### 나는 windows x64를 선택했다.



#### ![JDKInstall6](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall6.png)



#### 필수 사항을 클릭 후, 다운로드 버튼을 클릭하면 아래와 같이 로그인을 하면 다운로드된다.



#### ![JDKInstall7](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall7.png)



#### ② 다운로드 완료 후 JDK 설치 경로를 지정하자. 경로를 잘 알고 있어야 한다.



![JDKInstall8](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall8.png)



#### 설치가 완료 되고실행창을 열어 sysdm.cpl을 입력하면 



![JDKInstall9](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall9.png)



#### ③ 시스템 속성에서 고급탭으로 가면 환경 변수 설정창을 띄울 수 있다, 새로 만들기 후

### 변수 이름(N) : JAVA_HOME

### 변수 값(V) 	: 처음 설치 화면에서 지정한 jdk 경로 값

#### 을 입력하자.



![JDKInstall11](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall10.png)



#### 새로 만들기

### 변수 이름(N) : CLASSPATH

### 변수 값(V)	 : %classpath%;. 

#### 을 입력하자. ※ 오타 나지 않게 주의 ※

![JDKInstall12](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall11.png)



#### 시스템 변수 중 Path변수를 찾아 편집을 열어준다.



![JDKInstall12](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall12.png)



#### 변수 편집으로 진입하여 새로 만들기 클릭!



![JDKInstall13](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall13.png)



#### %JAVA_HOME%\bin 를 입력하자 오타 나면 안됨!



![JDKInstall14](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall14.png)



#### ④ cmd창을 열어 java -version을 입력하여 java 설치가 잘 되었는지 확인한다.



#### ![JDKInstall16](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall16.png)



#### 이어서 javac를 입력하여 컴파일이 잘 되는지 확인한다.

#### javac'은(는) 내부 또는 외부 명령 실행할 수 있는 프로그램 또는 배치 파일이 아닙니다가 출력되면  					③ 환경변수 설정을 꼼꼼히 다시한번 확인하자!^^



![JDKInstall17](https://github.com/supreme9122/TIL/blob/master/img/JDK_Install/JDKInstall17.png)



#### 위와 같이 출력 된다면 자바가 정상적으로 설치 된것.