package model;
public class Cita
{
    private String codigoCita;
    private String nombrePaciente;
    private String cedula;
    private String telefono;
    private String medico;
    private String especialidad;
    private String fechaCita;
    private String hora;
    private String motivoConsulta;
    private String estado;

    public Cita(String CodigoCita, String NombrePaciente, String Cedula, String Telefono, String Medico, String Especialidad, String FechaCita, String Hora, String MotivoConsulta, String Estado)
    {
        this.codigoCita = CodigoCita;
        this.nombrePaciente = NombrePaciente;
        this.cedula = Cedula;
        this.telefono = Telefono;
        this.medico = Medico;
        this.especialidad = Especialidad;
        this.fechaCita = FechaCita;
        this.hora = Hora;
        this.motivoConsulta = MotivoConsulta;
        this.estado = Estado;
    }
    public String getCodigoCita(){return codigoCita;}
    public String getNombrePaciente(){return nombrePaciente;}
    public String getCedula(){return cedula;}
    public String getTelefono(){return telefono;}
    public String getMedico(){return medico;}
    public String getEspecialidad(){return especialidad;}
    public String getFechaCita(){return fechaCita;}
    public String getHora(){return hora;}
    public String getMotivoConsulta(){return motivoConsulta;}
    public String getEstado(){return estado;}

    public void setCodigoCita(String CodigoCita)
    {
        this.codigoCita = CodigoCita;
    }
    public void setNombrePaciente(String NombrePaciente){
        this.nombrePaciente = NombrePaciente;
    }
    public void setCedula(String Cedula){
        this.cedula = Cedula;
    }
    public void setTelefono(String Telefono){
        this.telefono = Telefono;
    }
    public void setMedico(String Medico){
        this.medico = Medico;
    }
    public void setEspecialidad(String Especialidad){
        this.especialidad = Especialidad;
    }
    public void setFechaCita(String FechaCita){
        this.fechaCita = FechaCita;
    }
    public void setHora(String Hora){
        this.hora = Hora;
    }
    public void setMotivoConsulta(String MotivoConsulta){
        this.motivoConsulta = MotivoConsulta;
    }
   
    

}