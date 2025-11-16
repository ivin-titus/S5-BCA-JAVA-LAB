/*
QP CODE: S508FN01

2. Create  a  class  called  Matrix  which  contains  a  two-dimensional  integer  array,  m,  n 
(order of the matrix) as data members. Include the following  member functions  
 To read the matrix  
 To display the matrix 
 To find the transpose of the matrix.
*/

import java.util.Scanner;

class Matrix {
    int a[][];
    int m, n;

    Matrix(int r, int c) {
        m = r;
        n = c;
        a = new int[m][n];
    }

    // To read the matrix
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
    }

    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    Matrix transpose() {
        Matrix t = new Matrix(n, m);
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                t.a[j][i] = a[i][j];
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        Matrix m1 = new Matrix(r, c);

        m1.read();

        System.out.println("Original:");
        m1.display();

        Matrix t = m1.transpose();

        System.out.println("Transpose:");
        t.display();
    }
}
