package org.s1ck.gdl.model.predicates.expressions;

import org.s1ck.gdl.model.functions.list.ListFunction;
import org.s1ck.gdl.model.predicates.Predicate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents a for each clause
 */
public class ForEach implements Predicate {

    /**
     * The left hand side of the for each statement
     */
    private String variable;

    /**
     * The right hand side of the for each statement
     */
    private ListFunction listFunction;

    /**
     * Creates a new For Each statement
     * @param lhs - the variable the list elements are bound to
     * @param rhs - the function creating a list where each element is bound to the lhs
     */
    public ForEach (String lhs, ListFunction rhs) {
        this.variable = lhs;
        this.listFunction = rhs;
    }

    @Override
    public Predicate[] getArguments() {
        return new Predicate[0];
    }

    @Override
    public Set<String> getVariables() {
        Set<String> variables = new HashSet<>();

        if(variable != null) variables.add(variable);
        if(listFunction != null) variables.addAll(listFunction.getVariables());

        return variables;
    }

    public String getLhs() { return variable; }
    public ListFunction getRhs() { return listFunction; }

    @Override
    public String toString() {
        return "ForEach{" +
                "variable='" + variable + '\'' +
                ", forEachElements=" + listFunction +
                '}';
    }
}
