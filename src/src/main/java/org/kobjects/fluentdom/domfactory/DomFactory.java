package org.kobjects.fluentdom.domfactory;

import java.util.List;
import java.util.Map;

import org.kobjects.fluentdom.api.NodeFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;;

public class DomFactory implements NodeFactory<Node, Element, Text>{

	private final Document document;
	
	public DomFactory(Document document) {
		this.document = document;
	}
	
	@Override
	public Element createElement(String name, Map<String, Object> attributes, List<Node> children) {
		Element element = document.createElement(name);
		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			element.setAttribute(entry.getKey(), String.valueOf(entry.getValue()));
		}
		for (Node child : children) {
			element.appendChild(child);
		}
		return element;
	}

	@Override
	public Text createTextNode(String text) {
		return document.createTextNode(text);
	}

	
	
}
