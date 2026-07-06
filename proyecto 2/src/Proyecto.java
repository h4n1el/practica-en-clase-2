import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.CheckBox;

public class Proyecto {

    private final double POSTRE = 75.0;
    
    @FXML private TextField cantidadTextField;
    @FXML private ComboBox<String> bebida;
    @FXML private TextField clienteTextField;
    @FXML private Button txtCalcular;
    @FXML private Button txtLimpiar;
    @FXML private Label Resultado;
    @FXML private Label Estado;
    @FXML private CheckBox postreCheckBox;

    @FXML 
    private void handleLimpiar() {
        cantidadTextField.clear();
        clienteTextField.clear();
        bebida.setValue(null);
        postreCheckBox.setSelected(false);
        Resultado.setText("Resultado: ");
        Estado.setText("Estado: ");
    }

    @FXML 
    private void handleMouseEntered(MouseEvent event) {
        if (cantidadTextField.getText().isEmpty()) {
            Estado.setText("Por favor ingrese la cantidad de bebidas.");
        }
    }

    @FXML
    private void handleMouseExited(MouseEvent event) {
        if (cantidadTextField.getText().isEmpty()) {
            Estado.setText("Esperando acción del usuario...");
        }
    }

    @FXML
    private void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleCalcular(new ActionEvent());
        }
    }
    @FXML
    private void handlePostreCheckBox(ActionEvent event) {
        if (postreCheckBox.isSelected()) {
            Estado.setText("Se ha agregado un postre al pedido.");
        } else {
            Estado.setText("Se ha quitado el postre del pedido.");
        }
    }

    @FXML
    private double obtenerPrecioBebida(String bebidaSeleccionada) {
        try {
            String[] secciones = bebidaSeleccionada.split("- RD\\$");
            return Double.parseDouble(secciones[1].trim());
        } catch (Exception e) {
            return 0.0;
        }
    }

    @FXML
    private void handleCalcular(ActionEvent event) {
        String cliente = clienteTextField.getText();
        String bebidaSeleccionada = bebida.getValue();
        String cantidadStr = cantidadTextField.getText();

        if (cliente.isEmpty() || bebidaSeleccionada == null || cantidadStr.isEmpty()) {
            Estado.setText("Por favor complete todos los campos.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
        } catch (NumberFormatException e) {
            Estado.setText("Ingrese un numero valido para la cantidad.");
            return;
        }

        double precioBebida = obtenerPrecioBebida(bebidaSeleccionada);
        double total = precioBebida * cantidad;

        if (postreCheckBox.isSelected()) {
            total += POSTRE;
        }

        Resultado.setText("Resultado: RD$" + total);
        Estado.setText("Estado: Calculo realizado heavy.");
    }
}
  

