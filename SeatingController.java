import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class SeatingController {

    @FXML
    private GridPane seatingGrid;

    @FXML
    private TextField nameField;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Button addButton;

    public void initialize() {

        addButton.setOnAction(this::addStudent);
    }

    private void addStudent(ActionEvent event) {

    }
}

