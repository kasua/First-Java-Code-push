package com.class4;

import java.util.Scanner;

class ReplIt {
 public static void main(String[] args){
   int length,width;
   Scanner scan=new Scanner(System.in);
   System.out.println("Please enter the length");
   length=scan.nextInt();
   System.out.println("Please enter the width");
   width=scan.nextInt();
   
   if(length!=width) {
     System.out.println("The shape of your objec is rectangle");
     
    }else{
     System.out.println("The shape of your objec is square"); 
    }
     
   }
   
 }



