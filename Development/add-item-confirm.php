<?php
session_start();
require 'logica-autenticacao.php';

if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}


$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li><li class="nav-item"><a class="nav-link" href="add-item.php">Adicionar Item</a></li>';
require 'head-system.php';
require 'header-system.php';

require 'conexao.php';
$id_usuario = id_usuario();
$nome = filter_input(INPUT_POST, "nome", FILTER_SANITIZE_SPECIAL_CHARS);
$urlfoto = filter_input(INPUT_POST, "urlfoto", FILTER_SANITIZE_URL);
$nome_mercado = filter_input(INPUT_POST, "nome_mercado", FILTER_SANITIZE_SPECIAL_CHARS);
$preco = filter_input(INPUT_POST, "preco", FILTER_SANITIZE_NUMBER_FLOAT);


$sql = "INSERT INTO itens(id_usuario, nome, urlfoto, nome_mercado, preco) 
        VALUES (?, ?, ?, ?, ?)";

try {
    $stmt = $conn->prepare($sql);
    $result = $stmt->execute([$id_usuario, $nome, $urlfoto, $nome_mercado, $preco]);
} catch (Exception $e) {
    $result = false;
    $error = $e->getMessage();
}



?>
<main class="main main-add">


    <div class="item-confirm">
        <h1>Confirmação de Inserção</h1>
        <hr class="hr-mb">


        <?php

        if ($result == true) {
            //Deu certo

            $_SESSION["result-add"] = true;
        } else {
            //Não deu certo, erro
            //tratamento de mensagem de erro

            if (stripos($error, "type") !== false) {
                $error = "Tipo de valor inválido";
            }
            $_SESSION["result-add"] = false;
            $_SESSION["erro"] = $error;
        }

        redireciona("home.php");
        ?>


</main>



<?php


require 'footer-system.php'

?>