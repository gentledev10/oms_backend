db.createUser(
  {
    user: "omsUser",
    pwd: "omsPwd",
    roles: [
       { role: "readWrite", db: "oms" }
    ]
  }
)