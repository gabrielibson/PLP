package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;


/**
 * Exce�ao lan�ada quando um procedimento que est� sendo referenciado
 * n�o foi declarado.
 */
public class ProcedimentoNaoDeclaradoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor
     * @param id Identificador representando o procedimento.
     */
    public ProcedimentoNaoDeclaradoException(Id id) {
        super("Procedimento " + id + " nao declarado.");
    }
}
