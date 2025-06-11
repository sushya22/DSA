package Array;

public class SetMatrixZero {

    public static void setRowColumnValue(int[][] arr,int row,int column)
    {
        for(int i=0;i<arr[0].length;i++)
        {  
            if(arr[row][i]!=0)
            {
            arr[row][i] = -1;
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i][column] != 0)
            {
            arr[i][column] = -1;
            }
        }
    }

    public static void setZero(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    setRowColumnValue(arr,i,j);
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void setZeroBetter(int[][] arr)
    {
        int[] rows = new int[arr.length];
        int[] columns = new int[arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for(int i = 0;i<rows.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                 if(rows[i]==1)
                 {
                      arr[i][j]=0;
                 }

                 if(columns[j]==1)
                 {
                      arr[i][j]=0;
                 }
            }    
        }
    }
    public static void main(String args[])
    {   
        int[][] arr = {{0,1,2,0},{1,4,5,2},{1,3,1,5}};
        setZeroBetter(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
