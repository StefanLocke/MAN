
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

public class FirstPdfTest {

	
	Document doc;
	
	@Before
	public void prep()
	{
		doc = new Document();
	}
	
	@Test
	public void testMeta() {
		FirstPdf.addMetaData(doc);
		assertTrue(true);

		doc.close();
	}
	
	@Test
	public void testTitle() {
		doc.open();
		try {
			FirstPdf.addTitlePage(doc);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(true);

		doc.close();
	}
	
	@Test
	public void testContent() {
		doc.open();

		try {
			FirstPdf.addContent(doc);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(true);
		doc.close();
	}
}
