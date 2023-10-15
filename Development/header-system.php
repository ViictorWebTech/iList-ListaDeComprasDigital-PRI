<header>
    <nav class="navbar">
        <section class="menu-left">

            <ul class="nav-menu">
                <?= $links_menu ?>
            </ul>
            <div class="hamburger">
                <span class="bar"></span>
                <span class="bar"></span>
                <span class="bar"></span>
            </div>
        </section>

        <section class="logout">
            <a href="logout.php">
                <img src="https://img.icons8.com/external-tal-revivo-green-tal-revivo/60/external-left-exit-direction-as-digital-backward-navigation-login-green-tal-revivo.png" alt="Icone de logout">
            </a>
        </section>

    </nav>

    <section class="title-app">
        <section class="name"><a href="?" class="nav-branding">iList</a></section>
        <section class="icon-user">
            <a href="?" class="nav-branding">
                <?php
                if (!autenticado()) {
                ?>
                    <img class="avatar-circle" src="assets/img/icons/organizacao.svg" alt="Ícone do aplicativo" width="40" height="40">
                <?php
                } else {
                if(!urlfoto_usuario()){
                    ?>
                    <img class="avatar-circle" src="https://img.icons8.com/ios-filled/50/user-male-circle.png" alt="Avatar de perfil de <?= nome_usuario(); ?>" width="40" height="40"/>
                    <?php
                } else{
                ?>
                    <img class="avatar-circle" src="<?= urlfoto_usuario(); ?>" alt="Avatar de perfil de <?= nome_usuario(); ?>" width="40" height="40">
                <?php
                }
                }
                ?>
            </a>
        </section>
    </section>
</header>