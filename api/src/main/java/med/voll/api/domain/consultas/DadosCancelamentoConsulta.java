package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consultas.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
