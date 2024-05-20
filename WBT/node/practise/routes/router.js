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
  console.log(req.body);
  myConnection.query(
    "insert into emp values(?,?,?,?,?,?,?,?);",
    [
      parseInt(req.body.empno),
      req.body.ename,
      req.body.job,
      parseInt(req.body.mgr),
      req.body.hiredate,
      parseInt(req.body.sal),
      parseInt(req.body.comm),
      parseInt(req.body.deptno),
    ],
    (err, result) => {
      if (err) {
        res.status(500).send("error occurred");
      } else {
        if (result.affectedRows > 0) {
          res.redirect("/");
        }
      }
    }
  );
});

router.get("/delete/:Empno", (req, res) => {
  myConnection.query(
    "delete from emp where Empno=?",
    [req.params.Empno],
    (err, result) => {
      if (err) {
        res.status(500).send("error occurred");
      } else {
        if (result.affectedRows > 0) {
          res.redirect("/");
        }
      }
    }
  );
});

router.get("/edit/:Empno", (req, res) => {
  res.render("edit",{empno: req.params.Empno});
  res.redirect("/")
});

router.post("/edit/:Empno", (req, res) => {
  myConnection.query(
    "update emp set Empno=?, Ename=?, Job=?, Mgr=?, Hiredate=?, Sal=?, Comm=?, Deptno=? where Empno=?",
    [
      parseInt(req.body.empno),
      req.body.ename,
      req.body.job,
      parseInt(req.body.mgr),
      req.body.hiredate,
      parseInt(req.body.sal),
      parseInt(req.body.comm),
      parseInt(req.body.deptno),
      req.params.Empno,
    ],
    (err, result) => {
      if (err) {
        res.status(500).send("error occurred");
      } else {
        if (result.affectedRows > 0) {
          res.redirect("/");
        }
      }
    }
  );
});

module.exports = router;
