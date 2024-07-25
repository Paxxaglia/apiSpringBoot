package firstApi.api.controller;

import firstApi.api.DTO.Medico.MedicoRecord;
import firstApi.api.entidades.MedicoEntity;
import firstApi.api.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid MedicoRecord medico) {
        repository.save(new MedicoEntity(medico));
    }
}
