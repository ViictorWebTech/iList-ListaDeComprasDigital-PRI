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
$id_usuario = id_usuario();



require 'conexao.php';

$sql = "SELECT nome, urlfoto, nome_mercado, preco FROM itens WHERE id_item = ? AND id_usuario = ?";

try {
    $stmt = $conn->prepare($sql);
    $result = $stmt->execute([$id_item, $id_usuario]);

    $rowItem = $stmt->fetch();
} catch (Exception $e) {
    $result = false;
    $error = $e->getMessage();
}




if (empty($id_item)) {
    $error = "ID do item está vazio.";

    $_SESSION["editar-vazio"] = false;
    $_SESSION["erro-vazio"] = $error;
    redireciona("home.php");
    die();
    
} else {
    
    $_SESSION["editar-vazio"] = true;
}


if (!$rowItem) {

    $error = "Não foi encontrado nenhum item com o ID = $id_item.";

    $_SESSION["result-editar"] = false;
    $_SESSION["erro"] = $error;


    redireciona("home.php");
    die();
} else {
    $_SESSION["result-editar"] = true;
?>


    <main class="main main-add">
        <form action="editar-item-confirm.php" method="post">


            <div class="form-add-item">
                <h1>Editar Item</h1>
                <hr class="hr-mb">


                <?php
                if (!$rowItem["urlfoto"]) {
                ?>
                    <td><img class="img-item atr-foto" src="https://img.icons8.com/pastel-glyph/64/open-box.png" alt="<?= $rowItem["nome"] ?>" width="50" height="50"></td>
                <?php
                } else {
                ?>
                    <img class="img-item" width="50" height="50" src="<?= $rowItem['urlfoto']; ?>" alt="<?= $rowItem['nome']; ?>" id="image-preview" />
                <?php
                }
                ?>




                <input type="hidden" name="id_item" id="id_item" value="<?= $id_item; ?>" required>
                <div class="textfield">
                    <label for="user">Nome</label>
                    <input type="text" id="nome" name="nome" placeholder="Nome do Item" required value="<?= $rowItem['nome']; ?>">
                </div>
                <div class="textfield">
                    <label for="urlfoto">Você pode adicionar a URL de uma Foto ou Imagem do produto</label>
                    <input type="url" id="urlfoto" name="urlfoto" placeholder="URL da imagem" value="<?= $rowItem['urlfoto']; ?>" onchange="imagePreview(this.value)">
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