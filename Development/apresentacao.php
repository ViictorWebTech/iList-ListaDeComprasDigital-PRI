<?php


session_start();
require 'logica-autenticacao.php';

require('head-apresentacao.php');

require('header-apresentacao.php');

?>

<main class="main">
    <section class="apresentacao" id="visao-geral">
        <section class="topicos" id="oque">
            <h2>O que é?</h2>
            <p class="contexto"><b><strong>iList</strong>, a adaptação de suas listas de compras de papéis para os seus dispositivos</b>. Está aqui seu app incrível de listas de compras, feito sob medida para vencer as memórias confusas que a <a href="https://www.who.int/health-topics/coronavirus" target="_blank" title="Coronavirus disease">COVID-19</a> deixou. É como um upgrade moderno das clássicas listas de compras.</p>
            <hr>
        </section>
        <section class="topicos" id="porque">
            <h2>Por quê?</h2>
            <p class="contexto"><b>Desenvolvido para facilitar seu dia a dia.</b> Entretanto, algo nos levou a desenvolvê-lo: após o ocorrido global, a pandemia da COVID-19, essa ferramenta se torna mais que uma opção, <strong>se torna necessária</strong>. Já que, além dos casos fatais, a infecção da doença curiosamente também deixou inúmeras vítimas com sequelas na memorização. <b>É aí que nós entramos:</b> Nosso app único transforma as compras em uma alegria, aliviando a tensão e trazendo normalidade ao caos.</p>
            <hr>
        </section>
        <section class="topicos" id="paraquem">
            <h2>Para quem?</h2>
            <p class="contexto"><b>Para todos que desejam se organizar.</b> Entretanto, a ferramenta é essencial para os que lutam para lembrar das pequenas coisas. Se você ou alguém que você conhece está enfrentando os estragos da memória pós-COVID, nosso app é a resposta. Recupere sua independência e domine suas compras de uma vez por todas. A adaptação das listas de papel para o celular é a inovação que você precisa.</p>
            <hr>
        </section>
        <section class="topicos" id="pandemia">
            <h2>A Pandemia</h2>
            <p class="contexto">A batalha contra a COVID-19 não termina com a recuperação. Nosso app é o aliado perfeito para todos que lidam com dificuldades de memória pós-COVID. <strong>É mais que uma solução, é uma mão amiga no caos.</strong> A evolução das listas de compras para um mundo novo.</p>
        </section>

    </section>
    <hr>
    <section class="entre" id="entre">
        <h1>Venha fazer parte dessa experiência!</h1>
        <section class="left">
            <img class="casal-org" src="assets/img/icons/organizacao.svg" alt="Casal se organizando">
        </section>
        <section class="right">
            <p class="cadastro">Clique no link abaixo para começar:</p>
            <section class="link-entrar">
                <a href="login.php" class="link-cadastro">iList: É mais que uma solução, é uma mão amiga no caos.</a>
            </section>
        </section>
    </section>
    <hr>
    <section class="recursos" id="recursos">
        <section class="topicos">
            <h1>Recursos Principais:</h1>
        </section>
        <ol>
            <section class="topicos">
                <li>
                    <h2>Conta de Usuário Personalizada:</h2>
                </li>
                <p>Cada usuário obtém uma conta individual com login e senha exclusivos. Isso garante privacidade e segurança enquanto você gerencia suas listas de compras de maneira personalizada.</p>
                <hr>
            </section>
            <section class="topicos">
                <li>
                    <h2>Controle Total sobre suas Listas:</h2>
                </li>
                <p>Adicione, edite e remova itens da sua lista de compras de forma simples e rápida. Nosso aplicativo foi projetado para se ajustar às suas necessidades e preferências em tempo real.</p>
                <hr>
            </section>
            <section class="topicos">
                <li>
                    <h2>Acesso Simplificado a qualquer Hora:</h2>
                </li>
                <p>Acesse suas listas de compras a qualquer momento e em qualquer lugar. Com a sua conta pessoal, todas as suas informações estarão prontas para você, seja em casa ou em movimento. <i><b>(Necessário o consumo de <span title="Internet">dados móveis</span>).</b></i></p>
                <hr>
            </section>
            <section class="topicos">
                <li>
                    <h2>Backup e Sincronização Seguros:</h2>
                </li>
                <p>Suas listas são valiosas. Com nossa funcionalidade de sincronização, suas informações ficam protegidas e disponíveis em todos os seus dispositivos.</p>
                <hr>
            </section>
            <section class="topicos">
                <li>
                    <h2>Intuitivo e Fácil de Usar:</h2>
                </li>
                <p>Não importa a sua experiência com tecnologia, nosso aplicativo foi projetado com uma interface amigável. Comece a usar com confiança e descubra como é simples organizar suas compras.</p>
            </section>
        </ol>
    </section>
    <hr>
    <section class="faq" id="faq">
        <section class="topicos">
            <h1>FAQ:</h1>
        </section>
        <ol>
            <section class="topicos">
                <li>
                    <h2>Como faço para começar?</h2>
                </li>
                <p><b>É simples!</b> Clique no link abaixo para criar sua conta de usuário e começar a usar o aplicativo:</p>
                <section class="link-entrar">
                    <a href="login.php" class="link-cadastro">iList: É mais que uma solução, é uma mão amiga no caos.</a>
                </section>
            </section>
            <hr>
            <section class="topicos">
                <li id="how-to-add">
                    <h2>Como faço o download do aplicativo?</h2>
                </li>
                <p>Você não precisa, utilize direto do seu navegador. Se deseja um atalho como um aplicativo, siga <a href="how-to-add.php" target="_self">essas etapas</a> e adicione o site a tela inicial.</p>
            </section>
            <hr>
            <section class="topicos">
                <li>
                    <h2>Posso personalizar minhas listas de compras?</h2>
                </li>
                <p>Claro! Você pode adicionar, editar e remover seus itens quando e de onde quiser. Você pode também adicionar sua foto de perfil no processo de criação da conta para deixar no topo de seu aplicativo (ao lado da logomarca).</p>
                <img class="ftperfil" src="assets/img/icons/faq/fotoperfil.png" alt="Onde ficará sua foto de perfil">
            </section>
            <hr>
            <section class="topicos">
                <li>
                    <h2>Como faço para adicionar ou remover itens da minha lista?</h2>
                </li>
                <p>Dentro do sistema estará disponível um botão central em uma barra localizada no inferior da sua tela com um símbolo (+) para adicionar itens. Na tela principal também estará disponível, ao lado do nome dos itens, símbolos de Editar(✏️) e Excluir(🗑️) itens.</p>
            </section>
            <hr>
            <section class="topicos">
                <li>
                    <h2>O que devo fazer se esquecer minha senha?</h2>
                </li>
                <p>Entre em contato imediatamente pelo <a href="mailto:vwebtech777@gmail.com">email</a> descrevendo o ocorrido e aguarde respostas de como prosseguir com novo acesso.</p>
            </section>
            <hr>
            <section class="topicos">
                <li>
                    <h2>Como funciona a sincronização entre dispositivos?</h2>
                </li>
                <p>Quando você cria sua conta, você cria também um perfil no nosso banco de dados (todos os itens que você adiciona ao sistema é automaticamente guardado no banco), então de qualquer dispositivo que você tenha acesso a mesma conta, estará conectado ao mesmo perfil, assim, tendo acesso a todos os itens que foram registrados anteriormente</p>
            </section>
            <hr>
            <section class="topicos">
                <li>
                    <h2>Como posso entrar em contato com o suporte em caso de problemas?</h2>
                </li>
                <p>Em casos de ajuda, entre em contato pelo <a href="mailto:vwebtech777@gmail.com">email</a> descrevendo o ocorrido e aguarde respostas.</p>
            </section>
        </ol>
    </section>
    <hr>


</main>


<?php

require('footer-system.php');

?>