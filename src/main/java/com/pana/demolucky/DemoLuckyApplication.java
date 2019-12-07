package com.pana.demolucky;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLuckyApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(DemoLuckyApplication.class, TypeDialog.class, args);
    }

}
