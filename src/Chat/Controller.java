package Chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {

    @FXML
    TextField chatField;

    @FXML
    TextArea chatArea;

    private void sendMessage(){
        if(!chatField.getText().equals("")) {
            chatArea.appendText(chatField.getText() + "\n");
            chatField.clear();
        }
    }

    public void clickSendBtn(ActionEvent actionEvent) {
        sendMessage();
    }
}
