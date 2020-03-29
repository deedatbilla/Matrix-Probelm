package com.company;

import java.util.Scanner;

public class Main {




    static Matrix matrix = new Matrix();
   static Scanner input = new Scanner(System.in);

 public static int[][] randomArray(int row, int col){
     int [][] other=new int[row][col];
     for(int i =0 ;i<row; i++) {
         for (int j = 0; j <col; j++) {

             other[i][j] = i;



         }
     }
     return other;
 }

 public static void set(){
     int inputArr[]=new int[3];
     for(int i=0; i<3; i++){
         if(i==0){
             System.out.println("input x coordinate");
             inputArr[0]=input.nextInt();
         }
         if (i==1){
             System.out.println("input y coordinate");
             inputArr[1]=input.nextInt();
         }
         if (i==2){
             System.out.println(" input value");
             inputArr[2]=input.nextInt();
         }
     }
     matrix.set(inputArr[0],inputArr[1],inputArr[2]);


 }

 public static void get(){

     int inputArr2[]=new int[2];
     for(int i=0; i<2; i++){
         if(i==0){
             System.out.println("input  x coordinate");
             inputArr2[0]=input.nextInt();
         }
         if (i==1){
             System.out.println("input y coordinate");
             inputArr2[1]=input.nextInt();
         }

     }
     System.out.println("value in position(" +inputArr2[0]+","+inputArr2[1]+")"+ " is "+ matrix.get(inputArr2[0],inputArr2[1]));
 }

 public static void product(){
     System.out.println("enter coeffient");
     int in =input.nextInt();
     matrix.product(in);

 }

 public static void sum(){
 // testing with randomly generated array
     // you must pass dimens in code below to test
     System.out.println( " is " + matrix.sum( randomArray(5,5)));
 }

 public static void getRow(){

     System.out.println("number of rows = " +matrix.getRowCount());

 }

    public static void getCol(){

        System.out.println("number of cols= " +matrix.getColCount());

    }

    public static void print(){

        matrix.printMatrix();

    }

    public static  void main(String[] args) {
     boolean exit =true;





     do{

         System.out.println("select 1 to set a matrix (x,y,value) \nselect 2 to get value from matrix point(x,y) \n" +
                 "select 3 to find product of matrix (input coefficient) \nselect 4 to sum matrix with other matrix" +
                 "\nselect 5 to get number of row for matrix \nselect 6 to get number of columns for matrix " +
                 "\nselect 7 to print matrix \npress 0 to exit");
         Scanner myscanner = new Scanner(System.in);


         int option = myscanner.nextInt();


         switch (option){
             case 0:
                 exit = false;
                 break;
             case 1:
                 set();
                 break;
             case 2:
                 get();
                 break;
             case 3:
                 product();

                 break;
             case 4:
                 sum();
                 break;
             case 5:
                 getRow();
                 break;
             case 6:
                 getCol();
                 break;
             case 7:
                 print();
                 break;



         }





     }while (exit);



	// write your code here
//        Matrix matrix = new Matrix();
//        matrix.set(3,3,6);
//        matrix.set(2,2,5);
//        matrix.set(8,8,10);
//        //matrix.getMatrix();
//        //System.out.println(matrix.get(1,5));
//        //matrix.product(4);
//        matrix.printMatrix();
        //System.out.println(matrix.get(4,4));

        //System.out.println(matrix.getRowCount() + " " +matrix.getColCount());
        //matrix.printMatrix();



    }
}
