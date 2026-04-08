Arquitetura de Cidade Modular (UML e Java)

Este repositório contém a modelagem em UML e a implementação em código Java de um sistema baseado em componentes, desenvolvido para a disciplina de Engenharia de Software.

O Conceito (Analogia com Lego)
O projeto foi construído utilizando uma forte analogia entre a montagem de blocos de montar (Lego) e o desenvolvimento de software focado em Reusabilidade e Baixo Acoplamento:

Peça = Classe: A unidade básica (ex: Hospital, Escola, Estrada).

Bloco = Módulo: O agrupamento lógico dessas peças.

Conjunto = Sistema: O programa principal que gerencia e une todos os módulos (SistemaCidade).

Encaixe = Interface: O padrão que garante que qualquer nova peça consiga se conectar ao sistema (IModulo).

Estrutura do Repositório

O projeto está dividido em duas partes principais:

Modelagem UML (Pasta /Diagramas)
Desenvolvidos no Astah UML, os diagramas traduzem a regra de negócio e a estrutura do sistema:

Diagrama de Pacotes: Mostra a separação lógica e organizacional do sistema.

Diagrama de Componentes: Ilustra as dependências físicas entre os módulos da cidade (ex: a dependência de acesso da Escola e do Hospital com a Estrada).

Diagrama de Classes: Define a estrutura Orientada a Objetos, com as classes realizando a interface IModulo e a associação com a classe principal.

Diagrama de Sequência: Demonstra a linha do tempo e a interação do sistema instanciando e conectando os módulos.

Implementação Orientada a Objetos (Pasta /Codigo)
Código escrito em Java aplicando os princípios mapeados na UML. A classe principal SistemaCidade utiliza uma lista de interfaces para iniciar a infraestrutura, provando o conceito de polimorfismo e reusabilidade. Se um novo módulo for criado (ex: Aeroporto), o sistema central não precisa ser modificado.

Como executar o projeto

Clone este repositório.

Abra a pasta /Codigo em sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).

Execute o método main localizado na classe SistemaCidade.java.

Desenvolvido por Eduardo Fernandes.
