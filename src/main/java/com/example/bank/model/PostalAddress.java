package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PostalAddress{
    @JsonProperty("AddressLine")
    public ArrayList<String> addressLine;
    @JsonProperty("StreetName") 
    public String streetName;
    @JsonProperty("TownName") 
    public String townName;
    @JsonProperty("CountrySubDivision") 
    public ArrayList<String> countrySubDivision;
    @JsonProperty("Country") 
    public String country;
    @JsonProperty("PostCode") 
    public String postCode;
}
