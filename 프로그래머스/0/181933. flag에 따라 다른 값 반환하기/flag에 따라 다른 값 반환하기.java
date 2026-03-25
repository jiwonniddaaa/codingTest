class Solution {
    // 삼항연산자와 if문은 복잡도 차이 없다, 구현 복잡 시 if문 사용 / 값 1개로 결정 시 삼항연산자
    public int solution (int a, int b, boolean flag) {
        return flag == true ? (a + b) : (a - b);
    }
}
