package maromo.net.trabalhoMaromo.service;
import maromo.net.trabalhoMaromo.model.Consulta;
import maromo.net.trabalhoMaromo.model.Paciente;
import maromo.net.trabalhoMaromo.repository.InterPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServe {

    @Autowired
    private InterPaciente interPaciente;

    public List<Consulta> listarPacientes() {
        return interPaciente.findAll();
    }

    public Paciente cadastrarPaciente(Paciente paciente) {
        return interPaciente.saveAll(paciente);
    }
}