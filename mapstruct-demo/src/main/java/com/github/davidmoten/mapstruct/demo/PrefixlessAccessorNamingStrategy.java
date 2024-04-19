package com.github.davidmoten.mapstruct.demo;

import java.util.Locale;

import javax.lang.model.element.ExecutableElement;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

public class PrefixlessAccessorNamingStrategy extends DefaultAccessorNamingStrategy {

    @Override
    public boolean isGetterMethod(ExecutableElement method) {
        return isCustomPackage(method) && method.getParameters().isEmpty();
    }

    private boolean isCustomPackage(ExecutableElement method) {
        return elementUtils.getPackageOf(method).getQualifiedName().toString().startsWith("com.github.davidmoten");
    }

    @Override
    public boolean isSetterMethod(ExecutableElement method) {
        return isCustomPackage(method) && method.getParameters().size() == 2;
    }

    @Override
    public String getPropertyName(ExecutableElement getterOrSetterMethod) {
        return super.getPropertyName(getterOrSetterMethod).toLowerCase(Locale.ROOT);
    }

    @Override
    public String getElementName(ExecutableElement adderMethod) {
        return super.getElementName(adderMethod).toLowerCase(Locale.ROOT);
    }
}