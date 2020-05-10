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
                    temp = k;      // temp = 8 
                    k = a[j];       // a[j] = 5
                    a[j] = temp;       // k = 8
                }
                a[j+1] = k;
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}