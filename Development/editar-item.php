<?php
session_start();
require 'logica-autenticacao.php';
if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}


$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li>';
require 'head-system.php';
require 'header-system.php';


$id_item = filter_input(INPUT_GET, "id_item", FILTER_SANITIZE_NUMBER_INT);

if (empty($id_item)) {
?>
    <main class="main main-add">
        <div class="item-confirm centralizar-texto">

            <h1>Falha ao abrir formulário para alteração.</h1>
            <hr class="hr-mb">
            <h4>ID do produto está vazio.</h4>
        </div>

    </main>

<?php
    require 'footer-system.php';
    exit;
}


require 'conexao.php';

$sql = "SELECT nome, urlfoto, nome_mercado, preco FROM itens WHERE id_item = ?";

$stmt = $conn->prepare($sql);
$result = $stmt->execute([$id_item]);


$rowItem = $stmt->fetch();

if (!$rowItem) {
?>
    <main class="main main-add">


        <div class="item-confirm centralizar-texto">
            <h1>Formulário de Edição</h1>
            <hr class="hr-mb">
            <h1>Falha ao abrir formulário de edição.</h1>
            <h4>Não foi encontrado nenhum item com o ID = <?= $id_item ?>.</h4>
        </div>

    <?php
} else {
    ?>


        <main class="main main-add">
            <form action="editar-item-confirm.php" method="post">


                <div class="form-add-item">
                    <h1>Editar Item</h1>
                    <hr class="hr-mb">


                    <img class="img-item" width="50" height="50" src="<?= $rowItem['urlfoto']; ?>" alt="<?= $rowItem['nome']; ?>" id="image-preview" />


                    <input type="hidden" name="id_item" id="id_item" value="<?= $id_item; ?>" required>
                    <div class="textfield">
                        <label for="user">Nome</label>
                        <input type="text" id="nome" name="nome" placeholder="Nome do Item" required value="<?= $rowItem['nome']; ?>">
                    </div>
                    <div class="textfield">
                        <label for="urlfoto">Você pode adicionar a URL de uma Foto ou Imagem do produto</label>
                        <input type="url" id="urlfoto" name="urlfoto" placeholder="URL da imagem" value="<?= $rowItem['urlfoto']; ?>" required onchange="imagePreview(this.value)">
                    </div>
                    <div class="textfield">
                        <label for="nome_mercado">Nome do Mercado</label>
                        <input type="text" id="nome_mercado" name="nome_mercado" placeholder="Nome do mercado" value="<?= $rowItem['nome_mercado']; ?>" required>
                    </div>
                    <div class="textfield">
                        <label for="preco">Preço</label>
                        <input type="number" id="preco" name="preco" placeholder="Preço Estimado do Item" min="0" value="<?= $rowItem['preco']; ?>" required>
                    </div>

                    <button class="btn-add btn-form" type="submit">Alterar</button>
                    <button class="btn-cancel btn-form" type="reset">Cancelar</button>

                </div>

            </form>
        </main>

    <?php
}
require 'footer-system.php'

    ?>