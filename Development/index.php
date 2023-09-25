<?php
session_start();
require 'logica-autenticacao.php';

if(autenticado()){
redireciona('home.php');
die();
}

else{

    redireciona('logout.php');
redireciona('apresentacao.php');
die();
}
