from Bank import BankAccount

class User:
    def __init__(self, fname = "", lname = "", email = "", phone = "", balance = 0, interest = 0):
        self.firstname=fname
        self.lastname=lname
        self.email=email
        self.phone=phone
        self.account = BankAccount(balance, interest)
    
    def deposit(self, amount): 
        self.account.deposit(amount)
        return self
    
    def make_withdrawal(self, amount):
        self.account.withdraw(amount)
        return self
    
    def display_user_balance(self):
        print(f"User: {self.firstname} {self.lastname},Balance: ${self.account.balance}")
        return self
