class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        final int drinkServiceCnt = 10;
        final int meatPrice = 12000;
        final int drinkPrice = 2000;

        if (n >= drinkServiceCnt) {
            k = k - (n / drinkServiceCnt);
        }
        
        answer = n * meatPrice +  k * drinkPrice;
        
        return answer;
    }
}