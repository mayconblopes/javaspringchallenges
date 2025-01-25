# Java Spring Challenges
Repository for Solving Java Spring Challenges

# Desafio 1: Componentes e injeção de dependência
Criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

![image](https://github.com/user-attachments/assets/710a3134-a889-46ad-b1b4-a5c299e878e2)


## Sua solução deverá seguir as seguintes especificações:
Um pedido deve ser representado por um objeto conforme projeto abaixo:

![image](https://github.com/user-attachments/assets/1576b733-5e1f-402e-92d3-c2e41e235e88)


A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade, conforme projeto abaixo:

![image](https://github.com/user-attachments/assets/d7f04e05-c431-4cc9-a576-7b072e627177)


Serviço OrderService: responsável por operações referentes a pedidos.
Serviço ShippingService: responsável por operações referentes a frete.
Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com @Service.

