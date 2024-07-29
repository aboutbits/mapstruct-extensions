package it.aboutbits.mapstruct.spi;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

import javax.lang.model.element.ExecutableElement;

public class CustomAccessorNamingStrategy extends DefaultAccessorNamingStrategy {

    @Override
    protected boolean isFluentSetter(ExecutableElement method) {
        return !isWitherMethod(method) && super.isFluentSetter(method);
    }

    protected boolean isWitherMethod(ExecutableElement method) {
        String methodName = method.getSimpleName().toString();
        return methodName.length() > 4 && methodName.startsWith("with") && Character.isUpperCase(methodName.charAt(4));
    }
}
