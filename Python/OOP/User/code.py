from User import User

Naeem = User("Naeem", "Abueideh", "n.a@gmail.com", "0599900900", 1000)
Azez = User("Azez", "Esa", "a.e@gmail.com", "0599900901", 3000)
khaled = User("khaled", "Aldek", "k.a@gmail.com", "0599900902", 8000)

#1 for first user:
print("#---------First user--------")
Naeem.diposite(300)
Naeem.diposite(400)
Naeem.diposite(500)
Naeem.make_withdrawal(1000)
Naeem.display_user_balance()

#2 for second user:
print("#---------Second user--------")
Azez.diposite(200)
Azez.diposite(600)
Azez.make_withdrawal(100)
Azez.make_withdrawal(400)
Azez.display_user_balance()

#3 for third user:
print("#---------Third user--------")
khaled.diposite(1000)
khaled.make_withdrawal(500)
khaled.make_withdrawal(600)
khaled.make_withdrawal(700)
khaled.display_user_balance()

# bonus:
print("#---------Bonus--------")
Naeem.transfar_money(khaled, 400)
Naeem.display_user_balance()
khaled.display_user_balance()
