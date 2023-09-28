function verifica_senhas() {
  var senha = document.getElementById("senha");
  var confsenha = document.getElementById("confsenha");

  if (senha.value && confsenha.value) {
    if (senha.value != confsenha.value) {
      senha.classList.add("is-invalid");
      confsenha.classList.add("is-invalid");
      confsenha.value = null;
    } else {
      senha.classList.remove("is-invalid");
      confsenha.classList.remove("is-invalid");
    }
  }
}
