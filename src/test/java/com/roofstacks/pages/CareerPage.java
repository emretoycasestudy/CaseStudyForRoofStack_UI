package com.roofstacks.pages;

import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage{

@FindBy(xpath = "//*[@id=\"slide-portfolio\"]/div/ul/li[2]")
    public WebElement productBtn;

@FindBy(xpath = "//h4[text()=\"Lead Product Tester\"]")
    public WebElement leadProductTesterBtn;

    public void openProductPage(){
        scrollToElement(productBtn);
        waitForVisibility(productBtn,3);
        productBtn.click();

    }
    public void selectLeadProductTester(String jobTitle){
        Driver.get().findElement(By.xpath("//h4[text()='"+jobTitle+"']"));
        scrollToElement(leadProductTesterBtn);
        leadProductTesterBtn.click();
    }
    public void selectJobTitle(String jobTitle){
        String locator="//h4[text()='"+jobTitle+"']";
        WebElement jobType=Driver.get().findElement(By.xpath(locator));
        jobType.click();

    }
}
