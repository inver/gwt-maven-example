package net.nevinsky.server;

import net.nevinsky.shared.FieldVerifier;
import net.nevinsky.web.GreetingService;
import org.springframework.stereotype.Service;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
@Service(GreetingService.NAME)
public class GreetingServiceImpl implements GreetingService {

    public String greetServer(String input) throws IllegalArgumentException {
        // Verify that the input is valid.
        if (!FieldVerifier.isValidName(input)) {
            // If the input is not valid, throw an IllegalArgumentException back to
            // the client.
            throw new IllegalArgumentException(
                    "Name must be at least 4 characters long");
        }

//        String serverInfo = getServletContext().getServerInfo();
//        String userAgent = getThreadLocalRequest().getHeader("User-Agent");

        // Escape data from the client to avoid cross-site script vulnerabilities.
        input = escapeHtml(input);
//        userAgent = escapeHtml(userAgent);

        return "Hello, " + input + "!<br><br>I am running "
                + ".<br><br>It looks like you are using:<br>";
    }

    /**
     * Escape an html string. Escaping data received from the client helps to
     * prevent cross-site script vulnerabilities.
     *
     * @param html the html string to escape
     * @return the escaped string
     */
    private String escapeHtml(String html) {
        if (html == null) {
            return null;
        }
        return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
                ">", "&gt;");
    }
}
