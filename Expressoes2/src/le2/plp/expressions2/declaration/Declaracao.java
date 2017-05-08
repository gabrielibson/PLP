package le2.plp.expressions2.declaration;

import le2.plp.expressions2.memory.AmbienteCompilacao;
import le2.plp.expressions2.memory.AmbienteExecucao;
import le2.plp.expressions2.memory.VariavelJaDeclaradaException;
import le2.plp.expressions2.memory.VariavelNaoDeclaradaException;

public interface Declaracao {
	public void elabora(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException;
	public void elabora(AmbienteCompilacao amb, AmbienteCompilacao aux) throws VariavelJaDeclaradaException;
	public void incluir(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException;
	public void incluir(AmbienteCompilacao amb, AmbienteCompilacao aux) throws VariavelJaDeclaradaException;
	public boolean checaTipo(AmbienteCompilacao amb) throws VariavelJaDeclaradaException, VariavelNaoDeclaradaException;
	public void reduzir(AmbienteExecucao amb);
}
