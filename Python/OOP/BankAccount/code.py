from BankAccount import BankAccount

Naeem = BankAccount("Naeem", "Abueideh", "n.a@gmail.com", "0599900900", 1000, 0.02)
Amin = BankAccount("Amin", "Abueideh", "a.a@gmail.com", "0569900900", 4000, 0.02)

# for first account:
print("------------First account-------------")
Naeem.deposit(1000).deposit(400).deposit(300).withdraw(1300).yield_interest().display_account_info()

# for the second account
print("------------Second account-------------")
Amin.deposit(1200).deposit(1000).withdraw(200).withdraw(100).withdraw(300).withdraw(350).yield_interest().display_account_info()