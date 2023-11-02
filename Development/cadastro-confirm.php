<?php

session_start();
require 'logica-autenticacao.php';

if (autenticado()) {
  redireciona("home.php");
  die();
}

require 'head-login.php';

require 'conexao.php';

$nome_usuario = filter_input(INPUT_POST, "nome_usuario", FILTER_SANITIZE_SPECIAL_CHARS);
$email = filter_input(INPUT_POST, "email", FILTER_SANITIZE_EMAIL);
$senha = filter_input(INPUT_POST, "senha");
$urlfoto_usuario = filter_input(INPUT_POST, "urlfoto_usuario", FILTER_SANITIZE_URL);


$sql = "INSERT INTO usuarios(nome_usuario, email, senha, urlfoto_usuario) 
        VALUES (?, ?, crypt(?, gen_salt('bf', 8)), ?)";


try {
  $stmt = $conn->prepare($sql);
  $result = $stmt->execute([$nome_usuario, $email, $senha, $urlfoto_usuario]);
} catch (Exception $e) {
  $result = false;
  $error = $e->getMessage();
}
if ($result == true) {
  //Deu certo
  $_SESSION["result"] = true;
} else {
  //Não deu certo, erro
  //tratamento de mensagem de erro

  if (stripos($error, "duplicate key") !== false) {
    $error = "Email já cadastrado.";
  }
  $_SESSION["result"] = false;
  $_SESSION["erro"] = $error;
}
redireciona("login.php");
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

?>