package com.roofstacks.pages;

import com.roofstacks.utilities.ConfigurationReader;
import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage{
    String url= ConfigurationReader.get("url");

    public void googleSearch(String searchItem){
        Driver.get().get(url);
        Driver.get().findElement(By.name("q")).sendKeys(searchItem, Keys.ENTER);
    }
    public void clickDesiredPage(){
        Driver.get().findElement(By.partialLinkText("Roof Stacks:")).click();
    }
}
