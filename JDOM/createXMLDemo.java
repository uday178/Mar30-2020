package XMLParser.JDOM;

import java.io.FileWriter;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class createXMLDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			Element bookShop = new Element("bookShop");
			Document document = new Document(bookShop);
			document.setRootElement(bookShop);

			Element books = new Element("books");
			books.setAttribute(new Attribute("bookId", "201"));
			books.addContent(new Element("bookName").setText("Rich Dad Poor Dad"));
			books.addContent(new Element("author").setText("Robert Kiyoski"));

			document.getRootElement().addContent(books);

			XMLOutputter xmlOutput = new XMLOutputter();

			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(document, new FileWriter("src//main//java//XMLParser//JDOM//books.xml"));
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
