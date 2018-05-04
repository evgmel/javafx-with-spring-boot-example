package com.evguru.timer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App extends Application {

    private static ApplicationContext springContext;
    private Parent rootNode;

    public static void main(String[] args) throws Exception {
        App.launch(args);
    }


    @Override
    public void init() throws Exception {
        springContext = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) springContext).register(Config.class);
        ((AnnotationConfigApplicationContext) springContext).refresh();
        rootNode = loadView("Main.fxml");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(rootNode, 540, 390);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(e -> Platform.exit());
        primaryStage.setMinWidth(540);
        primaryStage.setMinHeight(390);
        primaryStage.show();

        System.out.println("Application started");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Application stopped");
    }


    public static Parent loadView(String relativePath) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/views/fxml/" + relativePath));
            loader.setControllerFactory(springContext::getBean);
            return loader.load();
        } catch (Exception ex) {
            System.out.println("ERROR HAPPENED WHILE LOADING VIEW " + relativePath);
            throw new IllegalStateException("Could not load main view!", ex);
        }
    }
}
