<?xml version="1.0" encoding="UTF-8"?>

        <?import javafx.scene.control.*?>
        <?import javafx.scene.layout.*?>

<AnchorPane id="AnchorPane" prefHeight="400" prefWidth="600" xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1">
<children>
<GridPane fx:id="seatingGrid" layoutX="14.0" layoutY="14.0" prefHeight="372.0" prefWidth="572.0">

</GridPane>
<VBox layoutX="14.0" layoutY="392.0" prefHeight="86.0" prefWidth="572.0" spacing="10.0">
<Label text="Student Name:" />
<TextField fx:id="nameField" />
<Label text="Choose Color:" />
<ColorPicker fx:id="colorPicker" />
<Button fx:id="addButton" text="Add Student" />
</VBox>
</children>
</AnchorPane>
