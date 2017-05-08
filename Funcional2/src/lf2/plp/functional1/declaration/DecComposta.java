package lf2.plp.functional1.declaration;

import lf2.plp.expressions2.memory.AmbienteCompilacao;
import lf2.plp.expressions2.memory.AmbienteExecucao;
import lf2.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf2.plp.expressions2.memory.VariavelNaoDeclaradaException;

public class DecComposta implements DeclaracaoFuncional {
	private DeclaracaoFuncional d1;
	private DeclaracaoFuncional d2;
	
	public DecComposta(DeclaracaoFuncional d1, DeclaracaoFuncional d2) {
		this.d1=d1;
		this.d2=d2;
	}

	public boolean checaTipo(AmbienteCompilacao ambiente)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		return (d1.checaTipo(ambiente) && d2.checaTipo(ambiente));
	}

	public void elabora(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException {
		d1.elabora(amb, aux);
		d2.elabora(amb, aux);
	}

	public void elabora(AmbienteCompilacao amb, AmbienteCompilacao aux) throws VariavelJaDeclaradaException {
		d1.elabora(amb, aux);
		d2.elabora(amb, aux);
	}

	public void incluir(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException {
		d1.incluir(amb, aux);
		d2.incluir(amb, aux);
	}

	public void incluir(AmbienteCompilacao amb, AmbienteCompilacao aux, boolean incluirCuringa) throws VariavelJaDeclaradaException {
		d1.incluir(amb, aux, incluirCuringa);
		d2.incluir(amb, aux, incluirCuringa);
	}

	public DeclaracaoFuncional clone() {
		return new DecComposta(d1.clone(),d2.clone());
	}

	@Override
	public void reduzir(AmbienteExecucao amb) {
		d1.reduzir(amb);
		d2.reduzir(amb);
	}

}
