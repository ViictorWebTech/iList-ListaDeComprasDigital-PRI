<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="iList, a adaptação de suas listas de compras de papéis para os seus dispositivos.">
    <meta name="theme-color" content="#201b2c">
    <link rel="shortcut icon" href="assets/img/icons/compras.png" type="image/x-icon">
    <title>iList - Apresentação</title>

    <link rel="stylesheet" href="assets/css/global.css">
    <link rel="stylesheet" href="assets/css/load.css">
    <link rel="stylesheet" href="assets/css/header.css">
    <link rel="stylesheet" href="assets/css/apresentacao.css">

</head>
<?php
if (!function_exists("autenticado")) {
?>

    <body>


        <br>
        <h1>Atenção, você esqueceu o require do arquivo \'logica-autenticacao.php\'!</h1>

    <?php
    die();
} else {
    ?>

        <body onLoad="loading()">
            <div class="box-load">
                <div class="pre"></div>
            </div>

        <?php
    }
        ?>