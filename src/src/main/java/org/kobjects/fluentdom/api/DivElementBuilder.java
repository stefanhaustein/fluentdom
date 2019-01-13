package org.kobjects.fluentdom.api;

public class DivElementBuilder<N, E extends N, T extends N> extends ElementBuilder<N, E, T, DivElementBuilder<N, E, T>> {
	
	DivElementBuilder(NodeFactory<N, E, T> nodeFactory) {
		super(nodeFactory, "div");
	}

}
