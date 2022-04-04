package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{
    @JsonProperty("PostalAddress")
    public PostalAddress postalAddress;
}
