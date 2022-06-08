package com.greatlearning.corejava;
class Country{
    private String country, nationalAnthem, touristSpot;
    public void setCountry(String country) {
        this.country = country;
    }
    public void setNationalAnthem(String nationalAnthem) {
        this.nationalAnthem = nationalAnthem;
    }
    public void setTouristSpot(String touristSpot) {
        this.touristSpot = touristSpot;
    }
    public String getCountry() {
        return country;
    }
    public String getNationalAnthem() {
        return nationalAnthem;
    }
    public String getTouristSpot() {
        return touristSpot;
    }
}



public class EncapsulationImplementation {
    public static void main(String[] args) {
        Country newCountry = new Country();
        newCountry.setCountry("India");
        newCountry.setNationalAnthem("Jan Gan Man");
        newCountry.setTouristSpot("Goa");

        System.out.println(newCountry.getCountry());
        System.out.println(newCountry.getNationalAnthem());
        System.out.println(newCountry.getTouristSpot());
    }
}
