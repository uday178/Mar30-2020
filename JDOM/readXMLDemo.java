package XMLParser.JDOM;

import java.io.File;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class readXMLDemo 
{
	public static void main(String[] args) 
	{
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("src//main//java//XMLParser//JDOM//employee.xml");

		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List employeeList = rootNode.getChildren("employee");

			System.out.println("*****Employee Details******");
			for (int i = 0; i < employeeList.size(); i++) {

				Element node = (Element) employeeList.get(i);
				
				System.out.println("First Name : " + node.getChildText("firstname"));
				System.out.println("Last Name : " + node.getChildText("lastname"));
				System.out.println("Salary : " + node.getChildText("salary"));

			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 
	}
}
