<?php


session_start();
require 'logica-autenticacao.php';


require 'head-login.php';

require 'conexao.php';

$email = filter_input(INPUT_POST, "email", FILTER_SANITIZE_EMAIL);
$senha = filter_input(INPUT_POST, "senha", FILTER_SANITIZE_SPECIAL_CHARS);


if( empty($email) || empty($senha) ){
  redireciona('login.php');
  die();
}

$sql = "SELECT nome_usuario, urlfoto_usuario, senha, id_usuario FROM usuarios WHERE email = ?";
$stmt = $conn->prepare($sql);
$stmt->execute([$email]);

$row = $stmt->fetch();

if (password_verify($senha, $row['senha'])) {
  //Deu certo

  $_SESSION["email"] = $email;
  $_SESSION["nome_usuario"] = $row['nome_usuario'];
  $_SESSION["urlfoto_usuario"] = $row['urlfoto_usuario'];
  $_SESSION["id_usuario"] = $row['id_usuario'];

  $_SESSION["result_login"] = true;

} else {
  //Não deu certo, erro

  unset($_SESSION["email"]);
  unset($_SESSION["nome"]);

  $_SESSION["result_login"] = false;
  $_SESSION["erro"] = "Usuário ou Senha incorretos";
}
redireciona("login.php");

if (autenticado()) {
  header('Location: home.php');
} else {
  $_SESSION['erro-login'] = true;
  redireciona("login.php");
  die();
}
