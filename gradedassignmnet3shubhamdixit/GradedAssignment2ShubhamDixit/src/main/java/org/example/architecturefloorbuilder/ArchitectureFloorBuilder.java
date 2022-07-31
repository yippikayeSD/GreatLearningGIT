package org.example.architecturefloorbuilder;

import java.util.Stack;

public class ArchitectureFloorBuilder {
    /*
     * Created by DXYT on 7/31/2022 inside the package - org.example.architecturefloorbuilder
     * @author - SDixit-MSC
     */

    public void build(int[] floorSizeMaster) {

        int noOfFloors = floorSizeMaster.length;
        Stack floorBuffer = new Stack();
        boolean flag = false;
        int i =0;
        int j=0;
        System.out.println("The order of construction is as follows:");
        for(i =0; i<noOfFloors; i++){
            if(!flag){
                j=i+1;
            }
            while(j<noOfFloors){

                if(floorSizeMaster[i]<floorSizeMaster[j]){
                    floorBuffer.push(floorSizeMaster[j]);
                    j++;
                }else{
                    flag = true;
                    break;

                }
            }
            if(floorBuffer.isEmpty()){
                System.out.println("Day "+i+1+": \n" + floorSizeMaster[i]);
            }else{
                System.out.printf("Day: %d\n",i+1);
                while (!floorBuffer.isEmpty()){
                    System.out.print(floorBuffer.pop()+" ");
                }
                System.out.println();
            }
        }
    }


}
