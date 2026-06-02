import java.util.Scanner;
public class Main
{
    public void main(String[] args)
    {
        Scanner boton = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = boton.nextLine();

        System.out.print("Ingrese la edad: ");
        String edad = boton.nextLine();

        System.out.print("Ingrese el índice académico: ");
        double indiceAcademico = boton.nextDouble();

        try
        {
            UserService.ValidarEstudiante(nombre, edad, indiceAcademico);
            Estudiante est = new Estudiante(nombre, edad, indiceAcademico);
            
        }
        catch (EstudianteValidator e)
        {
            System.out.println("Error: " + e.getMessage());
        }finally 
        {
            System.out.println("esto es el final");
        }

        
    }
}
