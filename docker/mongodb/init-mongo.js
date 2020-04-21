db.createUser(
  {
    user: "orderUser",
    pwd: "orderPwd",
    roles: [
       { role: "readWrite", db: "order" }
    ]
  }
)