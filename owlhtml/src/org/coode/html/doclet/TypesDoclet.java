/*
* Copyright (C) 2007, University of Manchester
*/
package org.coode.html.doclet;

import org.coode.html.OWLHTMLServer;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLIndividual;
import org.semanticweb.owl.model.OWLOntology;

import java.util.Collection;
import java.util.Set;

/**
 * Author: Nick Drummond<br>
 * http://www.cs.man.ac.uk/~drummond/<br><br>
 * <p/>
 * The University Of Manchester<br>
 * Bio Health Informatics Group<br>
 * Date: Feb 5, 2008<br><br>
 */
public class TypesDoclet extends AbstractOWLElementsDoclet<OWLIndividual, OWLDescription> {

    public TypesDoclet(OWLHTMLServer server) {
        super("Types", Format.list, server);
    }

    protected Collection<OWLDescription> getElements(Set<OWLOntology> onts) {
        return getUserObject().getTypes(onts);
    }
}