import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public void start(Stage primerEstado) throws Exception
    {
        FXMLLoader carga = new FXMLLoader(
            getClass().getResource("/view/Principal.fxml"));
        
            Scene scene = new Scene(carga.load());

        primerEstado.setTitle("Sistema de Paquetes");
        primerEstado.setScene(scene);
        primerEstado.setWidth(900);
        primerEstado.setHeight(700);
        primerEstado.show();

    }
     public static void main(String[] args) {
        launch(args);
    }
}