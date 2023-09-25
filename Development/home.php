<?php
session_start();
require 'logica-autenticacao.php';


require 'head-system.php';

$links_menu = '<li class="nav-item"><a class="nav-link" href="add-item.php">Adicionar Item</a></li>
<li class="nav-item"><a class="nav-link" href="how-to-add.php" target="_blank">Como Instalar o Aplicativo?</a></li>';

require 'header-system.php';


require 'conexao.php';

$id_usuario = id_usuario();

$sql = "SELECT i.id_item, i.nome, i.urlfoto, i.nome_mercado, i.preco FROM itens i INNER JOIN usuarios u ON u.id_usuario = i.id_usuario WHERE u.id_usuario = ? ORDER BY id_item";
$stmt = $conn->prepare($sql);
$result = $stmt->execute([$id_usuario]);

if (!autenticado()) {

    $_SESSION['restrito'] = true;
    redireciona("login.php");
    die();
}
?>

<style>
    .listagem {
        visibility: hidden;
    }
</style>

<main class="main main-add main-itens">
    <div class="item-confirm centralizar-texto">
        <h1>Não há itens em sua tabela.</h1>
        <hr class="hr-mb">
        <h4>Adicione Itens para mostrar.</h4>
    </div>


    <div class="listagem">
        <h2>Itens Adicionados</h2>
        <section class="itens">
            <table class="table">

                <thead class="item">
                    <tr class="atributo-item">
                        <th class="atr-foto">Foto</th>
                        <th class="atr-nome">Item</th>
                        <th class="atr-mercado">Mercado</th>
                        <th class="atr-preco">Preço</th>
                        <th class="atr-botao" colspan="2"></th>
                    </tr>
                </thead>
                <tbody class="item">




                    <?php
                    while ($row = $stmt->fetch()) {
                    ?>
                        <style>
                            .listagem {
                                visibility: visible;
                            }

                            .item-confirm {
                                display: none;
                            }
                        </style>
                        <tr>
                            <td><img class="img-item atr-foto" src="<?= $row["urlfoto"] ?>" alt="<?= $row["nome"] ?>" width="50" height="50"></td>
                            <td class="atributo-item atr-nome"><?= $row["nome"] ?></td>
                            <td class="atributo-item atr-mercado"><?= $row["nome_mercado"] ?></td>
                            <td class="atributo-item atr-preco">R$<?= $row["preco"] ?>,00</td>
                            <td class="atr-botao">
                                <a class="botao" href="editar-item.php?id_item=<?= $row["id_item"] ?>">
                                    <img width="50" height="50" src="https://img.icons8.com/external-flaticons-flat-flat-icons/64/external-edit-100-most-used-icons-flaticons-flat-flat-icons.png" alt="Botão de Editar Item" />
                                </a>
                            </td>
                            <td class="atr-botao">
                                <a class="botao" href="excluir-item.php?id_item=<?= $row["id_item"] ?>" onclick="if(!confirm('Tem certeza que deseja excluir?')) return false;">
                                    <img width="50" height="50" src="https://img.icons8.com/fluency/48/delete-forever.png" alt="Botão de Deletar" />
                                </a>
                            </td>
                        </tr>
                    <?php
                    }
                    ?>
                </tbody>

            </table>
        </section>


        </section>

    </div>

</main>

<?php



require 'footer-system.php';
?>