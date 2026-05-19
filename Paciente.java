public class Paciente{
   public String nombre;
   public double peso;
   public double altura;

   public Paciente()
   {
    setNombre("");
    setPeso(0);
    setAltura(0);
   }
   public Paciente(String nombre, double peso, double altura)
   {
    setNombre(nombre);
    setPeso(peso);
    setAltura(altura);
   }

   public String getNombre(){return nombre;}
   public double getPeso(){return peso;}
   public double getAltura(){return altura;}

   public void setNombre(String Nombre)
   {
    this.nombre = Nombre;
   }
   public void setPeso(double Peso)
   {
    this.peso = Peso;
   }
   public void setAltura(double Altura)
   {
    this.altura = Altura;
   }

}