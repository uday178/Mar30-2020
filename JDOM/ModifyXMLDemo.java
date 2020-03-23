package XMLParser.JDOM;

import java.io.File;
import java.io.FileWriter;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class ModifyXMLDemo 
{
	public static void main(String[] args) 
	{
		try {

			SAXBuilder builder = new SAXBuilder();
			File xmlFile = new File("src//main//java//XMLParser//JDOM//student.xml");

			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();

			Element student = rootNode.getChild("student");

			// add new age element
			Element age = new Element("age").setText("15");
			student.addContent(age);

			XMLOutputter xmlOutput = new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("src//main//java//XMLParser//JDOM//student.xml"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
