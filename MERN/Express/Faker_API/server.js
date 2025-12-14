const { faker } = require("@faker-js/faker");
const express = require("express");
const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

function createRandomUser() {
  return {
    _id: faker.string.uuid(),
    firstName: faker.person.firstName(),
    lastName: faker.person.lastName(),
    phone: faker.phone.number(),
    email: faker.internet.email(),
    password: faker.internet.password(),
  };
}

function createRandomCompany() {
  return {
    _id: faker.string.uuid(),
    name: faker.company.name(),
    address: {
      street: faker.location.streetAddress(),
      city: faker.location.city(),
      state: faker.location.state(),
      zipCode: faker.location.zipCode(),
      country: faker.location.country(),
    },
  };
}

const users = [];
const companies = [];

app.post("/api/users/new", (req, res) => {
  const newUser = createRandomUser();
  users.push(newUser);
  res.json(newUser);
});

app.post("/api/companies/new", (req, res) => {
  const newCompany = createRandomCompany();
  companies.push(newCompany);
  res.json(newCompany);
});

app.get("/api/user/company", (req, res) => {
  res.json({ users, companies });
});

app.listen(port, () => console.log(`port is: ${port}`));
