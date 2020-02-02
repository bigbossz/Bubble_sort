/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

import java.util.Scanner;

/**
 *
 * @author DS-Española
 */
public class Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: "); 
        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp;
        System.out.println("Enter "+size+" Elements:");
        
        for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
        
            for (int j = 0; j < (size-i-1); j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
            
        }
            System.out.println("Sorted Array:");
            for (int i= 0; i < size; i++) {
            System.out.println(arr[i]);
            
            }
    }
       
    }


