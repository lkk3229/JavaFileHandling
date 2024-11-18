package xmlFiles;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//Java DOM Parser (Build-in java library)

//DocumentBuilderFactory
//DocumentBuilder
//Document

public class ReadXMLFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();

		Document document = builder.parse(".\\data\\employees.xml");
		
		//extract root node from xml doc
		Element root=document.getDocumentElement();
		
		NodeList nodeList=root.getChildNodes();
		
		for(int i=0; i<nodeList.getLength();i++)
		{
			Node node=nodeList.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				Element element=(Element) node;
				String tagName=element.getTagName();
				String textContent=element.getTextContent();
				System.out.println("Tag Name:"+tagName);
				System.out.println("Text Content:"+textContent);
			}
		}
		
		
	}

}
