package com.esite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {

private WebDriver driver;

    private By accountSections = By.cssSelector("div#center_column span");

    public AccountsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAccountsPageTitle(){
        return driver.getTitle();
    }


    public int getAccountsSectionCount() {
        return driver.findElements(accountSections).size();
    }


  public List<String> getAccountsSectionsList(){

        List<String> accountsList = new ArrayList<>();
        List<WebElement> accountsHeaderList = driver.findElements(accountSections);
      for ( WebElement el: accountsHeaderList) {
          String text  = el.getText();
          accountsList.add(text);
      }
      return accountsList;

  }

}
