# Linux 수행 명령어

### CentOS 설치후 해야할 작업들

1. IP주소 셋팅

   vi /etc/sysconfig/network-scripts/ifcfg-eth0

 2. HOSTNAME,GATEWAY 셋팅
    
vi /etc/sysconfig/network
    
 3. DNS 셋팅
    
vi /etc/resolv.conf
    
 4. IP주소, HOSTNAME을 매핑
    
    vi /etc/hosts

#### CentOS ~5, 6

1. IP셋팅	/etc/sysconfig/network-scripts/ifcfg-xxxx

   ​																				eth0 -> ethernet 첫번째 카드

 2. Gateway	/etc/sysconfig/network

 3. DNS		/etc/resolv.conf

 4. HOSTNAME	/etc/sysconfig/network

 5. Service 구동/정지/재구동
    > service  서비스명  start
    >
    > service  서비스명  stop
    >
    > service  서비스명  restart



#### CentIS 7, 8~

1. ip셋팅  /etc/sysconfig/network-scripts/ifcfg-xxx
   7,8이후 부터는 eth말고 랜덤으로 변경된다

2. Gateway /etc/sysconfig/network-scripts/ifcfg-xxx

3. DNS /etc/sysconfig/network-scripts/ifcfg-xxx 여길 수정하면 resolv.conf가 자동수정된다

4. HOSTNAME /etc/hostname

5. Service 구동/정지/재구동(과거의 호환성으로 이전 명령어도 지원)

   > service  start  서비스명 
   >
   > service  stop  서비스명
   >
   > service  restart  서비스명



LAN - Token Ring, Token BUS, Ethernet 과같은 프로토콜들 사용, 지금은 이더넷만 사용
LAN Card or Ethernet Card라는 이름으로 부름
WAN - HDLC, PPP, Frame-Relay

 

권한 올리는 명령어
runas - window
sudo - linux

ls : list의 약자 파일들을 리스트형태로 보여줌
md : make directory
rd : remove directory
cd : change directory





#### Linux 시스템 종료 및 재부팅
1. 종료
  halt, init 0, shutdown -h

  

2. 재부팅
  reboot, init 6, shutdown -r

  

3. shutdown 옵션
  shutdown -h now 지금바로
  shutdown -h +5 5분 후에 종료
  shutdown -h 16:00  16시00분에 종료

which poweroff 명령으로 확인하면 symbolic link로 연결된 가짜 명령어 임을 알 수 있다.



#### init 런레벨 : 런레벨 별 모드를 잘 확인

| 런레벨 | 영문 모드                    | 설명                                                         | 비고                                   |
| ------ | ---------------------------- | ------------------------------------------------------------ | -------------------------------------- |
| 0      | Power Off, halt, shutdown -h | 종료 모드                                                    |                                        |
| 1      | Rescue                       | 시스템 복구 모드<br />오프라인으로 접근 무조건<br />root로 들어가게 됨. | Single user mode<br />단일 사용자 모드 |
| 2      | Multi-User                   | 관리자or일반 사용자로 들어감<br />단 네트워크 기능은 제외됨. |                                        |
| 3      | Multi-User                   | 텍스트 모드의 다중 사용자 모드<br />보통의 서버 시작모드 차이점<br />3은 텍트스까지만 5는 GUI까지<br />부팅된다.<br />자원을 낭비하지 않기 위해.... | Full Multi Mode                        |
| 4      | Multi-User(unused)           |                                                              | 사용하지 않음                          |
| 5      | Graphical(X11)               | 그래픽 모드의 다중 사용자 모드<br />GUI까지 같이 부팅된다.   |                                        |
| 6      | Reboot, shutdown -r          | 재부팅                                                       |                                        |

##### ※ centos 5 에서 /etc/inittab의 id:런레벨:initdefault 부분의 런레벨을 바꾸면 default런레벨을 변경할 수 있다.



#### history 명령어 (기존 사용했던 명령어 목록)
history : 기존 사용했던 명령어 목록
history -c : 기존 사용했던 명령어 목록 클리어
!! : 직전 사용했던 명령어 재실행
!-5 : 지금으로 부터 5번 전에 실행했던 명령어 재실행
!5 : 명령어 목록중 5번 명령어 재실행
!명령어 : 가장 최근 실행했던 명령어 재실행

