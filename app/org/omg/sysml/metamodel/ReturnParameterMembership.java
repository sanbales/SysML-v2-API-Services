package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ReturnParameterMembership extends ParameterMembership, MofObject {
    FeatureDirectionKind getDirection();
}