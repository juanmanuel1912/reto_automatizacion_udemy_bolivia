package retoautomateTren.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import retoautomateTren.model.DataRegister;
import retoautomateTren.userinterfaces.LocatorQuestion;

import java.util.List;

public class TheTitle implements Question<Boolean> {
    private List<DataRegister>title;
    public TheTitle(List<DataRegister>title){
        this.title = title;
    }


    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String titlePage = Text.of(LocatorQuestion.LABEL_VALIDATE).viewedBy(actor).asString();
        if (title.equals(titlePage)) {
            result = true;
        }else{
            result = false;
        }
        return result;

    }
    public static TheTitle is(List<DataRegister> textCompleteRegister){
        return new TheTitle(textCompleteRegister);

    }
}
