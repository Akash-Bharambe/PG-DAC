const router = require("express").Router();
const createtable = require("../public/table");
const myConnection = require("../db/dbconnection");

router.get("/", (req, res) => {
  myConnection.query("select * from emp", (err, data, fields) => {
    if (err) res.status(404).send("No data Found");
    else {
      res.status(202).render("index", { data1: createtable(data) });
    }
  });
});

router.post("/submit_form", (req, res) => {
  const [empno, ename, job, mgr, hiredate, sal, comm, deptno] = [req.body];
  myConnection.query(
    "insert into table emp values(?,?,?,?,?,?,?,?)",
    [empno, ename, job, mgr, hiredate, sal, comm, deptno],
    (err) => {
      err
        ? res.status(404).send("Cannot add Data")
        : res.status(202).send("Added Successfully");

      console.log(fields);
    }
  );
});

module.exports = router;
