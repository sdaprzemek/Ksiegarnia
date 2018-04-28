package com.designpatterns.template;

import java.util.Arrays;

public class ForEmployeeEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("employee.kovalsky@onet.eu");

    }

    @Override
    public void setTopic() {
        topic = "For Employee only";

    }

    @Override
    public void setCcList() {
        cc = Arrays.asList("");
    }
}
