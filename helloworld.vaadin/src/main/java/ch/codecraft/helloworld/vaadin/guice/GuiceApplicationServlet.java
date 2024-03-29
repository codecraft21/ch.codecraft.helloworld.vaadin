/**
 * Code Craft Software, 2012
 */

package ch.codecraft.helloworld.vaadin.guice;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.AbstractApplicationServlet;

@Singleton
public class GuiceApplicationServlet extends AbstractApplicationServlet {

    private static final long serialVersionUID = 1L;

    protected final Provider<Application> applicationProvider;

    @Inject
    public GuiceApplicationServlet(Provider<Application> applicationProvider) {
        this.applicationProvider = applicationProvider;
    }

    @Override
    protected Class<? extends Application> getApplicationClass() throws ClassNotFoundException {
        return Application.class;
    }

    @Override
    protected Application getNewApplication(HttpServletRequest request) throws ServletException {
        return applicationProvider.get();
    }

}
