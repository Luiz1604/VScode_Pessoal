print("-- Caixa Eletrônico --")
saldo = 1000.00
loop = 0

while True:
    opcao = input ("\nDigite a opção: \n1 - Ver saldo  \n2 - Depositar  \n3 - Sacar  \n4 - Sair: ")
    match opcao:
        case "1":
            print(f"\nSeu saldo é de R$ {saldo:.2f}") #Lembrar de colocar o f
        case "2":
            dep = float(input("\nDigite o valor que você deseja depositar: "))

            while dep < 0:
                dep = float(input("Valor inválido, redigite: "))

            saldo += dep
        case "3":
            sac = float(input("\nDigite o valor que voce deseja sacar: "))

            while sac < 0:
                sac = float(input("Valor inválido, redigite: "))

            while sac > saldo or sac < 0:
                if sac > saldo:
                    sac = float(input("Saldo indufuciente, redigite: "))
                if sac < 0:
                    sac = float(input("Valor inválido, redigite: "))

            saldo -= sac
        case "4":
            print("\nObrigado por utilizar nosso caixa eletrônico!")
            print("Desligando...")

            break #Para o while
        case _:
            print("\nOpção inválida, Tente novamente!")