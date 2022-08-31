class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        if(rowIndex == 0) result.add(1);
        else if(rowIndex == 1){
            result.add(1);
            result.add(1);
        } else {
            result.add(1);
            
            List<Integer> prev_row = getRow(rowIndex - 1);
               
            for(int i = 0; i < rowIndex; i++){
                if(i+1 < prev_row.size()){
                    result.add(calculate(i, prev_row));
                }
            }
            
            result.add(1);
        }
            
        return result;
    }
    
    private int calculate(int i, List<Integer> prev_row){
        int num1 = prev_row.get(i);
        int num2 = prev_row.get(i+1);
        
        return num1 + num2;
    }
}