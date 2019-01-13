package org.kobjects.fluentdom.api;


public class BodyElementBuilder<N, E extends N, T extends N> extends ElementBuilder<N, E, T, BodyElementBuilder<N, E, T>> {
	
	BodyElementBuilder(NodeFactory<N, E, T> nodeFactory) {
		super(nodeFactory, "body");
	}

}
