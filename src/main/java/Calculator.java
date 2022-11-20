class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    //3.  위 Calculator클래스에서 짝수인지, 홀수인지 판별해주는 메서드 추가

    boolean isOdd(){
        if(this.value%2==0){
            return false;
        }
        return true;
    }

    // 4. 위 Calculator클래스에서 평균값 구하는 메서드 추가

    int avg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;

    }

}


//1. 위 Calculator 클래스를 상속하는 UpgradeCalculator를 만든다.
class UpgradeCalculator extends Calculator{

    void minus(int val){
        this.value -= val;
    }



}


//2. 위 Calculator클래스를 활용해서, 멤버 필드인 value의 크기 제한이 있는 MaxLimitCalculator클래스 만들기
class MaxLimitCalculator extends Calculator{


    //요구사항이 애매하다..
    MaxLimitCalculator(int val) {
        if (val > 100) {
            this.value=100;
        }else{
            this.value=val;
        }
    }



}