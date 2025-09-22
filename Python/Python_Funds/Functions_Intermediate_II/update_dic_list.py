x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

#========================

x[1][0] = 15
print(f"new value of x is: {x}")

students[0]['last_name'] = "Bryant"
print(f"new students value is {students}")

sports_directory['soccer'][0] = "Andres"
print(f"the sports_directory new value is: {sports_directory}")

z[0]['y'] = 30
print(f"the z new value is {z}")