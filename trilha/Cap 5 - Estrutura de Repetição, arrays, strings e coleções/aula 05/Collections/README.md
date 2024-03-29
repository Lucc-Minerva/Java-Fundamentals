# Coleções Frameworks (Collections)

Collections são estruturas de dados utilizadas para armazenar e organizar objetos de maneira eficiente e prática. Podem ser utilizadas para representar estruturas como vetores, listas, pilhas, filas, mapas, conjuntos e outras estruturas de dados.

No java, as coleções podem ser classificadas em duas categorias: as que implementam a interface ``Collection`` e as que implementam a interface ``Map``.

As principais subinterfaces de Collection são:

- **List**: representa uma lista de objetos, a implementação mais utilizada é o ArrayList.
- **Set**: representa um conjunto de objetos únicos, e os objetos não se repetem, a implementação mais utilizada é o HashSet.

### Map

A **interface** ``Map`` representa uma tabela hash, que armazena valores compostos por [chave, valor]. Ou seja, para cada valor armazenado nesse mapa podemos definir uma chave para facilitar a recuperação do valor. A principal **subinterface** é:

- **SortedMap**: representa um mapa ordenado, a implementação mais utilizada é o ``HashMap``.

### Collection

A interface ``collection`` que é base de todas as coleções, exceto ``maps``, define um conjunto de métodos que são comuns a todas outras estruturas que estão abaixo dela: ``list``, ``set`` e ``queue``.

Os principais métodos da interface Collection:

| método | descrição |
| ------ | --------- |
| **add** | adiciona um objeto à coleção |
| **clear** | remove um objeto da coleção |
| **contains** | verifica se a coleção contém o objeto determinado |
| **isEmpty** | verifica se a coleção está vazia |
| **remove** | remove um objeto da coleção |
| **size** | retorna a quantidade de objetos da coleção |
| **toArray** | retorna um array contendo os elementos da coleção |

### List

A interface ``List`` representa uma sequência de elementos ordenados e podem conter elementos repetidos. Dessa forma, os elementos de uma lista estão dispostos pela ordem de inserção. 

Principais métodos de uma lista:

| método | descrição |
| ------ | --------- |
| **Add** | adiciona um objeto numa determinada posição |
| **get** | retorna o objeto localizado numa determinada posição |
| **Remove** | remove um objeto localizado numa determinada posição |
| **set** | coloca um objeto numa determinada posição(tambem substitui objetos) |
| **indexOf** | retorna a posição de um objeto da lista |
| **lastIndexOf** | retorna a última posição de um objeto na lista |
| **subList** | retorna parte de uma lista |

- **ArrayList** armazena seus elementos em um array interno para gerar
uma lista. Essa lista cresce ou diminui dinamicamente no momento que um
elemento é inserido ou excluido da lista.

*``ArrayList`` é uma implementação da interface List da API de Collections do Java, essa classe somente utiliza um array (também já visto neste capítulo) para armazenar os valores, porém, não podemos acessar diretamente esse array, pois é um atributo encapsulado*

Para criar uma ArrayList, basta chamar seu construtor:

    ArrayList lista = new ArrayList();
    lista.add("carro");
    lista.add("moto");
    lista.add("caminhao");

### Set

A interface ``Set`` define uma coleção que não pode conter valores duplicados. Corresponde à abstração de um conjunto que funciona de forma análoga aos conjuntos da matemática. Outro ponto importante, é que nem sempre a ordem de inserção dos elementos será a dos elementos dispostos na coleção, isso pode variar de implementação para implementação. A interface contém somente os métodos herdados da interface ``Collection``:

| método | descrição |
| ------ | --------- |
| **add** | adiciona um objeto no Set |
| **clear** | remove todos os objeto no Set |
| **contains** | verifica se o Set possui um objeto determinado |
| **isEmpty** | verifica o Set está vazio |
| **remove** | remove um objeto do Set |
| **size** | retorna a quantidade de objetos no Set |
| **toArray** | retorna um array contendo os objetos do Set |

-  **HashSet** armazena seus elementos em uma tabela hash. 

Exemplo:

    HashSet cursos = new HashSet<>();

    cursos.add("Java");
    cursos.add("Angular");
    cursos.add("React");

    cursos.add("Java"); // testando que nao entra um elemento duplicado

    // Imprime todos os elementos
    System.out.println(cursos);

Resultado: ``[Java, Angular, React]``

### Map

Um mapa é composto por um par de **chave** e **valor**. As chaves não podem conter valores iguais, porém o valor sim. A principal implementação de ``Map`` é a classe ``HashMap``.

Principais definições da interface ``Map`` são:

| método | descrição |
| ------ | --------- |
| **clear** | remove todos os objetos mapeados |
| **containsKey** | verifica se uma chave já está presente no mapeamento |
| **containsValue** | verifica se um valor já está presente no mapeamento |
| **get** | retorna um valor associado à uma chave determinada |
| **isEmpty** | verifica se o mapeamento está vazio |
| **keySet** | retorna um set contendo as chaves |
| **put** | adiciona um mapeamento |
| **remove** | remove um mapeamento |
| **size** | retorna o número de mapeamentos |
| **values** | retorna uma coleção com todos os valores mapeados neste Map |

Exemplo do método ``put``:

    HashMap mapa = new HashMap();

    mapa.put("RM1234", "Thiago");
    mapa.put("RM4321", "João");

    System.out.println(mapa);

Retornando: ``{RM4321=João, RM1234=Thiago}``

Exemplificando o método ``get``:

    System.out.println(mapa.get("RM1234"));

Exemplo do método ``remove``:

    HashMap mapa = new HashMap();

    mapa.put("RM1234", "Thiago");
    mapa.put("RM4321", "João");

    mapa.remove("RM1234"); // remove um elemento

    System.out.println(mapa.get("RM1234"));

### Generics

Podemos utilizar o recurso de **Generics** para restringir os tipos de dados aceitos por referência genérica. Dessa forma, somente o tipo determinado no **Generic** será permitido inserir na lista, e não qualquer objeto.

O **Generic** permite a verificação do tipo em tempo de compilação e deixa o código mais limpo, pois não é necessário realizar um cast.

Sintaxe:

    ArrayList<Tipo> lista = new ArrayList<Tipo>();

*Ao lado do ArrayList temos um **< >** e dentro dele, determinamos o tipo que a lista poderá armazenar.*

Exemplo:

    ArrayList<String> carrinho = new ArrayList<String>();

*Essa ArrayList poderá armazenar somente objetos do tipo **string**.*