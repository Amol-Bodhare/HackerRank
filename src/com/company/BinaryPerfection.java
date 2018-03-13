package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryPerfection {
    public static void main(String[] args) {
        int[] arr=new int[7];
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

        System.out.println(Arrays.toString(arr));
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
