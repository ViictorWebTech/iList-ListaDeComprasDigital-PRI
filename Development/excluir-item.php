<?php
session_start();
require 'logica-autenticacao.php';
if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}


require 'conexao.php';
$id_item = filter_input(INPUT_GET, "id_item", FILTER_SANITIZE_NUMBER_INT);
$id_usuario = id_usuario();

if (id_usuario() != $id_usuario) {
    $_SESSION["result"] = false;
    $_SESSION["erro"] = "Operação não permitida";
    redireciona("home.php");
    die();
}




$sql = "DELETE FROM itens WHERE id_item = ? AND id_usuario = ?";

try {
    $stmt = $conn->prepare($sql);
    $result = $stmt->execute([$id_item, $id_usuario]);
    $count = $stmt->rowCount();
} catch (Exception $e) {
    $result = false;
    $error = $e->getMessage();
}




if (empty($id_item)) {
    $error = "ID do item está vazio.";

    $_SESSION["excluir-vazio"] = false;
    $_SESSION["erro-vazio"] = $error;
    redireciona("home.php");
    die();
} else {

    $_SESSION["excluir-vazio"] = true;
}



if ($result == true && $count >= 1) {
    redireciona("home.php");
    die();
} elseif ($count == 0) {
    $_SESSION["result"] = false;
    $_SESSION["erro"] = "Não foi encontrado nenhum item com o ID = $id_item";
    redireciona("home.php");
    die();
} else {
    //Não deu certo, erro
    $_SESSION["result"] = false;
    $_SESSION["erro"] = $error;
    redireciona("home.php");
    die();
}
?>



<?php

require 'footer-system.php'

?>