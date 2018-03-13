package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryPerfection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int numberOfNodes=sc.nextInt();
        int[] nodes=new int[numberOfNodes];
        for(int i=0;i<nodes.length;i++)
            nodes[i]=sc.nextInt();

        int[] arr=new int[(int) ((Math.pow(2, height)-1))];
        String temp="00";
        arr[0]=0;
        arr[1]=0;
        int index=0;
        for(int i=2;i<arr.length;i=i+index+1) {
            if (check(temp, arr)) {
                arr[i] = arr[i - 1] + 1;
                if(i==arr.length-1)
                    break;
                temp = temp.concat(String.valueOf(arr[i]));
                int templen=temp.length();
                index = 0;
                for (int j = i + 1; j <= i+templen; j++) {
                    arr[j] = Character.getNumericValue(temp.charAt(index));
                    temp = temp.concat(String.valueOf(arr[j]));
                    index++;
                }
            }
        }

        for(int i=0;i<nodes.length;i++) {
            int tempInt=arr[nodes[i]-1];
            for(int j=nodes[i]-1;j<arr.length;j++){
                if(j==arr.length-1) {
                    nodes[i] = -1;
                    break;
                }
                if(arr[j+1]>tempInt) {
                    nodes[i] = j + 2;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nodes));
    }

    public static boolean check(String temp, int[] arr){
        int count=0;
        for(int i=0;i<temp.length();i++){
            if(arr[i]==temp.charAt(i));
                count++;
        }
        if (count==temp.length())
            return true;
        else
            return false;
    }
}
