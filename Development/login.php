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
                    <h1>LOGIN</h1>
                    <div class="textfield">
                        <label for="user">Usuário</label>
                        <input type="text" name="user" placeholder="Usuário" required>
                    </div>
                    <div class="textfield">
                        <label for="pass">Usuário</label>
                        <input type="password" name="pass" placeholder="Senha" required>
                    </div>
                    <button class="btn-login" type="submit">Login</button>
                    <p class="text-cadastro">Não tem uma conta?</p>
                    <a href="cadastro.php" class="link-cadastro">Cadastre-se</a>

                </div>

            </section>
        </form>
    </main>


    <?php

require 'footer-login.php';

?>