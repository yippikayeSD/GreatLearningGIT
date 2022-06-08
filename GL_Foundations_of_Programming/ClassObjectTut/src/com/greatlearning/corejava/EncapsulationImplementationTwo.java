package com.greatlearning.corejava;

class DrivingLicenseIssue{
    private int age;
    private boolean decision;
    public void setAge(int age) {
        this.age = age;
    }
    public void setDecision() {
        if(18<=age&&age<=60){
            decision = true;
            
        }else {
            decision = false;
            
        }
    }
    public int getAge() {
        return age;
    }
    public boolean getDecision(){
        return decision;
    }
}
public class EncapsulationImplementationTwo {
public static void main(String[] args) {
    DrivingLicenseIssue issuer = new DrivingLicenseIssue();
    issuer.setAge(45);
    issuer.setDecision();
    System.out.println("The age of druver is: "+issuer.getAge()+" and the Driver license issue decision is: "+ issuer.getDecision());
    issuer.setAge(65);
    issuer.setDecision();
    System.out.println("The age of druver is: "+issuer.getAge()+" and the Driver license issue decision is: "+ issuer.getDecision());
}


    
}
