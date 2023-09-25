<?php


session_start();
require 'logica-autenticacao.php';

if (autenticado()) {
  redireciona();
  die();
}

$links_menu = '<li class="nav-item"><a class="nav-link" href="login.php">Login</a></li><li class="nav-item"><a class="nav-link" href="apresentacao.php">Apresentação</a></li>';

require 'head-login.php';
require 'header-login.php';


require 'conexao.php';

$nome_usuario = filter_input(INPUT_POST, "nome_usuario", FILTER_SANITIZE_SPECIAL_CHARS);
$email = filter_input(INPUT_POST, "email", FILTER_SANITIZE_EMAIL);
$senha = filter_input(INPUT_POST, "senha");
$urlfoto_usuario = filter_input(INPUT_POST, "urlfoto_usuario", FILTER_SANITIZE_URL);

$senha_hash = password_hash($senha, PASSWORD_BCRYPT);


$sql = "INSERT INTO usuarios(nome_usuario, email, senha, urlfoto_usuario) 
        VALUES (?, ?, ?, ?)";

$stmt = $conn->prepare($sql);
$result = $stmt->execute([$nome_usuario, $email, $senha_hash, $urlfoto_usuario]);

?>

<main class="main main-add">



  <div class="item-confirm">
    <h1>CONFIRMAÇÃO DE CADASTRO DE USUÁRIO</h1>
    <hr class="hr-mb">

    <?php
    if ($result == true) {
      //Deu certo
    ?>
      <h1>Perfil adicionado com sucesso!</h1>
      <img class="img-item" width="50" height="50" src="<?= $urlfoto_usuario; ?>" alt="<?= $nome; ?>" />
      <h4>Nome: <span class="atributo-item"><?= $nome_usuario; ?></span></h4>
      <h4>Email: <span class="atributo-item"><?= $email; ?></span></h4>
      <h4>Senha Hash: <span class="atributo-item"><?= $senha_hash; ?></span></h4>
      <h4>URL Foto: <span class="atributo-item"><?= $urlfoto_usuario; ?></span></h4>
  </div>
<?php
    } else {
      //Não deu certo, erro
      $errorArray = $stmt->errorInfo();
?>
  <h1>Falha ao efeutar gravação.</h1>
  <p><?= $errorArray[2]; ?></p>
  </div>

<?php

    }
?>


</main>


<?php

if (autenticado()) {
  header('Location: home.php');
} else {
  $_SESSION['logado'] = true;
  redireciona("login.php");
  die();
}

require 'footer-login.php';

?>