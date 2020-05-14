# 선택 정렬

#### 선택 정렬의 경우 [0]인덱스 부터 시작 다음 인덱스들을 차례로 선택해서 검색하는 방식.

##### ※ 주의사항 : 회전당 각각의 인덱스와 크기 비교를 통해 검사하기 때문에 위치 이동 후 변경된 값으로 다음 검색을 해야 한다는 것.

![초기값 설정](https://github.com/supreme9122/TIL/blob/master/img/SelectSort/초기값%20설정.png)





![1회전](https://github.com/supreme9122/TIL/blob/master/img/SelectSort/1회전.png)







![2회전](https://github.com/supreme9122/TIL/blob/master/img/SelectSort/2회전.png)





![3회전](https://github.com/supreme9122/TIL/blob/master/img/SelectSort/3회전.png)





![4회전](https://github.com/supreme9122/TIL/blob/master/img/SelectSort/4회전.png)

##### < 코드 >

```java
public class Test{
    public static void main(String[] args) {
    
        int arr[] = {8,5,4,7,6};
        int temp;

        for(int i = 0; i < arr.length-1; i++){		//회전수
            for(int j = i; j < arr.length-1; j++){	//1회전당 검사 수
                if(arr[i] > arr[j+1]){				
                    temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //if문 조건식에 arr[i]의 경우 [0]인덱스가 [4]까지 검사를 해야 하기 때문에

        
        //반복문 출력값
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
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

