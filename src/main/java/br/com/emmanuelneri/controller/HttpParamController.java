package br.com.emmanuelneri.controller;

import br.com.emmanuelneri.utils.annotations.HttpParam;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class HttpParamController {

    @Inject
    @HttpParam(param = "parametro")
    private String parametro;

    public String getParametro() {
        return parametro;
    }
}
