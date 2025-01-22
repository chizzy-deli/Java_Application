public class EnhancedForLoopInMultiDimensionalArrays{
	public static void main(String[] args){
		
		int[][] array = {{3,4,5},{4,5,6},{7,8,9}};
		
		for (int[] row : array)
        {
        
          for (int column : row)
            // System.out.printf("%d ", column);
		 
		      System.out.printf("Elements at index  [%d] = %d%n ",column,array[column]);
		 
               System.out.println();
		
			
		}
	}
}