const { faker } = require('@faker-js/faker');

const express = require("express");
const app = express();
const port = 8000;

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );

function createRandomUser() {
  return {
    
    _Id: faker.string.uuid(),
    firstName: faker.person.firstName(),
    lastname: faker.person.lastname(),
    phone: faker.phone.imei(),
    email: faker.internet.email(),
    password: faker.internet.password(),
  };
}

function createRandomCompany() {
  return {
    
    _Id: faker.string.uuid(),
    name: faker.company.name(),
    address:{
      street: faker.location.street(),
      city: faker.location.city(),
      state: faker.location.state(),
      zipCode: faker.location.zipCode(),
      country: faker.location.country(),
    }
  };
}

users = {};
companies = {}

app.post("/api/users/new", (req, res) => {
    users.push(createRandomUser());
    res.json( { status: "ok" } );
});

app.post("/api/companies/new", (req, res) => {
    companies.push(createRandomCompany());
    res.json( { status: "ok" } );
});

app.get("/api/user/company", (req, res) => {
    res.json( users );
    res.json( companies );
});

app.listen(port, () => console.log(`port is: ${port}`))
