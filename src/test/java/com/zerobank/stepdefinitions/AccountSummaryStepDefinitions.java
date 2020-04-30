package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummary;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    AccountSummary accountSummary=new AccountSummary();

    @Then("user should navigate to {string} page")
    public void user_should_navigate_to_page(String string) {
        System.out.printf("Navigate to %s ",string);
        accountSummary.navigateTo(string);
    }


    @Then("user should verify that these account types:")
    public void user_should_verify_that_these_account_types(List<String> dataTable) {
        System.out.printf("Verify account types: %s",dataTable);
        Assert.assertEquals(dataTable,accountSummary.getAccountTypes());
    }

    @Then("user should verify following table columns from {string}:")
    public void user_should_verify_following_table_columns_from(String string, List<String> dataTable) {
        System.out.printf("Verify %s table columns: %s",string,dataTable);
        Assert.assertEquals(dataTable,accountSummary.getColumnNames("Credit Accounts"));
    }


}
