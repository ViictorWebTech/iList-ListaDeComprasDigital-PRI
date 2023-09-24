<?php


session_start();
require 'logica-autenticacao.php';

if(autenticado()){
header("Location: home.php");
}

else{

header("Location: apresentacao.php");
}

?>