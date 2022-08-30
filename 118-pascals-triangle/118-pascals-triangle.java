class Solution {
    List<List<Integer>> triangle = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        
        row.add(1);
        triangle.add(row);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            
            curr_row.add(1);
            
            for(int j = 1; j < i; j++){
                int num1 = prev_row.get(j-1);
                int num2 = prev_row.get(j);
                
                curr_row.add(num1 + num2);
            }
            
            curr_row.add(1);
            triangle.add(curr_row);
        }
        
        return triangle;
    }
}