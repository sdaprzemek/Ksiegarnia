package com.designpatterns.template;
//TODO <-- przejrzec dokladnie kod od prowdzacego cos nie dziala...
import java.util.Arrays;

public class ForMenagersEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("managers@interia.pl", "adam.ceo@onet.eu");
    }

    @Override
    public void setTopic() {
        topic = "Email for managers";

    }
}
