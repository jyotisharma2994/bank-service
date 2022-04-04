package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Brand{
    @JsonProperty("BrandName")
    public String brandName;
    @JsonProperty("ATM") 
    public ArrayList<ATM> ATM;
}
