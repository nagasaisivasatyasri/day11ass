package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class MainClassXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
		DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
		
			DocumentBuilder b=f.newDocumentBuilder();
			Document d=b.parse(new File("realestate.xml"));
			Element e=d.getDocumentElement();
			System.out.println(e.getNodeName());
			NodeList list=e.getChildNodes();
			System.out.println(list.getLength());
			for(int i=0;i<list.getLength();i++)
			{
				Node node=list.item(i);
				System.out.println(node.getNodeName()+"-----------"+node.getTextContent());
			}
			
			
		} catch (ParserConfigurationException |SAXException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
