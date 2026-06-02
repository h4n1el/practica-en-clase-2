public class UserService
{
    public static void ValidarEstudiante(String nombre, String edad, double indiceAcademico) throws ValidarEstudiantesException 
    {
        if(nombre.isEmpty())
        {
            throw new EstudianteValidar("el nombre no puede estar vacio");
        }
        System.out.println("nombre valido");

        if(edad < 18)
        {
            throw new EstudianteValidator("el estudiente no puede ser menor");
        }
        System.out.println("edad valida");

        if(indiceAcademico < 4.0 || indiceAcademico > 0.0 )
        {
            throw new EstudianteValidator("el dindice acadamici no va asi pa");
        }
        System.out.println("indice valido");
    }
    
}