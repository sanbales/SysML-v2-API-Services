package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface AtomicInteraction extends MofObject {
    Collection<? extends Classifier> getItemType();
}