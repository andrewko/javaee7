package com.garwan.sampleapp.cdi;

import static junit.framework.Assert.assertNotNull;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.garwan.sampleapp.PackageInfo;

import junit.framework.Assert;

@RunWith(Arquillian.class)
public class BookServiceTest {

	@Inject
	private BookService bookService;

	@Deployment
	public static JavaArchive createArchive() {
		JavaArchive jar = ShrinkWrap.create(JavaArchive.class, "book_service_test.jar")
				//				.addPackage(BookService.class.getPackage().getName())
				.addPackages(true, PackageInfo.class.getPackage().getName())
				.addAsManifestResource("META-INF/test-beans.xml", "beans.xml");
		System.out.println(jar.toString(true));
		return jar;
	}

	@Test
	public void testCrateBook() {
		Book book = bookService.createBook("Beginning JEE7", "description");
		assertNotNull(book);
		Assert.assertEquals("mocked number", book.getNumber());
	}
}
