---

---

# 조건문과 반복문(ConditionalAndLoop)

## 코드 실행 흐름 제어

#### 자바 프로그램은 main()메소드의 시작 중괄호 { 에서 끝 중괄호 } 까지 위에서 아애로 실행 하는 흐름을 가지고 있다.

#### 이런 흐름을 원하는 방향으로 바꿀 수 있게 해주는 것이 흐름 제어문이다.

![codeRunFlowControl](https://github.com/supreme9122/TIL/blob/master/img/codeRunFlowControl.JPG)

- ### 제어문의 종류

  - ### 조건문

    > #### if문
    >
    > #### switch문

  - ### 반복문

    > #### for문
    >
    > #### while문
    >
    > #### do-while문

#### 조건문의 경우 정상 흐름으로 돌아오지만, 반복문일 경우 제어문 처음으로 다시 돌아가 반복 실행하는데 이것을 루핑(looping)이라고 한다.



## 조건문(if문, switch문)

### 1. if문

![if](https://github.com/supreme9122/TIL/blob/master/img/if.png)

조건식에서는 true 또는 false 값을 산출할 수 있는 연산식이나, boolean 변수가 올 수 있다.

조건식이 true이면 블록안에를 실행하고 false이면 블록안을 실행 하지 않는다.

![if2](https://github.com/supreme9122/TIL/blob/master/img/if2.png)

중괄호 {  } 블록은 여러개의 실행문을 하나로 묶기 위해 작성된다. 

중괄호 블록을 작성하지 않으면 코드의 가독성(코드 해석)이 좋지 않고, 버그 발생의 원인이 되기도 한다.



#### Ex) if문 

```java
public class IfExample{
    public static void main(String[] args){
        int score = 93;

        if(score>=90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score<90)
        System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B 입니다.");	// 이 라인은 if문 중괄호(블록)가 없어서 들여쓰기만 된것임.
        }
    }
}
```

#### 실행결과

```java
점수가 90보다 큽니다.
등급은 A 입니다.
등급은 B 입니다.
```



참고 문서 : 이것이 자바다.(p. 108 ~ p.110)

   

