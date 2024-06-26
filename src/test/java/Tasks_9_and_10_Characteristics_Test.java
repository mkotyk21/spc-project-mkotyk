import org.testng.annotations.Test;
import pages.LoginPage;

public class Tasks_9_and_10_Characteristics_Test extends SeleniumBaseTest {
    @Test
    public void addCharacteristic() {
        String processName = "DEMO PROJECT";
        String characteristicName = faker.ancient().god()+faker.name().bloodGroup();
        String lsl = "2";
        String usl = "20";
        String charBinCount = "10";

        new LoginPage(driver)
                .submitCorrectLogin(config.getApplicationUser(), config.getApplicationPassword())
                .goToCharacteristics()
                .goToCreateNewCharacteristics()
                .selectProcess(processName)
                .addNewCharacteristics(characteristicName, lsl, usl, charBinCount)
                .assertCharacteristic(characteristicName, lsl, usl, charBinCount)
                .goToDashboard()
                .assertCharacteristicNameIsDisplayed(characteristicName);
    }
}
