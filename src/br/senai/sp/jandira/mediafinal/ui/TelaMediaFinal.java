package br.senai.sp.jandira.mediafinal.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaMediaFinal extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(700);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setTitle("Média Final");

        // Criar o painel principal (root)
        BorderPane root = new BorderPane();

        // Criar o label com o título da tela
        Label titulo = new Label();
        titulo.setText("Escola SENAI \"Prof. Vicente Amato\"");
        titulo.setStyle("-fx-font-size: 18");
        // Colocar padding em texto
        titulo.setPadding(new Insets(10, 0, 10, 10));

        HBox painelSuperior = new HBox();
        painelSuperior.setStyle("-fx-background-color: lightblue");
        painelSuperior.getChildren().addAll(titulo);

        // Criação do formulário
        VBox painelFormulario = new VBox();
        painelFormulario.setStyle("-fx-background-color: #9ad4e6");
        painelFormulario.setAlignment(Pos.CENTER_LEFT);
        painelFormulario.setPadding(new Insets(30));
        Label lblNomeAluno = new Label("Nome do aluno:");
        Label lblNota1 = new Label("Nota 1:");
        Label lblNota2 = new Label("Nota 2:");
        Label lblNota3 = new Label("Nota 3:");
        Label lblNota4 = new Label("Nota 4:");
        TextField tfNomeAluno = new TextField();
        TextField tfNota1 = new TextField();
        TextField tfNota2 = new TextField();
        TextField tfNota3 = new TextField();
        TextField tfNota4 = new TextField();

        // Organizando os conteúdos
        painelFormulario.getChildren().addAll(
                lblNomeAluno, tfNomeAluno,
                lblNota1, tfNota1,
                lblNota2, tfNota2,
                lblNota3, tfNota3,
                lblNota4, tfNota4
        );

        VBox painelBotoes = new VBox();
        painelBotoes.setPadding(new Insets(0, 20, 0, 0));
        painelBotoes.setSpacing(7); // Espaçamento entre os botões
        painelBotoes.setAlignment(Pos.CENTER); // Deixar os botões no centro
        painelBotoes.setStyle("-fx-background-color: #9ad4e6");
        Button btCalcularMedia = new Button("Calcular média");
        btCalcularMedia.setPrefWidth(150); // Largura
        btCalcularMedia.setPrefHeight(40); // Altura
        Button btLimpar = new Button("Limpar");
        btLimpar.setPrefWidth(150);
        btLimpar.setPrefHeight(40);
        Button btSair = new Button("Sair");
        btSair.setPrefWidth(150);
        btSair.setPrefHeight(40);
        painelBotoes.getChildren().addAll(
                btCalcularMedia,
                btLimpar,
                btSair
        );

        VBox painelResultado = new VBox();
        painelResultado.setStyle("-fx-background-color: lightblue");
        Label lblResultados = new Label("Resultados");
        lblResultados.setStyle("-fx-font-size: 20");
        Label lblNomeResultado = new Label("Nome do aluno: ");
        lblNomeResultado.setStyle("-fx-font-size: 15");
        Label lblMediaFinal = new Label("Média Final: ");
        lblMediaFinal.setStyle("-fx-font-size: 15");
        Label lblSituacao = new Label("Situação: ");
        lblSituacao.setStyle("-fx-font-size: 15");
        painelResultado.getChildren().addAll(
                lblResultados, lblNomeResultado,
                lblMediaFinal, lblSituacao
        );

        // Adicionando o conteúdo ao root
        root.setTop(painelSuperior);
        root.setCenter(painelFormulario);
        root.setRight(painelBotoes);
        root.setBottom(painelResultado);

        // Criar o objeto scene
        Scene scene = new Scene(root);

        // Colocar a scene no stage
        stage.setScene(scene);
        stage.show();
    }

}
