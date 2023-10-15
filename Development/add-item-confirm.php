<?php
session_start();
require 'logica-autenticacao.php';

if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}


$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li><li class="nav-item"><a class="nav-link" href="add-item.php">Adicionar Item</a></li>';
require 'head-system.php';
require 'header-system.php';

require 'conexao.php';
$id_usuario = filter_input(INPUT_POST, "id_usuario", FILTER_SANITIZE_NUMBER_INT);
$nome = filter_input(INPUT_POST, "nome", FILTER_SANITIZE_SPECIAL_CHARS);
$urlfoto = filter_input(INPUT_POST, "urlfoto", FILTER_SANITIZE_URL);
$nome_mercado = filter_input(INPUT_POST, "nome_mercado", FILTER_SANITIZE_SPECIAL_CHARS);
$preco = filter_input(INPUT_POST, "preco", FILTER_SANITIZE_NUMBER_FLOAT);


$sql = "INSERT INTO itens(id_usuario, nome, urlfoto, nome_mercado, preco) 
        VALUES (?, ?, ?, ?, ?)";

$stmt = $conn->prepare($sql);
$result = $stmt->execute([$id_usuario, $nome, $urlfoto, $nome_mercado, $preco]);

?>
<main class="main main-add">


    <div class="item-confirm">
        <h1>Confirmação de Inserção</h1>
        <hr class="hr-mb">


        <?php

        if ($result == true) {
            //Deu certo
        ?>
            <h1>Seu item foi adicionado com sucesso!</h1>
            <?php
            if (!$urlfoto) {
            ?>
                <td><img class="img-item atr-foto" src="https://img.icons8.com/pastel-glyph/64/open-box.png" alt="<?= $nome; ?>" width="50" height="50"></td>
            <?php
            } else {
            ?>
                <img class="img-item" width="50" height="50" src="<?= $urlfoto; ?>" alt="<?= $nome; ?>" />
            <?php
            }
            ?>
            <h4>Nome: <span class="atributo-item"><?= $nome; ?></span></h4>
            <h4>URL Foto: <span class="atributo-item"><?= $urlfoto; ?></span></h4>
            <h4>Nome do Mercado: <span class="atributo-item"><?= $nome_mercado; ?></span></h4>
            <h4>Preço: <span class="atributo-item">R$<?= $preco; ?></span></h4>
    </div>
<?php
        } else {
            //Não deu certo, erro
            $errorArray = $stmt->errorInfo();
?>
    <h1>Falha ao efeutar gravação.</h1>
    <p><?= $errorArray[2]; ?></p>
    </div>

<?php

        }
?>


</main>




<?php

require 'footer-system.php'

?>