<?php


session_start();
require 'logica-autenticacao.php';

require 'head-how.php';
require 'header-how.php';


?>



<main class="main">


    <section class="howto" id="add">

    </section>
    <section class="topicos">
        <h1>Como faço o download do aplicativo?</h1>
        <p>Você não precisa, utilize direto do seu navegador. Siga as etapas abaixo e adicione o site a tela inicial.</p>
        <hr>
    </section>

    <section class="topicos">
        <h1>Como adicionar o aplicativo a tela inicial?</h1>
    </section>
    <ol>
        <section class="topicos">
            <h2>Android:</h2>
            <li>
                <p>Tenha sua conta criada e com acesso funcionando corretamente.</p>
            </li>
            <li>
                <p>Abra o Chrome e acesse o site <a href="home.php" target="_blank">iList</a>.</p>
            </li>
            <li>
                <p>No canto superior direito, clique no ícone de três pontos verticais.</p>
            </li>
            <li>
                <p>Selecione a opção "Adicionar à tela inicial".</p>
            </li>
            <hr>
        </section>
    </ol>
    <ol>
        <section class="topicos">
            <h2>IOS:</h2>
            <li>
                <p>Tenha sua conta criada e com acesso funcionando corretamente.</p>
            <li>
                <p>Abra o Safari e acesse o site <a href="home.php" target="_blank">iList</a>.</p>
            </li>
            <li>
                <p>Toque no ícone de compartilhamento, que fica na parte inferior da tela.</p>
            </li>
            <img class="how" src="assets/img/icons/how-to/ios-comp.png" alt="Botão de compartilhar no Safari">
            <li>
                <p>Selecione a opção "Adicionar à Tela de Início".</p>
            </li>
            <img class="how" src="assets/img/icons/how-to/ios-add.png" alt="Botão de adicionar a tela inicial">
            <li>
                <p>Na tela seguinte, você pode alterar o nome do atalho e, depois, toque em "Adicionar".</p>
            </li>
            <img class="how" src="assets/img/icons/how-to/ios-add-confirm.png" alt="Botão de adicionar a tela inicial">
        </section>
    </ol>
</main>

<?php

require 'footer-system.php';

?>