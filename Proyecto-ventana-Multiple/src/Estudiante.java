public class Estudiante 
{
    private String nombre;
    private String matricula;
    private String carrera;
    
    public Estudiante() 
    {
      setNombre("");
      setMatricula("");
      setCarrera("");
    }
    public Estudiante(String Nombre, String Matricula, String Carrera)
    {
        this.nombre = Nombre;
        this.matricula = Matricula;
        this.carrera = Carrera;
         
    }

    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }
    public void setMatricula(String Matricula)
    {
        this.matricula = Matricula;
    }
    public void setCarrera(String Carrera)
    {
        this.carrera = Carrera;
    }
    public String getNombre(){return nombre;}
    public String getMatricula(){return matricula;}
    public String getCarrera(){return carrera; }
}