package org.arquillian.eclipse;

import javax.inject.Inject;

public class TestHandler //extends SuperTestHandler
{
   @Inject Handler handler;
 
   public String invoke() {
      return handler.invoke();
   }
}
