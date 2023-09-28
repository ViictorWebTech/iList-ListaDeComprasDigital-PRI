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

?>
<main class="main-login main">
    <section class="left-login">
        <h1 class="name">iList:</h1>
        <h1 class="turn">Conheça agora, a mais nova ferramenta de lista de compras.</h1>
        <img class="left-login-image" src="assets/img/icons/organizacao.svg" alt="Casal se organizando">
    </section>
    <form action="cadastro-confirm.php" method="post">
        <section class="right-login">


            <div class="card-login">
                <h1>CADASTRE-SE</h1>
                <div class="textfield">
                    <label for="nome_usuario">Crie um nome de usuário:</label>
                    <input type="text" name="nome_usuario" id="nome_usuario" placeholder="Usuário" required>
                </div>
                <div class="textfield">
                    <label for="email">Insira um email:</label>
                    <input type="email" name="email" id="email" placeholder="E-mail" required>
                </div>
                <div class="textfield">
                    <label for="senha">Crie uma senha:</label>
                    <input type="password" name="senha" id="senha" placeholder="Senha" required>
                </div>
                <div class="textfield">
                    <label for="confsenha">Confirme a senha:</label>
                    <input type="password" name="confsenha" id="confsenha" placeholder="Senha" required onblur="verifica_senhas();">
                </div>
                <div class="textfield">
                    <label for="urlfoto_usuario">Insira uma URL/Link para foto de perfil:</label>
                    <input type="url" name="urlfoto_usuario" id="urlfoto_usuario" placeholder="Insira uma URL/Link de uma imagem">
                </div>
                <button class="btn-login" type="submit">Cadastrar-se</button>
                <p class="text-cadastro">Já possui uma conta?</p>
                <a href="login.php" class="link-cadastro">Entre</a>

            </div>

        </section>
    </form>
</main>


<?php

require 'footer-login.php';

?>