package org.example.week3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle mycircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
       //  System.out.println("Moved up");
        mycircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
       // System.out.println("Moved down");
        mycircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
      //  System.out.println("Moved left");
        mycircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
       // System.out.println("Moved right");
        mycircle.setCenterX(x+=10);
    }
}