package com.example.bank.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Datum{
    @JsonProperty("Brand")
    public ArrayList<Brand> brand;
}
