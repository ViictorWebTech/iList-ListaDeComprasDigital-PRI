<?php

require 'head-login.php';
require 'header-login.php';

?>
    <main class="main-login main">
        <section class="left-login">
            <h1 class="name">iList:</h1>
            <h1 class="turn">Conheça agora, a mais nova ferramenta de lista de compras.</h1>
            <img class="left-login-image" src="assets/img/icons/organizacao.svg" alt="Casal se organizando">
        </section>
        <form action="validacao.php" method="post">
            <section class="right-login">


                <div class="card-login">
                    <h1>CADASTRE-SE</h1>
                    <div class="textfield">
                        <label for="user">Insira seu nome de usuário:</label>
                        <input type="text" name="user" placeholder="Usuário" required>
                    </div>
                    <div class="textfield">
                        <label for="pass">Crie uma senha:</label>
                        <input type="password" name="pass" placeholder="Senha" required>
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