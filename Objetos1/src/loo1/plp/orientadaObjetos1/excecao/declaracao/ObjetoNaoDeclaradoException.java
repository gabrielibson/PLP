package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;


/**
 * Exce��o lan�ada quando o objeto que est� sendo referenciado n�o
 * foi declarado.
 */
public class ObjetoNaoDeclaradoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor.
     * @param id Identificador representando o objeto.
     */
    public ObjetoNaoDeclaradoException(Id id) {
        super("Objeto" + id + " n�o declarado.");
    }
}