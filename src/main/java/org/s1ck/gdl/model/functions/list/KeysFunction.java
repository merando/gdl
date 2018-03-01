package org.s1ck.gdl.model.functions.list;

import org.s1ck.gdl.model.Element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Resembles the cypher list function 'keys()' which returns all property keys of a given vertex, edge or graph.
 */
public class KeysFunction extends ListFunction {

    private String variable;

    /**
     * Constructor.
     * @param variable - the variable the keys function is executed on
     */
    public KeysFunction (String variable) {
        this.variable = variable;
    }


    @Override
    public List<String> getVariables() {
        return Collections.singletonList(variable);
    }

    public static List getListedElements(Element functionElement) {
        return new ArrayList<>(functionElement.getProperties().keySet());
    }

    @Override
    public String toString() {
        return "KeysFunction{" +
                "variable=" + variable +
                '}';
    }
}
