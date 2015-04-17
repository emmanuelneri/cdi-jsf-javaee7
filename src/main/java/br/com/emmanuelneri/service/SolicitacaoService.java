package br.com.emmanuelneri.service;

import br.com.emmanuelneri.model.Solicitacao;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SolicitacaoService {

    @Inject
    private Logger logger;

    public void enviarSolicitacao(Solicitacao solicitacao) {
       // enviar solicitacao

        logger.info(String.format("Enviado novo cadastro em nome de %s", solicitacao.getNome()));
    }

}
