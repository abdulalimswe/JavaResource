class TwoD{
    public static void main(String[] args){
        int[][] arr;
        arr = new int[10][10];

        arr[0][0] = 24;

        System.out.println(arr[0][0]);

        int arr2[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {1,2,3,4,5}
        };

        for(int i = 0; i< arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}