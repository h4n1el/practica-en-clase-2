public class Estudiante
{
  private String nombre;
  private String edad;
  Private double indiceAcademico;

  public void estudiante()
  {
    setNombre("");
    setEdad("");
    setDouble(0);
  }  
  public void Estudiante(String Nombre, String Edad, double IndiceAcademico )
  {
    setNombre(Nombre);
    setEdad(Edad);
    setIndiceAcademico(IndiceAcademico);
  }
  public void setNombre(String Nombre)
  {
    this.nombre = Nombre;
  }
  public void setEdad(String Edad)
  {
    this.edad = Edad; 
  }
  public void setIndiceAcademico(double IndiceAcademico)
  {
    this.indiceAcademico = IndiceAcademico;
  }
  public String getNombre(){return nombre;}
  public String getEdad(){return edad;}
  public double getIndiceAcademico(){return indiceAcademico;}

  
}