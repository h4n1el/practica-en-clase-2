public class Estudiante
{
  private String nombre;
  private String edad;
  Private double indiceAcademico;

  public estudiante()
  {
    setNombre("");
    setEdad("");
    setIndiceAcademico(0);
  }  
  public Estudiante(String Nombre, String Edad, double IndiceAcademico )
  {
    setNombre(Nombre);
    setEdad(Edad);
    setIndiceAcademico(IndiceAcademico);
  }
  public void setNombre(String Nombre)
  {
   try {
    if (nombre == null || nombre.isEmpty()) {
   throw new EstudianteValidator("El nombre no puede estar vacío.");
    }
   this.nombre = nombre;
   System.out.println("El nombre es válido.");
   } catch (EstudianteValidator e) {
    System.out.println("Detalle del error en Nombre: " + e.getMessage());
    } finally {
    System.out.println("yts - Proceso de Nombre finalizado.");
    }
    }
  public void setEdad(String edad) {
   try {
            
   if (edad == null || edad.isEmpty()) {
     throw new EstudianteValidator("La edad no puede estar vacía.");
      }
      throw new EstudianteValidator("La edad debe contener solo números.");
      }
            
    this.edad = edad;
    System.out.println("La edad es válida.");
    } catch (EstudianteValidator e) {
      System.out.println("Detalle del error en Edad: " + e.getMessage());
      } finally {
     System.out.println("Proceso de de acabo.");
      }
    }
  public void setIndiceAcademico(double indiceAcademico) {
        try {
    
       if (indiceAcademico < 0 || indiceAcademico > 4.0) {
          throw new EstudianteValidator("El índice académico debe estar entre 0.0 y 4.0.");
         }
            
      this.indiceAcademico = indiceAcademico;
      System.out.println("El índice académico es válido.");
      } catch (EstudianteValidator e) {
      System.out.println("Detalle del error en Índice: " + e.getMessage());
     } finally {
     System.out.println("yts - Proceso de Índice finalizado.");
     }
    }

  public String getNombre(){return nombre;}
  public String getEdad(){return edad;}
  public double getIndiceAcademico(){return indiceAcademico;}

}
