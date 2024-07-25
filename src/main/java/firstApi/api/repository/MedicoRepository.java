package firstApi.api.repository;

import firstApi.api.entidades.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {

}
