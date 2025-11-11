Sistema Universitário de Eventos

Visão Geral

Este projeto apresenta uma aplicação desenvolvida para a disciplina de Programação Orientada a Objetos. A proposta é criar a base lógica de um sistema usado por universidades para organizar e administrar diferentes tipos de eventos acadêmicos.
O foco está na construção das entidades essenciais, nas regras de negócio e na demonstração dos pilares de POO em um cenário realista.

Organização do Código

A estrutura do projeto foi planejada seguindo o padrão MVC, separando claramente cada responsabilidade.

Model

Nesta camada estão todas as classes que representam o domínio da aplicação.
Inclui categorias como:
	•	Eventos: Palestra, Minicurso e Seminario
	•	Ambientes: Sala, Auditorio e Laboratorio
	•	Pessoas: Instrutor, Organizador, Palestrante e Participante

Cada conjunto deriva de classes mais genéricas, permitindo composição, especialização e reaproveitamento.

Controller e Execução

O arquivo Programa.java funciona como ponto de partida da aplicação.
Ele cria objetos, aplica as regras estabelecidas e demonstra o comportamento final do sistema em funcionamento.

Conceitos de POO Aplicados
	•	Abstração para definir estruturas amplas que servem como molde para elementos específicos.
	•	Herança para permitir que classes especializadas ampliem características herdadas.
	•	Encapsulamento para proteger dados internos e garantir consistência.
	•	Polimorfismo para que objetos distintos possam ser tratados de forma unificada quando pertencem ao mesmo grupo conceitual.

Demonstração do Funcionamento

A aplicação realiza uma simulação que inclui criação de pessoas, locais e eventos, seguida de tentativas de inscrição.

Exemplo do fluxo mostrado:
	•	Registro de participantes
	•	Criação dos ambientes que serão usados
	•	Configuração dos eventos com suas capacidades
	•	Realização das inscrições com verificação de disponibilidade

Após a execução, o sistema exibe dados como a quantidade restante de vagas e uma listagem dos eventos nos quais cada participante está inscrito.

Resultado ilustrativo

Vagas restantes em uma palestra: 298
Vagas restantes em um minicurso: 29

Eventos associados a um mesmo participante:
	•	O Futuro da Inteligência Artificial
	•	Minicurso de Desenvolvimento Full Stack

Objetivo Educacional

O propósito da atividade é demonstrar de maneira prática como os fundamentos da orientação a objetos funcionam quando aplicados a um contexto real.
O projeto permite visualizar como entidades se relacionam, como regras são estruturadas e como o código pode ser organizado de forma clara e confiável.