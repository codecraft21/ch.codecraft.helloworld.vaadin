package ch.codecraft.helloworld.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class MyVaadinApplication extends Application {

    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        Window main = new Window("Hello window");
        setMainWindow(main);
        main.addComponent(new Label("Hello World!"));
    }

}
