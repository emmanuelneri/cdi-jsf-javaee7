package br.com.emmanuelneri.utils;

import br.com.emmanuelneri.utils.annotations.HttpParam;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.servlet.ServletRequest;

public class HttpParamProducer {

    @Produces
    public String getParamValue(InjectionPoint ip) {
        final ServletRequest request = (ServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return request.getParameter(ip.getAnnotated().getAnnotation(HttpParam.class).param());
    }

}
