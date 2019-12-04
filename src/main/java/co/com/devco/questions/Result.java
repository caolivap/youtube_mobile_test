package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.userinterfaces.TwitterSearchPage.RESULT_USER_ACCOUNT;

public class Result implements Question<String> {

    private String userAccount;

    public Result(String userAccount){
        this.userAccount = userAccount;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RESULT_USER_ACCOUNT.of(userAccount)).viewedBy(actor).asString();
    }

    public static Question ofUserAccount(String userAccount) {
        return new Result(userAccount);
    }

}
