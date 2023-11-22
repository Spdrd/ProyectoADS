package com.example.demo1;

import com.example.demo1.eventos.EventosIniciarRenta;
import com.example.demo1.eventos.EventosLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class RentasApplication extends Application {
    private Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource("login.fxml"));
        Pane pane = fxmlLoader.load();
        EventosLogin eventos = fxmlLoader.getController();
        eventos.setAplicacion(this);
        Scene scene = new Scene(pane);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void abrirIniciarRenta(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource("iniciarRenta.fxml"));
            Pane pane = fxmlLoader.load();
            EventosIniciarRenta eventos = fxmlLoader.getController();
            eventos.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){

        }
    }
    public void abrirAgregarServicio(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource("agregarServicio.fxml"));
            Pane pane = fxmlLoader.load();
            EventosIniciarRenta eventos = fxmlLoader.getController();
            eventos.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){

        }
    }
    public void abrirListarServiciosAgregados(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource("listarServiciosAgregados.fxml"));
            Pane pane = fxmlLoader.load();
            EventosIniciarRenta eventos = fxmlLoader.getController();
            eventos.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){

        }
    }
    public void abrirpagarRenta(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource("pagarRenta.fxml"));
            Pane pane = fxmlLoader.load();
            EventosIniciarRenta eventos = fxmlLoader.getController();
            eventos.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){

        }
    }
    public void abrirLogin(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(RentasApplication.class.getResource(("login.fxml")));
            Pane pane = fxmlLoader.load();
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){

        }
    }

    public static void main(String[] args) {
        launch();
    }
}