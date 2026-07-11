import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Cursor;

public class Registro
{
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtCarrera;
    

    @FXML
    private void RegistrarEstudiantes()
    {
        Estudiante estudiante = new Estudiante(
            txtNombre.getText(),
            txtMatricula.getText(),
            txtCarrera.getText()
        );

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Detalle.fxml"));
            VBox root = loader.load();

            Detalle controller = loader.getController();
            controller.setEstudiante(estudiante);

            Stage detalleEstado = new Stage();
            detalleEstado.setTitle("Detalle del Estudiante");
            detalleEstado.setScene(new Scene(root, 400, 500));
            detalleEstado.show();

        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

   
}   