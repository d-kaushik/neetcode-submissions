class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalColumn = matrix[0].length;

        int n = totalRow * totalColumn;
        int left=0;
        int right=n-1;

        while(left<=right) {
            int mid = left+(right-left)/2;
            int row = mid/totalColumn;
            int column = mid%totalColumn;
            int temp = matrix[row][column];

            if(temp == target) {
                return true;
            }
            if(target<temp) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}
