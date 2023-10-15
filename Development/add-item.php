<?php

session_start();
require 'logica-autenticacao.php';


require 'head-system.php';

$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li>';
require 'header-system.php';

if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}

?>

<main class="main main-add">
    <form action="add-item-confirm.php" method="post">


        <div class="form-add-item">
            <h1>Adicionar Item</h1>

            <img class="img-item" width="50" height="50" src="" alt="" id="image-preview" style="display: none;" />
            <input type="hidden" name="id_usuario" id="id_usuario" value="<?= id_usuario(); ?>">
            <div class="textfield">
                <label for="user">Nome</label>
                <input type="text" id="nome" name="nome" placeholder="Nome do Item" required>
            </div>
            <div class="textfield">
                <label for="urlfoto">Você pode adicionar a URL de uma Foto ou Imagem do produto</label>
                <input type="url" id="urlfoto" name="urlfoto" placeholder="URL da imagem" onchange="imagePreview(this.value)">
            </div>
            <div class="textfield">
                <label for="nome_mercado">Nome do Mercado</label>
                <input type="text" id="nome_mercado" name="nome_mercado" placeholder="Nome do mercado" required>
            </div>
            <div class="textfield">
                <label for="preco">Preço</label>
                <input type="number" id="preco" name="preco" placeholder="Preço Estimado do Item" min="0" required>
            </div>

            <button class="btn-add btn-form" type="submit">Adicionar</button>
            <button class="btn-cancel btn-form" type="reset">Cancelar</button>

        </div>

    </form>
</main>

<?php
require 'footer-system.php';

?>