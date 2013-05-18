package org.arquillian.eclipse;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ManagerTest
{
   @Inject SuperTestHandler manager;
   
   @Deployment
   public static Archive<?> createDeployment()
   {
      WebArchive archive = ShrinkWrap.create(WebArchive.class).addClasses(SuperTestHandler.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
      return archive;
   }

   @Test
   public void testInvoke()
   {
      fail("Not yet implemented");
   }

}
