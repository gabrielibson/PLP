package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;


/**
 * Exce��o lan�ada quando um procedimento est� sendo declarado
 * novamente.
 */
public class ProcedimentoJaDeclaradoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor
     * @param id Identificador representando um procedimento.
     */
      public ProcedimentoJaDeclaradoException(Id id) {
        super("Procedimento " + id + " j� declarado.");
      }
}
