class BankAccount:
    def __init__(self, fname = "", lname = "", email = "", phone = "", balance = 0, interest = 0):
        self.firstname = fname
        self.lastname = lname
        self.email = email
        self.phone = phone
        self.balance = balance
        self.interest = interest
    
    def deposit(self, amount):
        self.balance += amount
        return self
    
    def withdraw(self, amount):
        if(amount > self.balance):
            print("no enough money")
        else:
            self.balance -= amount
        return self
    
    def display_account_info(self):
        print(f"User: {self.firstname} {self.lastname}, Balance: {self.balance}")
        return self
    
    def yield_interest(self):
        self.balance += self.balance * self.interest
        return self