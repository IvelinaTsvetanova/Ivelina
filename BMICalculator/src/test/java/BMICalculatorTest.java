import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMICalculatorTest {


    @BeforeMethod
    public void setup() {
        Browser.setupDriver();
    }

    @AfterMethod
    public void tearDown() {
        Browser.quitDriver();
    }

    @Test
    public void bmiCalculatorTest() {
        BMICalculatorPage.goTo();
        BMICalculatorPage.writeInTheHeightInputField("170");
        BMICalculatorPage.writeInTheWeightInputField("70");
        BMICalculatorPage.clickTheCalculateButton();
        BMICalculatorPage.verifyBmiValue("24.2");
//        Assert.assertEquals(BMICalculatorPage.getBmiValue(), "24.2");
    }


//    @Test
//    public void bmiCalculatorValueTest() {
//        WebElement heightCMS = driver.findElement(By.id("heightCMS"));
//        heightCMS.clear();
//        heightCMS.sendKeys("170");
//        WebElement weightKg = driver.findElement(By.id("weightKg"));
//        weightKg.clear();
//        weightKg.sendKeys("70");
//        WebElement calculateButton = driver.findElement(By.id("Calculate"));
//        calculateButton.click();
//        WebElement bmi_category = driver.findElement(By.id("bmi_category"));
//        String bmi_categoryValue = bmi_category.getAttribute("value");
//        Assert.assertEquals(bmi_categoryValue, "Normal");
//    }

}
