package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix {

    int matrix[][];
    int [][]tempMatrix;
    boolean moode ;

    List <Integer> value,x,y;



    public Matrix() {
        this.x=new ArrayList<>();
        this.y=new ArrayList<>();
        this.value=new ArrayList<>();
        this.moode=false;





    }



    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


    public void process(){
        int maxX=  Collections.max(this.x);
        int maxY = Collections.max(this.y);

        int xx =0,yy=0,val=0;
        this.matrix=new int[maxX+1][maxY+1];






        for(int z= 0; z<this.x.size();z++) {
            xx = this.x.get(z);
            yy = this.y.get(z);
            val = this.value.get(z);
            this.matrix[xx][yy] = val;
        }



    }
    public void printMatrix() {
        if(this.moode) {
            process();
        }
            for (int[] row : this.matrix) {
                printRow(row);
            }
            this.moode=false;

    }

    public void set(int x, int y, int value) {

        this.x.add(x);
        this.y.add(y);
        this.value.add(value);
        this.moode=true;










    }
    public int get(int x, int y) {
        process();
        return this.matrix[x][y ];
    }

    public void product(int coefficient) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {

                this.matrix[i][j] *= coefficient;


            }
        }


    }

    public boolean sum(int otherMatrix[][]) {
        process();
        boolean isqual = false;
        if (this.matrix.length == otherMatrix.length && this.matrix[0].length == otherMatrix[0].length) {
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {

                    this.matrix[i][j] = this.matrix[i][j] + otherMatrix[i][j];


                }
            }
            isqual = true;
        }


        return isqual;
    }

    public int getRowCount(){
        return this.matrix.length;
    }
    public int getColCount(){
        return this.matrix[0].length;
    }
}
