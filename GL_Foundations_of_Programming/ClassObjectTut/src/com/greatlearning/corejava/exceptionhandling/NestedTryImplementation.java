package com.greatlearning.corejava.exceptionhandling;



public class NestedTryImplementation {

    
    
    public static void main(String[] args) {
        int[] a = new int [10];
        String s = null;
        String s0 = "name";
        try{
            //block 1
            try{
                //block2
                try{
                    //block 3
                    //generating index out of bound
                    //System.out.println(a[23]);
                    //generating null pointer exception
                    //System.out.println(s.charAt(0));
                    //generating String index out of bound exception
                    // System.out.println(s0.charAt(8));
                    //generating uncaught exception
                    System.out.println(10/0);

                }catch(ArrayIndexOutOfBoundsException e){
                            //handling exception in block 1
                            System.out.println("handling ArrayIndexOutOfBoundsException in block 3");
                            //propagating exception to be caught by block 1
                            throw e;
                        }
                    }catch(StringIndexOutOfBoundsException e){
                        
                        System.out.println("handling StringIndexOutOfBoundsException in block 2:" + e.getMessage());
                        
                    }
                }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
                    //propagated ArrayIndexOutOfBoundsException from inner block can be caught
                    //NullPointerException generated in block 3 but is being caught in block 1
                    System.out.println("handling exception in block 1");
                    System.err.println("Exception in block 1: "+ e.getMessage());
                }
            }
            
            
//not catching arithmetic exception will cause ungracel termination of program
    
}
