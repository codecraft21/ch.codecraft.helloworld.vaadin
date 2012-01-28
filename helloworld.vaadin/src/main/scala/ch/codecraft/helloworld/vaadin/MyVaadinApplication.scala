package ch.codecraft.helloworld.vaadin

import vaadin.scala._

class MyVaadinApplication extends com.vaadin.Application {

  def init(): Unit = {
    setMainWindow(new Window("My Vaadin Application"))
    val button = new Button(caption = "Click Me", action = buttonAction)

    //button.addListener(_ => getMainWindow.addComponent(new Label("Thank you for clicking")))

    getMainWindow.addComponent(button)
  }

  def buttonAction(event: com.vaadin.ui.Button#ClickEvent) = getMainWindow.addComponent(new Label("Thank you for clicking"))

}
