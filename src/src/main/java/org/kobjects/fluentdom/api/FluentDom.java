package org.kobjects.fluentdom.api;

public class FluentDom<N, E extends N, T extends N> {
	private final NodeFactory<N, E, T> nodeFactory;
	
	public FluentDom(NodeFactory<N, E, T> nodeFactory) {
		this.nodeFactory = nodeFactory;
	}
	
	public BodyElementBuilder<N, E, T> body()  {
		return new BodyElementBuilder<>(nodeFactory);
	}
	
	public DivElementBuilder<N, E, T> div()  {
		return new DivElementBuilder<>(nodeFactory);
	}

	public HeadElementBuilder<N, E, T> head()  {
		return new HeadElementBuilder<>(nodeFactory);
	}

	public TitleElementBuilder<N, E, T> title()  {
		return new TitleElementBuilder<>(nodeFactory);
	}

	public T text(String text) {
		return nodeFactory.createTextNode(text);
	}
	
}
