package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;
/**
 * Exce��o lan�ada qunado o objeto que est� sendo declarado j� o foi
 * anteriormente.
 */
public class ObjetoJaDeclaradoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor
     * @param id Identificador representando o objeto.
     */
    public ObjetoJaDeclaradoException(Id id) {
        super("Objeto" + id + " j� declarado.");
    }

}
