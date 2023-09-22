<?php


$links_menu = '<li class="nav-item"><a class="nav-link" href="home.php">Tela Inicial</a></li>';
require 'head-system.php';
require 'header-system.php';

?>


<main class="main main-add">
<form action="" method="post">


                <div class="form-add-item">
                    <h1>Adicionar Item</h1>
                    <div class="textfield">
                        <label for="user">Nome</label>
                        <input type="text" id="nome" name="nome" placeholder="Nome do Item" required>
                    </div>
                    <div class="textfield"> 
                        <label for="urlfoto">Você pode adicionar a URL de uma Foto ou Imagem do produto</label>
                        <input type="url" id="urlfoto" name="urlfoto" placeholder="URL da imagem">
                    </div>
                    
                    <button class="btn-add btn-form" type="submit">Adicionar</button>
                    <button class="btn-cancel btn-form" type="reset">Cancelar</button>

                </div>

            </section>
        </form>
</main>

<?php

require 'footer-system.php'

?>