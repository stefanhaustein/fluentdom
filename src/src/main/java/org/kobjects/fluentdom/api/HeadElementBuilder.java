package org.kobjects.fluentdom.api;

public class HeadElementBuilder<N, E extends N, T extends N> extends ElementBuilder<N, E, T, HeadElementBuilder<N, E, T>> {
	
	HeadElementBuilder(NodeFactory<N, E, T> nodeFactory) {
		super(nodeFactory, "head");
	}

}
