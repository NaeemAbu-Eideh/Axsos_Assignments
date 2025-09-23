class User:
    def __init__(self, fname = "", lname = "", email = "", phone = "", balance = 0):
        self.firstname=fname
        self.lastname=lname
        self.email=email
        self.phone=phone
        self.balance=balance
    
    def diposite(self, amount):
        self.balance += amount
        return self
    
    def make_withdrawal(self, amount):
        self.balance -= amount
        return self
    
    def display_user_balance(self):
        print(f"User: {self.firstname} {self.lastname}, balance: ${self.balance}")
        return self
    
    def transfar_money(self, other_user, amount):
        self.make_withdrawal(amount)
        other_user.balance += amount
        return self