<?php
// Array associativo para armazenar os usuários e senhas com os hashes gerados
$usuarios = array();

// Adicionar usuários e senhas criptografadas ao array
$usuarios['kalyne'] = password_hash('senha_kalyne', PASSWORD_DEFAULT);
$usuarios['victor'] = password_hash('senha_victor', PASSWORD_DEFAULT);
$usuarios['svitorz'] = password_hash('fabao', PASSWORD_DEFAULT);


$user = filter_input(INPUT_POST, 'user', FILTER_SANITIZE_SPECIAL_CHARS);
$passDigitada = filter_input(INPUT_POST, 'pass', FILTER_SANITIZE_SPECIAL_CHARS);


if (isset($usuarios[$user]) && password_verify($passDigitada, $usuarios[$user])) {
    header('Location: home.php');
    exit();
} else {
    header('Location: login.php');
    exit();
}
