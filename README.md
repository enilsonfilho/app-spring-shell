# Spring Shell Exemplo

Este é um projeto de exemplo utilizando Spring Shell. Ele oferece funcionalidades simples para gerenciar tarefas.

## Funcionalidades

### 1. Mensagem de Apresentação

```
$ hello
Printa no terminal uma mensagem de apresentação.
```

## 2. Adicionar Tarefa
```
$ add-task <descrição da tarefa>
Cria uma nova tarefa com a descrição fornecida.
```

## 3. Listar Tarefas
```
$ list-task
Lista todas as tarefas, mostrando o índice, o estado (concluído ou não) e a descrição.
```

## 4. Marcar Tarefa como Concluída
```
$ complete-task <índice da tarefa>
Marca uma tarefa específica como concluída.
```

## Como Usar
Certifique-se de ter o Java e o Maven instalados. Clone o repositório e execute o seguinte comando:
```
$ mvn clean package
$ java -jar target/shell-0.0.1-SNAPSHOT.jar
```

## Contribuindo
Sinta-se à vontade para abrir problemas (issues) e enviar pull requests.

## Recursos Adicionais
[Documentação do Spring Shell](https://spring.io/projects/spring-shell#overview) - Documentação oficial do Spring Shell com guias, tutoriais e exemplos.