/**
 * Code Craft Software, 2012
 */
package ch.codecraft.helloworld.vaadin.guice;

import ch.codecraft.helloworld.vaadin.MyVaadinApplication;
import ch.codecraft.helloworld.vaadin.res.Messages;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.inject.servlet.ServletScopes;
import com.vaadin.Application;

/**
 * Code Craft Software, 2012
 *
 * @author chris
 *
 */
public class MyServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        ServletModule module = new ServletModule() {
            @Override
            protected void configureServlets() {
                serve("/*").with(GuiceApplicationServlet.class);

                bind(Application.class).to(MyVaadinApplication.class).in(ServletScopes.SESSION);
                bindConstant().annotatedWith(Names.named("welcome")).to(Messages.getString("MyServletConfig.welcome"));
                bindConstant().annotatedWith(Names.named("what_time")).to(Messages.getString("MyServletConfig.what_time"));
            }
        };

        Injector injector = Guice.createInjector(module);

        return injector;
    }

}
