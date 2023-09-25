<?php


session_start();
require 'logica-autenticacao.php';

$links_menu = '<li class="nav-item"><a class="nav-link" href="login.php">Login</a></li><li class="nav-item"><a class="nav-link" href="apresentacao.php">Apresentação</a></li>';

require 'head-login.php';
require 'header-login.php';

require 'conexao.php';

$email = filter_input(INPUT_POST, "email", FILTER_SANITIZE_EMAIL);
$senha = filter_input(INPUT_POST, "senha", FILTER_SANITIZE_SPECIAL_CHARS);


$sql = "SELECT nome_usuario, urlfoto_usuario, senha, id_usuario FROM usuarios WHERE email = ?";
$stmt = $conn->prepare($sql);
$stmt->execute([$email]);

$row = $stmt->fetch();
?>

<main class="main-login main">
  <section class="left-login">
    <h1 class="name">iList:</h1>
    <h1 class="turn">Conheça agora, a mais nova ferramenta de lista de compras.</h1>
    <img class="left-login-image" src="assets/img/icons/organizacao.svg" alt="Casal se organizando">
  </section>

  <section class="right-login">


    <div class="card-login item-confirm">
      <h1>CONFIRMAÇÃO DE LOGIN</h1>
      <hr class="hr-mb">

      <?php
      if (password_verify($senha, $row['senha'])) {
        //Deu certo

        $_SESSION["email"] = $email;
        $_SESSION["nome_usuario"] = $row['nome_usuario'];
        $_SESSION["urlfoto_usuario"] = $row['urlfoto_usuario'];
        $_SESSION["id_usuario"] = $row['id_usuario'];
      ?>
        <h1>Perfil logado com sucesso!</h1>

        <h4>Email: <span class="atributo-item"><?= $email; ?></span></h4>
    </div>
  <?php
      } else {
        //Não deu certo, erro

        unset($_SESSION["email"]);
        unset($_SESSION["nome"]);
  ?>
    <h1>Falha ao efetuar login.</h1>
    <h4>Usuário ou Senha incorretos</h4>
    </div>

  <?php

      }
  ?>

  </section>

</main>


<?php
if (autenticado()) {
  header('Location: home.php');
} else {
  $_SESSION['erro-login'] = true;
  redireciona("login.php");
  die();
}
require 'footer-login.php';

?>