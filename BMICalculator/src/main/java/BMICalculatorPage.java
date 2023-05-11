

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BMICalculatorPage {

    private static final By CALCULATE_BUTTON = By.id("Calculate");
    private static final By HEIGHT_INPUT_FIELD = By.id("heightCMS");
    private static final By WEIGHT_INPUT_FIELD = By.id("weightKg");
    private static final By BMI_FIELD = By.id("bmi");
    private static final By  BMI_CATEGORY_FIELD= By.id("bmi_category");



    public static void goTo() {
        Browser.getDriver().get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
    }

    public static void calculateBmi(String height, String weight) {
        writeInTheHeightInputField(height);
        writeInTheWeightInputField(weight);
        clickTheCalculateButton();
    }

    public static void clickTheCalculateButton() {
        Browser.getDriver().findElement(CALCULATE_BUTTON).click();
    }

    public static void writeInTheHeightInputField(String height) {
        Browser.getDriver().findElement(HEIGHT_INPUT_FIELD).sendKeys(height);
    }

    public static void writeInTheWeightInputField(String weight) {
        Browser.getDriver().findElement(WEIGHT_INPUT_FIELD).sendKeys(weight);
    }

    public static String getBmiValue() {
        String bmiValue = Browser.getDriver().findElement(BMI_FIELD).getAttribute("value");
        return bmiValue;
    }

    public static void verifyBmiValue(String expectedBmiValue) {
        Assert.assertEquals(getBmiValue(), expectedBmiValue);
    }

}
