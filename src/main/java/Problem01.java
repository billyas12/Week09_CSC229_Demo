/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){
            for (; j<=n;  j=j*2){
                 //System.out.print("A'");
                 x++;
            }
        }
         for (;k<=j*j; k++){
            //System.out.print("A'");
            y++;
         }

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
    
    public static void func2(int n){
        int k,j,i=n;
        while(i>1){
            j=1;
            while(j<n){
                k=0;
                while(k<n){
                    k=k+2;
                   
                }
                j=j*2;
            }
            i=i/2;
        }
       
    }
    
   // also discuss T(n) = 3 T(n/4) + n
    // This equation is a dividing function
    //a = 3 b = 4 log3 4= 1.26185 f(n) = n c = 1
    // Case 1
    // O(n^log3 4)
    
    
}
