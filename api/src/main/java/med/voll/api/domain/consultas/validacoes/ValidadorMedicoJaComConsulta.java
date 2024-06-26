package med.voll.api.domain.consultas.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consultas.ConsultaRepository;
import med.voll.api.domain.consultas.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoJaComConsulta implements ValidadorAgendamentoConsultas{

    @Autowired
    private ConsultaRepository Repository;

    public void validar(DadosAgendamentoConsulta dados) {

        var medicoPossuiConsulta = Repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
    }
}
