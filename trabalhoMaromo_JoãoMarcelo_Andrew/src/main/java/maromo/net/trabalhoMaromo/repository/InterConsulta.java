package maromo.net.trabalhoMaromo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maromo.net.trabalhoMaromo.model.Consulta;
import maromo.net.trabalhoMaromo.model.Paciente;
public interface InterConsulta extends JpaRepository<Paciente, Long>{

    Consulta saveAll(Consulta consulta);

}
