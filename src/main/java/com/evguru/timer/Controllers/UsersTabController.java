package com.evguru.timer.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.stereotype.Component;


@Component
public class UsersTabController {

    @FXML
    private Button applyUsernameBtn;

    @FXML
    private Label displayName;

    @FXML
    private TextField enteredName;

    @FXML
    public void onClickApplyBtn(MouseEvent event) {
        String name = this.enteredName.getText().trim();

        if (name.length() == 0) {
            displayName.setText("Enter not empty user name!");
            return;
        }

        displayName.setText(name);
        enteredName.setText("");
    }
}
