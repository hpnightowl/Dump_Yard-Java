/*
author: Harsh Pal 
*/
import java.util.Scanner;

public class Main
{
    public int row;
    public int column;
    public int[][] a;
    public int[][] transpose;
    public int[][] b;
    public int[][] result;
    public int scal;

    
    public static void main(String[] args)
    {
           Scanner in = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rowA = in.nextInt();
            System.out.print("Enter number of columns: ");
            int columnA = in.nextInt();
            Main data = new Main(rowA, columnA);
            data.getData();
            data.addition();
            data.sort();
            data.multiplication();
            data.transpose();
    }


    public Main(int ro, int col)
    {
        row = ro;
        column = col;
        a = new int [row][column];
        scal = 0;
    }

    public void getData()
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < row; i++)
        {  
            int u = i + 1;
            System.out.print("Enter values of row " + u + ": ");
            for (int j = 0; j < column; j++)
            {  
                a[i][j] = in.nextInt();
            }
        }
        System.out.println();
    }

    public static void printdata(int[][] Main, int width)
    {
        for (int i = 0; i < Main.length; i++)
        {
            for (int j = 0; j < Main[i].length; j++)
            {              
                System.out.print(Main[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transpose()
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Second Main: ");

        int[][] b = new int[row][column];
        for (int i = 0; i < row; i++)
        {  
            int u = i + 1;
            System.out.print("Enter values of row " + u + ": ");
            for (int j = 0; j < column; j++)
            {  
                b[i][j] = in.nextInt();
            }
        }
        System.out.println();

        transpose = new int [row][column];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                transpose[i][j] = a[j][i];
            }                
        }
        System.out.println("Result:");
        printdata(transpose, column);
        
        transpose = new int [row][column];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                transpose[i][j] = b[j][i];
            }                
        }
        System.out.println("Result:");
        printdata(transpose, column);
    }

    public void addition()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Second Main: ");

        int[][] b = new int[row][column];
        for (int i = 0; i < row; i++)
        {  
            int u = i + 1;
            System.out.print("Enter values of row " + u + ": ");
            for (int j = 0; j < column; j++)
            {  
                b[i][j] = in.nextInt();
            }
        }
        System.out.println();

        int[][] add = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                add[i][j] = a[i][j] + b[i][j];
            }
        }       
        System.out.println("Result:");
        printdata(add, column);
    }

    public void sort()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Second Main: ");

        int[][] b = new int[row][column];
        for (int i = 0; i < row; i++)
        {  
            int u = i + 1;
            System.out.print("Enter values of row " + u + ": ");
            for (int j = 0; j < column; j++)
            {  
                b[i][j] = in.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
 
            for (int j = 0; j < a[i].length; j++) {
 
                for (int k = 0; k < a[i].length - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                         int t = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = t;
                    }
                }
            }
        }
        System.out.println("Result:");
        printdata(a, column);

                for (int i = 0; i < a.length; i++) {
 
            for (int j = 0; j < a[i].length; j++) {
 
                for (int k = 0; k < b[i].length - j - 1; k++) {
                    if (b[i][k] > b[i][k + 1]) {
                         int t = b[i][k];
                        b[i][k] = b[i][k + 1];
                        b[i][k + 1] = t;
                    }
                }
            }
        }
        System.out.println("Result:");
        printdata(b, column);
    }

    

    public void multiplication()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Second Main: ");

        System.out.print("Enter number of rows: ");
        int rowB = in.nextInt();
        System.out.print("Enter number of columns: ");
        int columnB = in.nextInt();

        if (column != rowB)
        {
            System.out.println("Dimensions mismatch! Unable to complete the computation!!! DUMMY");
        }
        else
        {
            int[][] b = new int[rowB][columnB];
            for (int i = 0; i < rowB; i++)
            {  
                int u = i + 1;
                System.out.print("Enter values of row " + u + ": ");
                for (int j = 0; j < columnB; j++)
                {  
                    b[i][j] = in.nextInt();
                }
            }
            System.out.println();

            int[][] mult = new int[row][columnB];

            for(int i = 0; i < row; i++)
            {
                for (int j = 0; j < columnB; j++)
                {
                    int sum = 0;
                    for(int k = 0; k < rowB; k++)
                    {
                        sum = sum + ( a[i][k] * b[k][j] );
                    }
                    mult[i][j] = sum;
                }
            }
            System.out.println("Result:");
            printdata(mult, columnB);
        }
    }
}