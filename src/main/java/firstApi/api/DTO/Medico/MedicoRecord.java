package firstApi.api.DTO.Medico;

import firstApi.api.DTO.Endereco.EnderecoRecord;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record MedicoRecord(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        EspecialidadeENUM especialidade,
        @NotNull @Valid
        EnderecoRecord endereco
)
{ }
