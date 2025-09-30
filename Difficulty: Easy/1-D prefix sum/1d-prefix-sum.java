class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int pre = 0;
        
        for(int i=0; i<arr.length; i++){
            int sum = pre + arr[i];
            ans.add(sum);
            pre = sum;
        }
        return ans;
        
    }
}