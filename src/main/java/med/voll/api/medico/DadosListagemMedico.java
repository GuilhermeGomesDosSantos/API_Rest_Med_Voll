package med.voll.api.medico;

public record DadosListagemMedico(String Nome, String email, String CRM, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
