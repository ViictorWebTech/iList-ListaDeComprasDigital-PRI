<?php


session_start();
require 'logica-autenticacao.php';

if (autenticado()) {
    redireciona();
    die();
}

$links_menu = '<li class="nav-item"><a class="nav-link" href="cadastro.php">Cadastro</a></li><li class="nav-item"><a class="nav-link" href="apresentacao.php">Apresentação</a></li>';

require 'head-login.php';
require 'header-login.php';





if (isset($_SESSION['restrito']) && $_SESSION['restrito']) {
?>

    <main class="main main-add">


        <div class="item-confirm">

            <h4>Esse conteúdo é restrito para usuários.</h4>
            <hr class="hr-mb">
            <h1 class="destaque">Faça login para entrar!</h1>


    </main>

<?php
    unset($_SESSION['restrito']);
}


if (isset($_SESSION['erro-login']) && $_SESSION['erro-login']) {
?>

    <main class="main main-add">


        <div class="item-confirm">

            <h4 class="destaque">Erro ao entrar:</h4>
            <hr class="hr-mb">
            <h1>Usuário ou Senha incorretos.</h1>


    </main>

    <?php
    unset($_SESSION['erro-login']);
}

if (isset($_SESSION['result'])) {
    if ($_SESSION['result']) {
        //SE DEU CERTO, SE O RESULT FOR TRUE

        if (isset($_SESSION['logado']) && $_SESSION['logado']) {
    ?>

            <main class="main main-add">


                <div class="item-confirm">

                    <h4>Conta criada com sucesso.</h4>
                    <hr class="hr-mb">
                    <h1 class="destaque">Faça login para entrar!</h1>


            </main>

        <?php
            unset($_SESSION['logado']);
        }
    } else {
        $erro = $_SESSION['erro'];
        unset($_SESSION['erro']);

        ?>

        <main class="main main-add">


            <div class="item-confirm">

                <h4>Erro ao cadastrar.</h4>
                <hr class="hr-mb">
                <h1 class="destaque"><?php echo $erro ?></h1>


        </main>

<?php
    }
    unset($_SESSION['result']);
}


if (isset($_SESSION['result-login'])) {

    if ($_SESSION['result-login']) {
        //SE LOGIN DEU CERTO
    } else {
        $erro = $_SESSION['erro'];
        unset($_SESSION['erro']);
    }
    unset($_SESSION['result-login']);
}



?>
<main class="main-login main">
    <section class="left-login">
        <h1 class="name">iList:</h1>
        <h1 class="turn">É mais que uma solução, é uma mão amiga no caos.</h1>
        <img class="left-login-image" src="assets/img/icons/organizacao.svg" alt="Casal se organizando">
    </section>
    <form action="login-validacao.php" method="post">
        <section class="right-login">


            <div class="card-login">
                <h1>LOGIN</h1>
                <div class="textfield">
                    <label for="email">E-mail</label>
                    <input type="email" name="email" id="email" placeholder="Email" required>
                </div>
                <div class="textfield">
                    <label for="senha">Senha</label>
                    <input type="password" name="senha" id="senha" placeholder="Senha" required>
                </div>
                <button class="btn-login" type="submit">Entrar</button>
                <p class="text-cadastro">Não tem uma conta?</p>
                <a href="cadastro.php" class="link-cadastro">Cadastre-se</a>

            </div>

        </section>
    </form>
</main>


<?php

require 'footer-login.php';

?>