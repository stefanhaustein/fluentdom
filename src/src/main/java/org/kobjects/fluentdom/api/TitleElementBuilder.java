package org.kobjects.fluentdom.api;

public class TitleElementBuilder<N, E extends N, T extends N> extends ElementBuilder<N, E, T, TitleElementBuilder<N, E, T>> {
	
	TitleElementBuilder(NodeFactory<N, E, T> nodeFactory) {
		super(nodeFactory, "title");
	}

}
