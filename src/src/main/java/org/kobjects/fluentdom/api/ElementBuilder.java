package org.kobjects.fluentdom.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class ElementBuilder<N, E extends N, T extends N, B extends ElementBuilder<N, E, T, ?>> {
	private NodeFactory<N, E, T> nodeFactory;
	private final String name;
	private final LinkedHashMap<String, Object> attributes = new LinkedHashMap<>();
	
	ElementBuilder(NodeFactory<N, E, T> factory, String name) {
		this.nodeFactory = factory;
		this.name = name;
	}
	
	public E withText(String content) {
		return nodeFactory.createElement(name,  attributes, Collections.singletonList(nodeFactory.createTextNode(content)));
	}
	
	@SuppressWarnings("unchecked")
	public B id(String id) {
		attributes.put("id", id);
		return (B) this;
	}
	
	@SuppressWarnings("unchecked")
	public E withChildren(N... children) {
		return withChildren(Arrays.asList(children));
	}
	
	public E withChildren(List<N> children) {
		return nodeFactory.createElement(name,  attributes, children);
	}
	
	public E empty() {
		return nodeFactory.createElement(name, attributes, Collections.emptyList());
	}
}
