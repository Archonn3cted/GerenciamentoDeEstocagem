
## Gerenciamento de Estoque

O projeto compreende um sistema de gerenciamento de estoque. Esse sistema comtemplará, entre outras funções, o controle de entrada e saída de produtos, a possibilidade de comunicar-se com diferentes estoques cadastrados, automaticamente realizar requisições de produtos para outros estoques ou para o distribuidor com base em uma quantidade minima pré-definina para aquele produto específico do estoque e calcular o custo da logistica de distribuição dos produtos.


## Funcionalidades

### Funcionário Normal

- AddItem: Adicionar item ao estoque.
- DysplayItens: Exibe o código de todos os itens no estoque.

### Supervisor 

- Herda todos os métodos do funcionário normal.
- SearchForItem: Verifica se determinado item está no estoque através do seu código.
- GetExpirationDate: Status de todos os itens na lista em relação a sua data de validade.
- HowLongToExpire: Quantidade de dias restantes de cada produto até seu vencimento.
- RemoveExpiredItens: Remove todos os itens que estão fora do prazo de validade.

### Manager

- Herda todos os métodos do Supervisor.
- RemoveItem: Remove qualquer item do estoque.
- GetTotalValue: Calcula o valor total, em reais, de todos os itens que estão armazenados no estoque.
- ChangePrice: Muda o valor de qualquer item do estoque.
