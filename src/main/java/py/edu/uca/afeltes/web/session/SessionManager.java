package py.edu.uca.afeltes.web.session;

import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class SessionManager {

    public static final String ATTRIBUTE_USER = "currentUser";

    private HttpServletRequest request;
    private HttpSession session;

    public SessionManager(HttpServletRequest request) {
        this.request = request;
    }

    public SessionManager(HttpSession session) {
        this.session = session;
    }

    public boolean isOpen() {
        if (session != null) {
            return true;
        }
        return this.request.getSession(false) != null;
    }

    public void invalidate() {
        // Invalidate the session and spring context.
        // Reference:
        // http://stackoverflow.com/questions/1013032/programmatic-use-of-spring-security
        HttpSession currentSession = getSession();
        if (currentSession != null) {
            currentSession.invalidate();
        }
        SecurityContextHolder.clearContext();
    }

    public boolean start() {
        HttpSession s = this.request.getSession();
        return s != null;
    }

    public UserCurrentInfo getUser() {
        HttpSession localSession = getSession();
        if (localSession == null) {
            return null;
        }
        return (UserCurrentInfo) localSession.getAttribute(ATTRIBUTE_USER);
    }


    public void setUser(UserCurrentInfo userCurrentInfo) {
        getSession().setAttribute(ATTRIBUTE_USER, userCurrentInfo);
    }

    private HttpSession getSession() {
        if (session != null) {
            return session;
        }
        return request.getSession(true);
    }


}
