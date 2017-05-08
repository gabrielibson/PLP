package loo1.plp.orientadaObjetos1.excecao.execucao;

/**
 * Exce��o lan�ada quando uma entrada esperada n�o � fornecida.
 */
public class EntradaNaoFornecidaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construtor.
     */
    public EntradaNaoFornecidaException() {
        super("Forneca os valores de entrada do programa!");
    }

}
