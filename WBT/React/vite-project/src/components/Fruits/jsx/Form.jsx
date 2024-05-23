/* eslint-disable react/prop-types */
import { useEffect, useState } from "react";
import "../css/Form.css";

export default function Form(props) {
  const [fruit, setName] = useState("");
  const [update, setUpdate] = useState("");
  const [updateTo, setUpdateTo] = useState("");

  useEffect(() => {
    let btn = document.getElementsByClassName("btn");
    for (let b of btn) {
      b.addEventListener("click", handleClear);
    }

    function handleClear() {
      document.getElementById("add").value = "";
    }
  }, [fruit]);

  useEffect(() => {
    document.getElementById("up").addEventListener("click", () => {
      let update = document.getElementsByName("update");

      for (let u of update) {
        u.value = "";
      }
    });
  });

  function addFruit() {
    if (fruit !== "") props.addFruit(fruit);
    setName("");
  }

  function deleteFruit() {
    props.deleteFruit(fruit);
    setName("");
  }

  function updateFruit() {
    props.updateFruit(update, updateTo);
  }

  return (
    <>
      <div id="form">
        <h1 className="headings">List Operations</h1>
        <input
          type="text"
          name="add"
          id="add"
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter Fruit"
        />
        <br />
        <button type="button" className="btn" onClick={deleteFruit}>
          Delete
        </button>
        <button type="button" className="btn" onClick={addFruit}>
          Add
        </button>
        <h1 className="headings">Update</h1>
        <input
          type="text"
          name="update"
          id="update"
          onChange={(e) => setUpdate(e.target.value)}
          placeholder="Enter Fruit"
        />
        <br />
        <input
          type="text"
          name="update"
          id="update-to"
          onChange={(e) => setUpdateTo(e.target.value)}
          placeholder="Updated Fruit"
        />
        <br />
        <button type="button" className="btn" id="up" onClick={updateFruit}>
          Update
        </button>
      </div>
      
    </>
  );
}
