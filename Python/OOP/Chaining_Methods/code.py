from User import User

Naeem = User("Naeem", "Abueideh", "n.a@gmail.com", "0599900900", 1000)
Azez = User("Azez", "Esa", "a.e@gmail.com", "0599900901", 3000)
khaled = User("khaled", "Aldek", "k.a@gmail.com", "0599900902", 8000)

#1 for first user:
print("#---------First user--------")
Naeem.diposite(300).diposite(400).diposite(500).make_withdrawal(1000).display_user_balance()

#2 for second user:
print("#---------Second user--------")
Azez.diposite(200).diposite(600).make_withdrawal(100).make_withdrawal(400).display_user_balance()

#3 for third user:
print("#---------Third user--------")
khaled.diposite(1000).make_withdrawal(500).make_withdrawal(600).make_withdrawal(700).display_user_balance()
# bonus:
print("#---------Bonus--------")
Naeem.transfar_money(khaled, 400).display_user_balance()
khaled.display_user_balance()
