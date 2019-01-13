package org.kobjects.fluentdom.api;

import java.util.List;
import java.util.Map;

public interface NodeFactory<N, E extends N, T extends N> {
	
	E createElement(String name, Map<String, Object> attributes, List<N> children);

	T createTextNode(String text);
}
