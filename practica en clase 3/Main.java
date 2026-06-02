public class Main
{
    public void main(String[] args)
    {
        System.out.println("=== Estudiante válido ===");
        Estudiante est1 = new Estudiante("Carlos", "20", 3.8);
        System.out.println("Resultado: " + est1.getNombre() + " creado con éxito.\n");


        System.out.println("===Estudiante invalido ===");
        Estudiante est2 = new Estudiante();
        est2.setNombre("");              
        est2.setEdad("veinte");          
        est2.setIndiceAcademico(5.0);    
        System.out.println();


        
}
}