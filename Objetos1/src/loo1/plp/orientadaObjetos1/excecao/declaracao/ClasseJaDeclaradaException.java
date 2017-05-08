package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;


/**
 * Exce��o lan�ada quando a classe que est� sendo declarada, j� o foi
 * anteriormente.
 */
public class ClasseJaDeclaradaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor
     * @param id Identificador representando a classe.
     */
    public ClasseJaDeclaradaException(Id id) {
        super("Classe " + id + " j� declarada.");
    }
}
