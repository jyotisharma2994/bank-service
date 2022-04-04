package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Meta{
    @JsonProperty("LastUpdated")
    public Date lastUpdated;
    @JsonProperty("TotalResults") 
    public int totalResults;
    @JsonProperty("Agreement") 
    public String agreement;
    @JsonProperty("License") 
    public String license;
    @JsonProperty("TermsOfUse") 
    public String termsOfUse;
}
