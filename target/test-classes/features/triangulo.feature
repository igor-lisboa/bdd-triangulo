# language: pt

Funcionalidade: Testa implementação da classe Triangulo
    
    Cenário: Testa triangulo equilatero
        Dado Que os ints escolhidos foram 3, 3 e 3
        Quando Eu verifico o triangulo
        Entao Eu confirmo que eh equilatero lendo a mensagem "O triangulo eh equilatero"

    Cenário: Testa triangulo isosceles
        Dado Que os ints escolhidos foram 5, 5 e 7
        Quando Eu verifico o triangulo
        Entao Eu confirmo que eh isosceles lendo a mensagem "O triangulo eh isosceles"

    Cenário: Testa triangulo escaleno
        Dado Que os ints escolhidos foram 5, 7 e 8
        Quando Eu verifico o triangulo
        Entao Eu confirmo que eh escaleno lendo a mensagem "O triangulo eh escaleno"

    Cenário: Testa um nao triangulo
        Dado Que os ints escolhidos foram 2, 3 e 7
        Quando Eu verifico o triangulo
        Entao Eu confirmo que nao eh triangulo lendo a mensagem "Nao eh um triangulo"