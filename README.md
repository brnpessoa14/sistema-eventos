# Sistema Acadêmico de Gestão de Eventos  

## 🧠 Descrição  

Aplicação desenvolvida como parte da Avaliação Continuada da disciplina **Programação Orientada a Objetos (POO)**.  
O sistema representa o **back-end de um gerenciador de eventos universitários**, como palestras, minicursos e seminários.  
O objetivo é demonstrar o uso de conceitos fundamentais de POO por meio da modelagem de um domínio realista, envolvendo pessoas, locais e eventos.

---

## 🧩 Estrutura do Projeto (MVC)

O projeto segue a arquitetura **MVC (Model-View-Controller)**, separando as responsabilidades entre dados, controle e interface:

* **`/src/model`**  
  Contém as classes que formam a base do sistema e a lógica de negócio.  
  - **Eventos:** `Evento` (abstrata) → `Palestra`, `Minicurso`, `Seminario`  
  - **Locais:** `Local` (abstrata) → `Sala`, `Auditorio`, `Laboratorio`  
  - **Pessoas:** `PessoaResponsavel` (abstrata) → `Instrutor`, `Organizador`  
  - **Outras Entidades:** `Participante`, `Palestrante`


* **`/src`** 
Inclui a classe `Programa.java`, que cria os objetos e demonstra o funcionamento completo do sistema.



---

## 🧱 Conceitos de POO Utilizados  

O projeto aplica de forma prática os pilares da orientação a objetos:

* **Abstração:** Uso de classes abstratas para definir estruturas genéricas que servem de base para especializações.  
* **Herança:** Classes filhas aproveitam e expandem comportamentos das classes-mãe. Exemplo: `Palestra` herda de `Evento`.  
* **Encapsulamento:** Atributos privados e protegidos, acessados apenas via métodos públicos (`get` e `set`), garantindo integridade dos dados.  
* **Polimorfismo:** Um mesmo tipo genérico pode assumir formas diferentes em tempo de execução (ex: `Local` pode ser `Sala`, `Auditorio` ou `Laboratorio`).  

---

## 🖥️ Exemplo de Execução  

```plaintext
Pessoas e Participantes criados.
Locais criados.
Eventos criados.

 Testando Inscrições (Regras de Negócio)
Tentando inscrever Ted Mosby na palestra 'O Futuro da Inteligência Artificial'...
-> Inscrição realizada com sucesso!
Tentando inscrever Darth Vader na palestra 'O Futuro da Inteligência Artificial'...
-> Inscrição realizada com sucesso!
Tentando inscrever Ted Mosby no 'Minicurso de Desenvolvimento Full-Stack'...
-> Inscrição realizada com sucesso!

RESULTADO FINAL
Vagas restantes na Palestra: 298
Vagas restantes no Minicurso: 29

Eventos que o Ted Mosby está inscrito:
  - O Futuro da Inteligência Artificial
  - Minicurso de Desenvolvimento Full-Stack
