package co.edu.pascualbravo.sicau.runners;


import co.edu.pascualbravo.sicau.utils.BeforeSuite;
import co.edu.pascualbravo.sicau.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@SmokeTest",
        glue = "co.edu.pascualbravo.sicau.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(DataExcelRunner.class)
public class VerNotaRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/verNota.feature");
    }
}
