package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be null or empty.")
    @Pattern(regexp="(^$|[0-9]{10})", message="Mobile Number must be 10 digits.")
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be null or empty.")
    @Pattern(regexp="(^$|[0-9]{12})", message="AccountNumber must be 12 digits.")
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be null or empty.")
    private String loanType;

    @Positive(message = "Total Loan Amount should be greater than zero.")
    private int totalLoan;

    @PositiveOrZero(message = "Total Amount Paid should be equal to or greater than zero.")
    private int amountPaid;

    @PositiveOrZero(message = "Total Outstanding Amount should be equal to or greater than zero.")
    private int outstandingAmount;
}
