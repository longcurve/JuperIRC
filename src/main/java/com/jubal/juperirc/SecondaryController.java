package com.jubal.juperirc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    public void onConnect(ActionEvent event) {
        
    }
    
    public void onDisconnect(ActionEvent event) {
        
    }
    
    public void onSettings(ActionEvent event) {
        
    }
}