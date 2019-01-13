package org.kobjects.fluentdom.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.kobjects.fluentdom.api.FluentDom;
import org.kobjects.fluentdom.domfactory.DomFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class FluentDomDemo {

	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document document = builder.newDocument();

		FluentDom<Node, Element, Text> html = new FluentDom<>(new DomFactory(document));
		
		Element body = html.body().withChildren(
			html.head().withChildren(
				html.title().withText("Test Page")	
			),
			html.body().withChildren(
					html.div().id("544").withChildren(
							html.div().empty(),
							html.div().empty()
					)
			)
		);
		System.out.println("Generated: " + body);
	}
	
}
