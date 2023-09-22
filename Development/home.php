<?php

$links_menu = '<li class="nav-item"><a class="nav-link" href="add-item.php">Adicionar Item</a></li>
<li class="nav-item"><a class="nav-link" href="how-to-add.php" target="_blank">Como Instalar o Aplicativo?</a></li>';

require 'head-system.php';

require 'header-system.php';

require 'conexao.php';

$sql = "SELECT nome, urlfoto, nome_mercado, preco FROM itens ORDER BY id_item";
$stmt = $conn->query($sql);

?>


<main class="main main-itens">


<div class="listagem">
    <h2>Itens Adicionados</h2>

    <section class="itens">
        <section class="item">
        <p>Foto</p>
        <p>Item</p>
        <p>Mercado</p>
        <p>Preço Estimado</p>
        </section>
        <?php
            while($row = $stmt->fetch()){
        ?>
        <section class="item"><img src="<?= $row["urlfoto"]?>" alt="Imagem do item" width="50" height="50">
            <p class="nome-item"><?= $row["nome"]?></p>
            <p class="nome-mercado"><?= $row["nome_mercado"]?></p>
            <p class="preco">R$<?= $row["preco"]?></p>
        </section>
        <?php 
            }
        ?>
    </section>
<hr style="width: 100%;">
<h4>Teste de conexão</h4>
<?php
require 'conexao.php';
?>
</div>

</main>

<?php

require 'footer-system.php'

?>