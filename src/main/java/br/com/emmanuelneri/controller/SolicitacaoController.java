package br.com.emmanuelneri.controller;

import br.com.emmanuelneri.model.Solicitacao;
import br.com.emmanuelneri.service.SolicitacaoService;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SolicitacaoController {

    private Solicitacao solicitacao;

    @Inject
    private SolicitacaoService cadastroService;

    public SolicitacaoController() {
        inicializarSolicitacao();
    }

    private void inicializarSolicitacao() {
        this.solicitacao = new Solicitacao();
    }

    public void enviar() {
        cadastroService.enviarSolicitacao(solicitacao);

        FacesContext.getCurrentInstance().addMessage("",
                new FacesMessage(String.format("Olá %s, seu solicitacao foi enviado com sucesso!",
                        this.solicitacao.getNome())));

        inicializarSolicitacao();
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
}
