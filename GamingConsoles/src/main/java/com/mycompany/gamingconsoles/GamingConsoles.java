/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsoles;

/**
 *
 * @author Student
 */
public class GamingConsoles {

    public static void main(String[] args) {
    
       //single demension arrayy
      String [] cities={"Cape town"," Port Elizabeth","Pretoria"};
     
       //2d demsion
      int[][]gaming ={
          {1000,2000,3000},
      {2000,3000,4000},
      {1500,1100,1200},
    };
       
       System.out.println("--------------------");
       System.out.println("GAMING CONSOLE REPORT");
       System.out.println("--------------------");
        int highestTotal = 0;
        System.out.printf("%-10s %-10s %-12s %-10s\n", "PS5","XBOX","Switch","Total");
        System.out.println("-----------------------------------------------");
       
       
        for(int i=0; i<cities.length; i++){ 

            int PS5= gaming[i][0]; 

            int XBOX = gaming[i][1]; 
             int SWITCH= gaming[i][2]; 
             
             


          
    
    }
}
}
