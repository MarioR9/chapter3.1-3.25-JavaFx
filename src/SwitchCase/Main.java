package SwitchCase;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Main extends Application {
        public void start(Stage primaryStage) throws Exception {
            TextInputDialog dialog = new TextInputDialog("Enter Age");
            dialog.setTitle("Text Input Dialog");
            dialog.setHeaderText("Look, a Text Input Dialog");
            dialog.setContentText("Please enter your name:");
            dialog.showAndWait();
            dialog.getResult();
            int Age = Integer.parseInt(dialog.getResult());
            boolean Eval;
            switch (Age){
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18: Eval = true;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("The Age is between 13 and 18 " + " " + Eval);
                    alert.showAndWait();
                default: Eval=false;
                    Alert alert1 = new Alert(Alert.AlertType.WARNING);
                    alert1.setTitle("Dialog");
                    alert1.setHeaderText(null);
                    alert1.setContentText("The Age is not between 13 and 18 " + " " + Eval);
                    alert1.showAndWait();


            }

        }
    }

