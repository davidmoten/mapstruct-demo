package com.github.davidmoten.mapstruct.spi;

import javax.lang.model.element.ExecutableElement;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;
import org.mapstruct.ap.spi.util.IntrospectorUtils;

public class PrefixlessAccessorNamingStrategy extends DefaultAccessorNamingStrategy {

    @Override
    public boolean isGetterMethod(ExecutableElement method) {
        if (isCustomPackage(method)) {
            return method.getParameters().isEmpty();
        } else {
            return super.isGetterMethod(method);
        }
    }

    @Override
    public boolean isSetterMethod(ExecutableElement method) {
        if (isCustomPackage(method)) {
            return method.getParameters().size() == 1 && method.getSimpleName().toString().startsWith("with");
        } else {
            return super.isSetterMethod(method);
        }
    }

    @Override
    public String getPropertyName(ExecutableElement getterOrSetterMethod) {
        if (isCustomPackage(getterOrSetterMethod)) {
            String name = getterOrSetterMethod.getSimpleName().toString();
            if (name.startsWith("with")) {
                return IntrospectorUtils.decapitalize(name.substring(4));
            } else {
                return name;
            }
        } else {
            return super.getPropertyName(getterOrSetterMethod);
        }
    }

    @Override
    public String getElementName(ExecutableElement adderMethod) {
        return super.getElementName(adderMethod);
    }

    private boolean isCustomPackage(ExecutableElement method) {
        return elementUtils.getPackageOf(method).getQualifiedName().toString()
                .startsWith("com.github.davidmoten.mapstruct.demo");
    }
}