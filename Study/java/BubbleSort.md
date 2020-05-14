# 버블 정렬

#### 버블 정렬의 경우 거품이 옆으로 이동하면 바로 옆에 있는 자료를 비교한다는 것을 기억하자.

- 첫 번째 자료와 두 번째 자료를, 두 번째 자료와 세 번째 자료를, ㆍㆍㆍㆍ 이런 식으로 (마지막-1) 번째 자료와 마지막 자룔를 비교하여 교환하면서 자료를 정렬한다.
- 1회전을 수행하면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외 한다.



![초기값 설정](https://github.com/supreme9122/TIL/blob/master/img/BubbleSort/초기값 설정.png)



![1회전](C:\Users\supre\Desktop\Github\img\BubbleSort\1회전.png)



![2회전](C:\Users\supre\Desktop\Github\img\BubbleSort\2회전.png)



```java
public class Test{
    public static void main(String[] args) {
    
        int arr[] = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
        int temp;

        for(int i = 0; i < arr.length-1; i++){          //회전수
            for(int j = 0; j < arr.length-i-1; j++){    //1회전당 검사 수 
                //j = 0으로 시작해야 0번부터 새로 다시 검색한다.
                //버블 정렬은 1회전이 끝나면 마지막 값이 최대값이다.
                //따라서 j < arr.length-i-1을 해야 마지막 값을 검사 하지 않는다.
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //반복문 출력값
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
```

