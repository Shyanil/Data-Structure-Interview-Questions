class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Iterate over each row in the 2D image array
        for (int row[] : image) {
            // Get the length of the current row
            int length = row.length;
            
            // Loop through the first half of the row
            // The condition ensures we only process each pair once
            for (int i = 0; i < (length + 1) / 2; i++) {
                // Calculate the index of the element from the end of the row to swap with
                int oppositeIndex = length - i - 1;
                
                // Debug output for current index and its opposite index
                System.out.println("Processing row index " + i + " and opposite index " + oppositeIndex);
                
                // Swap and invert the elements at index i and oppositeIndex
                // Temporarily store the value at index i
                int temp = row[i] ^ 1;
                
                // Invert and assign the value at the opposite index to index i
                row[i] = row[oppositeIndex] ^ 1;
                
                // Invert and assign the value of temp to the opposite index
                row[oppositeIndex] = temp;
                
                // Debug output for the row state after the swap and invert
                System.out.println("Row after processing: " + java.util.Arrays.toString(row));
            }
        }
        
        // Return the modified image array
        return image;
    }
}
