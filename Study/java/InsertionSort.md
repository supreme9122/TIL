# 삽입 정렬

#### 삽입 정렬의 경우 키 변수를 기억하자.

- ##### 손안에 카드를 정렬하는 방법과 유사하다.

  - 새로운 카드를 기존에 정렬된 카드 사이에 올바르게 삽입 하는 것.
  - 새로 삽입될 카드 수 만큼 반복되면 모든 카드가 정렬 된다.

- ##### 두번 째 자료(정렬 될 값)부터 시작하여 그 앞의 자료들과 비교하여 삽입할 위치를 지정한다.

  - 두 번째 자료는 첫 번째 자료

    세 번째 자료는 두 번째, 첫 번째 자료

    네 번째 자료는 세 번째, 두 번째, 첫 번째 자료 .......

    비교한 후 자료가 삽입될 위치를 찾는다.



![초기값 설정](C:\Users\supre\Desktop\Github\img\InsertionSort\초기값 설정.png)

![1회전](C:\Users\supre\Desktop\Github\img\InsertionSort\1회전.png)



![2회전](C:\Users\supre\Desktop\Github\img\InsertionSort\2회전.png)





![3회전](C:\Users\supre\Desktop\Github\img\InsertionSort\3회전.png)



![4회전](C:\Users\supre\Desktop\Github\img\InsertionSort\4회전.png)

##### < 코드 >

```java
public class InsertionSort{
    public static void main(String[] args){
        int a[] = {8,5,4,7,6};
        int k=0;
        int temp=0;

        //최초 코드
        // for(int i = 1; i < a.length; i++){      //회전 수 
        //   k = a[i];
        //     for(int j = i-1 ; j >= 0 ; j--){    //크기 비교
        //         if(k < a[j]){
        //             temp = k;      // temp = 8 
        //             k = a[j];       // a[j] = 5
        //             a[j] = temp;       // k = 8
        //         }
        //         a[j+1] = k;
        //     }
        // }


        //수정 코드
        //위에 코드를 작성 했을 때 정렬이 되지 않아
        //노트에 천천히 필기후 디버깅을 해보았더니
        //2회전 때 문제가 발생했다.
        //2회전 처음 비교 a[1] < a[2]에서는 문제가 되지 않았다.
        //두번째 크기 비교때 a[0] < a[1]의 비교를 할 때
        //k 값에 8이 저장되어 있어서 정상적인 비교가 되지 않았다.
        //k = a[i]를 1회전 때 보다 크기 비교 for문에 넣어야지 
        //k 값에 정상적으로 값이 들어 갈 것이라고 생각 하여 
        //아래 코드와 같이 변경하니 잘 되었다.
        //분석하는데 시간이 꽤나 걸렸는데 for문의 흐름을 좀 더 파악 할 수 있었다.
        for(int i = 1; i < a.length; i++){      //회전 수 
            for(int j = i-1 ; j >= 0 ; j--){    //크기 비교
                k = a[j+1];
                if(k < a[j]){
                    temp = k;
                    k = a[j];
                    a[j] = temp;
                }
                a[j+1] = k;
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
```

##### < 결과 >

```java
4
5
6
7
8
```

