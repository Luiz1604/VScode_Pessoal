print("-- Caixa Eletrônico --")
saldo = 1000.00
tentativas = 2
conta = False
hist = []

senha = input("\nDigite sua senha para acessar sua conta (você tem 3 tentativas): ")

if senha == "1234":
    conta = True
else:
    for i in range (tentativas):
        senha = input("Senha incorreta! Tente novamente: ")
        
        if senha == "1234":
            conta = True
            break

if conta == False:
    print("Você errou muitas vezes, Bloqueando entrada...")
else:
    print("\nBem Vindo!")

def depositar(saldo, hist):
    dep = float(input("\nDigite o valor que você deseja depositar: "))

    while dep < 0:
        dep = float(input("Valor inválido, redigite: "))

    saldo += dep
    hist.append(dep) #append adiciona um item a lista
    return saldo

def sacar(saldo, hist):
    sac = float(input("\nDigite o valor que voce deseja sacar: "))

    while True:
        if sac < 0:
            sac = float(input("Valor inválido, redigite: "))
        elif sac > saldo:
            sac = float(input("Saldo insufuciente, redigite: "))
        else:
            break

    saldo -= sac
    hist.append(-sac) #append adiciona um item a lista
    return saldo

while conta: #Vem como True aoutomáticamente
    opcao = input ("\nDigite a opção: \n1 - Ver saldo  \n2 - Depositar  \n3 - Sacar  \n4 - Histórico  \n5 - Sair: ")
    match opcao:
        case "1":
            print(f"\nSeu saldo é de R$ {saldo:.2f}") #Lembrar de colocar o f

        case "2":
            saldo = depositar(saldo, hist)

        case "3":
            saldo = sacar(saldo, hist)

        case "4":
            print("\n-- Histórico de ações --")
            for i, valor in enumerate(hist): # i peaga o indice + 1, e o ennumerate pega os valores de cada indice
                print(f"\n{i+1} - {valor}")

        case "5":
            print("\nObrigado por utilizar nosso caixa eletrônico!")
            print("Desligando...")
            break #Para o while

        case _:
            print("\nOpção inválida, Tente novamente!")