package ch.codecraft.helloworld.vaadin;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class MyVaadinApplication extends Application {

    private static final long serialVersionUID = 1L;

    @Inject @Named("welcome") protected String text;

    @Override
    public void init() {
        final Window main = new Window("Hello window");
        setMainWindow(main);
        main.addComponent(new Label(text));

        main.addComponent(new Button("what time is it?", new Button.ClickListener() {
            private static final long serialVersionUID = 1L;

            @Override
            public void buttonClick(ClickEvent event) {
                main.showNotification("Time now " + new Date());
            }
        }));
    }

}
