package org.kie.runtime.rule;

import java.util.List;

import org.kie.definition.rule.Rule;

public interface Match {

    /**
     * 
     * @return
     *     The Rule that was activated.
     */
    public Rule getRule();

    /**
     * 
     * @return 
     *     The PropagationContext that created this Activation
     */
    public PropagationContext getPropagationContext();

    /**
     * 
     * @return
     *     The matched FactHandles for this activation
     */
    public List< ? extends FactHandle> getFactHandles();

    /**
     * Returns the list of objects that make the tuple that created
     * this activation. The objects are in the proper tuple order.
     * 
     * @return
     */
    public List<Object> getObjects();

    /**
     * Returns the list of declaration identifiers that are bound to the
     * tuple that created this activation.
     * 
     * @return
     */
    public List<String> getDeclarationIDs();

    /**
     * Returns the bound declaration value for the given declaration identifier.
     * 
     * @param declarationId
     * @return
     */
    public Object getDeclarationValue(String declarationId);

    /**
     * An Activation is considered active if it is on the agenda and has not yet fired.
     * Once an Activation has fired it is remove from the Agenda an considered dormant.
     * However remember that the Activation may still be considered "true", i.e. a full match. 
     * @return
     */
    public boolean isActive();

}