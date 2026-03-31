class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        int[] ans = new int[2];
        for(int i=0;i<N;i++){
            for (int j=i;j<N;j++){
                if(numbers[i] + numbers[j] == target){
                    if(i == j) continue;
                    ans[0] = i+1;
                    ans[1] = j+1;
                    break;
                }
            }
        }

        return ans;
    }
}
