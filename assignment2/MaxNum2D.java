package assignment2;

class MaxNum2D {

    public static void main(String[] args) {
        
        float[][] example2dArray = {
            {1f, 3.4f, -1f}, 
            {92f, 100f, 4f}, 
            {-1000f, 5f}, 
            {}, 
            {0f}
        };

        printMaxNumPosition(example2dArray);
    }

    private static void printMaxNumPosition(float[][] numArrays) {

        float maxNum = 0f;
        int row = -1;
        int column = -1;

        for(int i = 0; i < numArrays.length; ++i) {
            float[] arr = numArrays[i];
            for(int j = 0; j < arr.length; ++j) {
                float num = arr[j];
                if(row < 0 || num > maxNum) {
                    maxNum = num;
                    row = i;
                    column = j;
                }
            }
        }

        String rowString = Integer.toString(row);
        String columnString = Integer.toString(column);

        String display = "Position of max is " + "(" + rowString + ", " + columnString + ")"; 

        System.out.println(display);
    }
}