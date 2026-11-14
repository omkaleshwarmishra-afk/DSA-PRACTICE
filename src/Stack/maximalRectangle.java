//package Stack;
//
// class maximalRectangle {
//
//     public int Solution(char[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//
//         int[] heights = new int[cols];
//
//         int maxArea = -1;
//
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == '1') {
//                     heights[j]++;
//                 } else {
//                     heights[j] = 0;
//                 }
//             }
//             int area = getMaxArea(heights);
//             maxArea = Math.max(maxArea);
//         }
//         return maxArea;
//
//     }
