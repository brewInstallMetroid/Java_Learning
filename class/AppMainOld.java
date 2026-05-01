package edu.unomaha.epubreader.app;

import edu.unomaha.epubreader.io.FileValidator;
import edu.unomaha.epubreader.app.ReaderController.*;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import nl.siegmann.epublib.epub.EpubReader;
import nl.siegmann.epublib.domain.SpineReference;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.domain.Book;


public class AppMainOld extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// NOTE:: Setup for main scene with top and sidebar
			ListView<String> sideMenu = new ListView<>();
			Label toolLabel = new Label("MENU");

			Button openButton = new Button("Open");
			FileChooser fiCh = new FileChooser();
			fiCh.setTitle("Open EPUB to read");
			fiCh.setInitialDirectory(new File(System.getProperty("user.dir")));
			Label mainLabel = new Label();
			Label titleLabel = new Label();
			Label authorLabel = new Label();

			Button pageIncButton = new Button("Next Page");
			Button pageDecButton = new Button("Previous Page");

			Separator sep0 = new Separator();
			Separator sep1 = new Separator();
			Separator sep2 = new Separator();

			
			sideMenu.getItems().addAll(
					 
					);
			ToolBar headerBar = new ToolBar(toolLabel, sep0, openButton, sep1, pageDecButton, sep2, pageIncButton);
			BorderPane layout = new BorderPane();
			WebView webView = new WebView();
			sideMenu.setMaxWidth(100);
			layout.setTop(headerBar);
			layout.setLeft(sideMenu);
			layout.setCenter(webView);
			VBox infoVBox = new VBox(mainLabel, titleLabel, authorLabel);

			infoVBox.setPadding(new Insets(8));
			infoVBox.setStyle("""
				-fx-border-color: #555;
				""");
			layout.setRight(infoVBox);
			//layout.setCenter(mainLabel);
			//layout.setRight(authorLabel);
			//layout.setBottom(titleLabel);
			
			
			// NOTE:: Open Button logic containing EpubReader instantiation and Book object creation
			openButton.setOnAction(e -> {
				File selectedEpub = fiCh.showOpenDialog(primaryStage);
				if (FileValidator.isValidEpub(selectedEpub) && selectedEpub != null) {
					mainLabel.setText("Selected File::\n" + selectedEpub.getName());
					EpubReader reader = new EpubReader();
					try {
						Book book = reader.readEpub(new FileInputStream(selectedEpub.getPath()));
						titleLabel.setText("Title: " + book.getTitle());
						var bookMetadata = book.getMetadata();
						authorLabel.setText("Author: " + bookMetadata.getAuthors());
						
						/*
						ListView<String> chapterList = new ListView<>();
						ObservableList<String> items = FXCollections.observableArrayList();
						for (SpineReference ref : book.getSpine().getSpineReferences()) {
							items.add(getChapterTitle(ref));
						}
						chapterList.setItems(items);*/

					} catch (Exception ex) {
						showError("An unexpected error occured during File I/O: " + ex.getMessage());
					}
				} else {
					mainLabel.setText("FILE INVALID!\nMust be an Epub\n" + selectedEpub.getPath());
				}
			});
			Scene sidebarScene = new Scene(layout, 700, 400);


			// NOTE:: Setup for intro scene with begin button
			Label label = new Label("Welcome to my EPUB Display App!");
			Button beginButton = new Button("BEGIN");
			beginButton.setOnAction(e -> {
				try {
					primaryStage.setScene(sidebarScene);
					primaryStage.show();
				} catch (Exception ex) {
					showError("An unexpected error occured: " + ex.getMessage());
				}
			});
			VBox root = new VBox(10, label, beginButton);
			root.setStyle("-fx-padding: 20; -fx-alignment: center;");

			
			// NOTE:: Inital stage instantiation
			Scene scene = new Scene(root, 300, 200);
			primaryStage.setTitle("EPUB-DISPLAYER");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception ex) {
			showError("An unexpected error occured: " + ex.getMessage());
		}
	}
	


	private void showError(String message) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("ERROR:");
		alert.setHeaderText("App Error");
		alert.setContentText(message);
		alert.showAndWait();	
	}



	public static void main(String[] args) {
		launch(args);
	}
	//public static void main(String[] args) {
	//	System.out.println("Welcome to my EPUB Display App!");
	//}
}
