# App de Classificação por Estrelas

Este é um aplicativo Android desenvolvido em Java que permite ao usuário avaliar um jogo utilizando um sistema de classificação por estrelas (RatingBar). Após a avaliação, o aplicativo exibe o resultado correspondente em uma nova tela.

## 🛠️ Tecnologias Utilizadas

*   **Linguagem:** Java 11
*   **Plataforma:** Android (Min SDK: 23, Target SDK: 34)
*   **Interface de Usuário (UI):** XML (ConstraintLayout, RatingBar, TextView, Button)
*   **Build System:** Gradle (Kotlin DSL)

## 🗂️ Estrutura do Projeto

O projeto possui a seguinte estrutura de arquivos principais:

*   **`MainActivity.java`**: É a tela inicial do aplicativo. Contém a imagem do jogo sendo avaliado, um componente `RatingBar` interativo para o usuário selecionar a quantidade de estrelas (de 1 a 5) e um botão para confirmar a votação.
    *   **Lógica de Classificação:**
        *   ⭐ (1 Estrela): **Regular**
        *   ⭐⭐ (2 Estrelas): **Bom**
        *   ⭐⭐⭐ (3 Estrelas): **Ótimo**
        *   ⭐⭐⭐⭐ (4 Estrelas): **Excelente**
        *   ⭐⭐⭐⭐⭐ (5 Estrelas): **Espetacular**
*   **`ResultadoActivity.java`**: Tela secundária que recebe a classificação selecionada da `MainActivity` via `Intent` e exibe o resultado final da avaliação para o usuário.

## 📱 Telas de Exemplo (Classificação por Estrelas)

Abaixo estão exemplos do fluxo e da classificação baseada em estrelas dentro do aplicativo:

<div align="center">
  <img src="app/src/main/res/drawable/jogo_anfry_birds.png" width="150" alt="Imagem do Jogo Avaliado">
</div>

### 1. Tela Principal (Votação)
Na `MainActivity`, o usuário utiliza o componente `RatingBar` para atribuir uma nota de 1 a 5 estrelas. Ao clicar no botão "OK", a nota é processada.

*(Exemplo visual de marcação de estrelas no aplicativo)*
- [⭐] [ ] [ ] [ ] [ ] -> Regular
- [⭐] [⭐] [⭐] [ ] [ ] -> Ótimo
- [⭐] [⭐] [⭐] [⭐] [⭐] -> Espetacular

*(Substitua este espaço por uma screenshot da `MainActivity` do seu emulador)*

### 2. Tela de Resultado (`ResultadoActivity`)
Após confirmar a votação, o aplicativo navega para esta tela exibindo o texto de acordo com as estrelas escolhidas.

Exemplo de exibição na tela:
> **"Classificação: Excelente"** (Caso o usuário tenha selecionado 4 estrelas)

*(Substitua este espaço por uma screenshot da `ResultadoActivity` do seu emulador)*

## ▶️ Como Executar

1. Clone este repositório para a sua máquina local.
2. Abra a pasta do projeto utilizando o **Android Studio**.
3. Aguarde o Gradle sincronizar as dependências do projeto.
4. Clique em **Run** (Shift + F10) para executar o aplicativo em um emulador Android ou dispositivo físico conectado (Android 6.0 / API 23 ou superior).
