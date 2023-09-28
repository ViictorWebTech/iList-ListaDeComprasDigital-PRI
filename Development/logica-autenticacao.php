<?php


function autenticado()
{
    if (isset($_SESSION["email"])) {
        return true;
    } else {
        return false;
    }
}

function nome_usuario()
{
    return $_SESSION["nome_usuario"];
}

function email_usuario()
{
    return $_SESSION["email"];
}

function urlfoto_usuario()
{
    return $_SESSION["urlfoto_usuario"];
}

function id_usuario()
{
    return $_SESSION["id_usuario"];
}

function redireciona($pagina = null)
{
    if (empty($pagina)) {
        $pagina = "index.php";
    }
    header("Location: " . $pagina);
}
