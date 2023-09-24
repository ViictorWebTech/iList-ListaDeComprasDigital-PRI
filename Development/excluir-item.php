<?php
session_start();
require 'logica-autenticacao.php';
if(!autenticado()){

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
    }
    

$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li><li class="nav-item"><a class="nav-link" href="add-item.php">Adicionar Item</a></li>';
require 'head-system.php';
require 'header-system.php';

require 'conexao.php';
$id_item = filter_input(INPUT_GET, "id_item", FILTER_SANITIZE_NUMBER_INT);

if(empty($id_item)){
    ?>
    <main class="main main-add">
    <div class="item-confirm centralizar-texto">

    <h1>Falha ao excluir.</h1>
    <hr class="hr-mb">
    <h4>ID do produto está vazio.</h4>
</div>

</main>

<?php
require 'footer-system.php';
    exit;
}


$sql = "DELETE FROM itens WHERE id_item = ?";

$stmt = $conn->prepare($sql);
$result = $stmt->execute([$id_item]);

$count = $stmt->rowCount();

?>
<main class="main main-add">


    <div class="item-confirm centralizar-texto">
        <h1>Confirmação de Exclusão</h1>
        <hr class="hr-mb">


        <?php

        if ($result == true && $count >= 1) {
            //Deu certo
        ?>
            <h1>Seu item foi excluído com sucesso!</h1>
            <h4>ID Excluído: <?= $id_item; ?></h4>
    </div>
<?php
        } elseif ($count == 0) {
?>

    <h1>Falha ao efetuar exclusão.</h1>
    <h4>Não foi encontrado nenhum item com o ID = <?= $id_item ?>.</h4>
    </div>

<?php

        } else {
            //Não deu certo, erro
            $errorArray = $stmt->errorInfo();
?>
    <h1>Falha ao efetuar exclusão.</h1>
    <h4><?= $errorArray[2]; ?></h4>
    </div>

<?php
        }
?>


</main>


<?php

require 'footer-system.php'

?>