class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0) return new int[] {};
        
        int row = mat.length;
        int col = mat[0].length;
        
        int x = 0, y = 0;
        
        int totalSize = row * col;
        
        int[] result = new int[totalSize];
        
        for(int i = 0; i < totalSize; i++){
            result[i] = mat[y][x];
            
            boolean isEven = (x + y) % 2 == 0;
            
            if(isEven){
                if(x < col-1 && y > 0){
                    // going up and right
                    x++;
                    y--;
                } else if(x < col-1){
                    // going right
                    x++;
                } else {
                    // going down
                    y++;
                }
            } else {
                if(y < row-1 && x > 0){
                    // going down and left
                    x--;
                    y++;
                } else if(y < row-1){
                    // going down
                    y++;
                } else {
                    // going right
                    x++;
                }
            }
        }
        
        return result;
    }
}
    