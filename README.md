# Pipa Challenge
---
[![Kotlin](https://img.shields.io/badge/Kotlin-1.3.72-blue.svg)](https://kotlinlang.org)
[![Android](https://img.shields.io/badge/Android-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23)

#### Inicial
O projeto foi criado pensando exclusivamente no funcionamento da inserção e build do módulo de mensagens.
Nenhuma arquitetura foi aplicada no módulo "application", portanto o mesmo está cru com apenas uma activity.

##### Módulo Messenger
Biblioteca Android responsável por toda a lógica de comunicação com as principais plataformas solicitadas: WhatsApp, Telegram, Facebook Messenger e Skype.
Alguns padrões de projeto foram aplicados para melhor definir a utilização da lib por terceiros.

##### Automação da build utilizando Python
Dentro da pasta Python existe um projeto com vários arquivos que são responsáveis pela automação da build.
Existe um arquivo de configuração chamado `project-config.json` dentro do pacote **config** que possui alguns caminhos e configurações essenciais para o funcionamento do programa.
Para executar a automação da build basta:
1. Atualizar todos os parâmetros dentro do `project-config.json` de acordo com as configurações da sua máquina como: local onde está o SDK do Android e etc
2. Executar via terminal o comando `python3.7 main.py`. Existe a possibilidade de rodar o projeto via PyCharm também.