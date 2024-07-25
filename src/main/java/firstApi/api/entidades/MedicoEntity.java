package firstApi.api.entidades;

import firstApi.api.DTO.Medico.EspecialidadeENUM;
import firstApi.api.DTO.Medico.MedicoRecord;
import firstApi.api.repository.MedicoRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private EspecialidadeENUM especialidade;

    @Embedded
    private EnderecoEntity endereco;

    public MedicoEntity(MedicoRecord medico) {
        this.nome = medico.nome();
        this.email = medico.email();
        this.telefone = medico.telefone();
        this.crm = medico.crm();
        this.especialidade = medico.especialidade();
        this.endereco =  new EnderecoEntity(medico.endereco());
    }
}