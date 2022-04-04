package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ATM{
    @JsonProperty("Identification")
    public String identification;
    @JsonProperty("SupportedCurrencies") 
    public ArrayList<String> supportedCurrencies;
    @JsonProperty("Location") 
    public Location location;
}
