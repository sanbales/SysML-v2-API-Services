package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface TransitionFeatureMembership extends FeatureMembership, MofObject {
    TransitionFeatureKind getKind();

    Step getTransitionFeature();
}