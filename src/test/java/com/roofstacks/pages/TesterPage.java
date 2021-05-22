package com.roofstacks.pages;

import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;


import java.util.Set;

public class TesterPage extends BasePage{

public void uploadCV() throws InterruptedException {
    String currentWindowHandle = Driver.get().getWindowHandle();
    String projectPath=System.getProperty("user.dir");
    String filePath="src/test/resources/Resume.pdf";
    String fullPath=projectPath+"/"+filePath;
    Driver.get().findElement(By.xpath("/html/body/main/div[3]/div/div[2]/div/div[1]/div/a/h3/small")).click();

    //sending file with sendKeys method

    Set<String> windowHandles = Driver.get().getWindowHandles();
    for (String handle : windowHandles) {
        if(!handle.equals(currentWindowHandle)){
            Driver.get().switchTo().window(handle);
        }
    }

    Driver.get().findElement(By.cssSelector("#file")).sendKeys(fullPath);
    Driver.get().findElement(By.id("email")).sendKeys("emretoy01@gmail.com");
    Thread.sleep(2000);
    Driver.get().findElement(By.xpath("//*[@id=\"btn_upload\"]")).click();
}


}
