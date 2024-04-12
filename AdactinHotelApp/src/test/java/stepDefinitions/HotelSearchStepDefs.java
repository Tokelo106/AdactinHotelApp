package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HotelSearchStepDefs {
    private static WebDriver driver;

    @Given("User is on Adactin home page")
    public void userIsOnAdactinHomePage() {
        driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com");
    }

    @When("user enters {string} and {string} to login")
    public void userEntersUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("username")).sendKeys("tokelosamson106");
        driver.findElement(By.id("password")).sendKeys("teek@ySamson106");
    }



    @And("User clicks Login Button")
    public void userClicksLoginButton() {
        driver.findElement(By.id("login")).click();
    }

    @Then("User is redirected to the hotel Search Page")
    public void userIsRedirectedToTheHotelSearchPage() {
        Assert.assertEquals("https://adactinhotelapp.com/SearchHotel.php", driver.getCurrentUrl());
    }

    @Given("User is on the Adactin Hotel Search page")
    public void userIsOnTheAdactinHotelSearchPage() {

        Assert.assertEquals("https://adactinhotelapp.com/SearchHotel.php", driver.getCurrentUrl());
    }

    @When("User selects Location and Hotels")
    public void userSelectsLocationAndHotels() {
        Select locationDropdown = new Select(driver.findElement(By.id("location")));
        locationDropdown.selectByVisibleText("Sydney");
        Select hotelsDropdown = new Select(driver.findElement(By.id("hotels")));
        hotelsDropdown.selectByVisibleText("Hotel Creek");
    }

    @And("User selects Room Type and Number Of Rooms")
    public void userSelectsRoomTypeAndNumberOfRooms() {
        Select roomTypeDropdown = new Select(driver.findElement(By.id("room_type")));
        roomTypeDropdown.selectByVisibleText("Standard");
        Select roomsDropdown = new Select(driver.findElement(By.id("room_nos")));
        roomsDropdown.selectByVisibleText("1 - One");
    }

    @And("User enters {string} and {string}")
    public void userEntersCheckInAndCheckOut(String checkInDate, String checkOutDate) {
        driver.findElement(By.id("datepick_in")).sendKeys(checkInDate);
        driver.findElement(By.id("datepick_out")).sendKeys(checkOutDate);
    }

    @And("User selects Adults per room and Children per room")
    public void userSelectsAdultsPerRoomAndChildrenPerRoom() {
        Select adultsDropdown = new Select(driver.findElement(By.id("adult_room")));
        adultsDropdown.selectByVisibleText("2 - Two");
        Select childrenDropdown = new Select(driver.findElement(By.id("child_room")));
        childrenDropdown.selectByVisibleText("1 - One");
    }

    @Then("User clicks Submit button")
    public void userClicksSubmitButton() {

        driver.findElement(By.id("Submit")).click();
    }
    @Given("user is on select hotel page")
    public void userIsOnSelectHotelPage() {
        Assert.assertEquals("https://adactinhotelapp.com/SelectHotel.php", driver.getCurrentUrl());
    }

    @When("user selects available hotel")
    public void userSelectsAvailableHotel(){
        driver.findElement(By.id("radiobutton_0")).click();


    }
    @Then("user clicks continue button")
    public void userClicksContinueButton() {
        driver.findElement(By.id("continue")).click();
    }

    @Given("user is on book hotel page")
    public void userIsOnBookHotelPage() {
        Assert.assertEquals("https://adactinhotelapp.com/BookHotel.php", driver.getCurrentUrl());
    }


    @When("user enters {string} and {string}")
    public void userEntersFirstNameAndLastName(String firstname, String lastname) {
        driver.findElement(By.id("first_name")).sendKeys(firstname);
        driver.findElement(By.id("last_name")).sendKeys(lastname);
    }

    @And("users enters {string}")
    public void usersEntersBillingAddress(String billingAddress) {
        driver.findElement(By.id("address")).sendKeys(billingAddress);
    }

    @And("user enters {string}")
    public void userEntersCreditCardNumber(String creditCardNumber) {
        driver.findElement(By.id("cc_num")).sendKeys(creditCardNumber);
    }

    @And("user selects Credit card type")
    public void userSelectsCreditCardType() {
        new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("Master Card");
    }

    @And("user select Month and Select Year")
    public void userSelectMonthAndSelectYear() {
        new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("January");
        new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2026");
    }

    @And("user enters {string} number")
    public void userEntersCVV(String cvvNumber) {
        driver.findElement(By.id("cc_cvv")).sendKeys(cvvNumber);
    }

    @Then("User clicks Book Now")
    public void userClicksBookNow() {
        driver.findElement(By.id("book_now")).click();
    }



    @Given("User is on Booking confirmation page")
    public void userIsOnBookingConfirmationPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until( ExpectedConditions.presenceOfElementLocated(By.id("logout")));
        Assert.assertEquals("https://adactinhotelapp.com/BookingConfirm.php", driver.getCurrentUrl());
    }


    @And("user clicks Logout")
    public void userClicksLogout() {

        driver.findElement(By.id("logout")).click();
    }

    @Then("user successfully logs out")
    public void userSuccessfullyLogsOut() {
        Assert.assertEquals("https://adactinhotelapp.com/Logout.php", driver.getCurrentUrl());

    }
    @After
    public void teardown(){
        if(driver!= null){
         driver.close();
        }

    }



}









