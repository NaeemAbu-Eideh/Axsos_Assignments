from User import User

naeem = User("naeem", "abueideh", "n.a@gmail.com", "050505050", 2000, 0.03)

naeem.deposit(300)
naeem.display_user_balance()
naeem.make_withdrawal(100)
naeem.display_user_balance()