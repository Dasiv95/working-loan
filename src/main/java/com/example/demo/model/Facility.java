package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Facility {
    public String entityCIF;
    public int lineAmount;
    public String commitmentType;
    public int commitmentAmount;
    public int feeAmount;
    public String feeType;
    public String productCode;
    public String facilityType;
    public String currency;
    public Date maturityDate;
    public Date effectiveDate;
    public String FDICCode;
    public String proposedCRR;
    public int sublimitAmount;
}
