package net.lkrnac.book.eiws.chapter03.ws.xmlconfig.server;

import org.springframework.stereotype.Component;

@Component
public class SimpleLogger {
  public void log(String message) {
    System.out.println(message);
  }
}
