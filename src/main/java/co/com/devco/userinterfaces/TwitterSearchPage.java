package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TwitterSearchPage {

    public static final Target INPUT_SEARCH = Target.the("The Input Search").located(By.id("query_view"));
}
