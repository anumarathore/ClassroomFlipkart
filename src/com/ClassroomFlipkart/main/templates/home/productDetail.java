package com.ClassroomFlipkart.main.templates.home;

import com.ClassroomFlipkart.main.windows.home.main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class productDetail {

    public static BorderPane productByType(String productId, String productName, String newPrice, String oldPrice, String imageName){

        String imageURL = profile.class.getResource("../../resources/images/small/"+imageName).toExternalForm();
        Image img = new Image(imageURL);
        ImageView imgView = new ImageView(img);
        imgView.setPreserveRatio(true);
        imgView.setFitWidth(0.16*main.window.getWidth());
        main.window.widthProperty().addListener(e-> imgView.setFitWidth(0.16*main.window.getWidth()));

        Label name = new Label(productName);
        name.setPadding(new Insets(7,0,7,0));
        name.setFont(Font.font("Open Sans", 15));
        name.setAlignment(Pos.TOP_CENTER);
        name.setMaxWidth(150);
        name.setWrapText(true);

        Label newP = new Label("₹ "+newPrice);
        newP.setPadding(new Insets(0,5,0,5));
        newP.setFont(Font.font("Open Sans", 14));
        newP.setAlignment(Pos.TOP_RIGHT);

        Label off = new Label((int)(100*(1.0 - Double.parseDouble(newPrice)/Double.parseDouble(oldPrice)))+"% off");
        off.setPadding(new Insets(0,5,0,5));
        off.setFont(Font.font("Open Sans", 14));
        off.setAlignment(Pos.TOP_LEFT);

        BorderPane pro =  new BorderPane(name,imgView,null,
                new BorderPane(null,null,off,null,newP),
                null);
        pro.setPrefHeight(200);

        return pro;
    }

}