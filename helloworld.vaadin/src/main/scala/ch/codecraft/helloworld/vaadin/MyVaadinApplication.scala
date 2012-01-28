package ch.codecraft.helloworld.vaadin

import com.vaadin.Application
import com.vaadin.ui._

class MyVaadinApplication extends Application {

  def init(): Unit = {
     setMainWindow(new Window("My Vaadin Application"))
     val button = new Button("Click Me")
     
     //TODO find out how scala.swing handles SAM classes
     button.addListener(new Button.ClickListener() {
       def buttonClick(event: Button#ClickEvent): Unit = {
         getMainWindow.addComponent(new Label("Thank you for clicking"))
       }
     })
     //FIXME button.addListener(_ => getMainWindow.addComponent(new Label("Thank you for clicking")))

     getMainWindow.addComponent(button)
  }

}
