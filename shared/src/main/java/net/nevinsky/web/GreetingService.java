package net.nevinsky.web;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("gwtServices/greetingService")
public interface GreetingService extends RemoteService {
    String NAME = "greetingService";

    String greetServer(String name) throws IllegalArgumentException;
}
