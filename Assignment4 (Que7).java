/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author abdir
 */
public class Assignment4Q7 {
    
    public  static void main(String[]arg){
        int first=20;
        int last=25;
        int sum =0;
        
        for(int i=first; i<=last; i++){
            sum+=i;
        }
        System.out.println("The sum of numbers between" +first +"and"+ last+ "is:" +sum);
    }
}
