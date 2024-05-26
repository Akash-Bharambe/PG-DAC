import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

const baseURL = "http://localhost:8080";

function App() {
  const [arr, setarr] = useState([]);
  const [name, setName] = useState("");
  const [author, setAuthor] = useState("");
  const [price, setPrice] = useState("");

  useEffect(() => {
    (async function () {
      let arrdata = await axios.get(baseURL);
      setarr(arrdata.data);
    })();
  }, []);

  useEffect(() => {
    console.log(arr);
  }, [arr]);

  async function addData() {
    let newBook = { name, author, price };
    let arrdata = await axios.post(baseURL, newBook);
    setarr(arrdata.data);
  }

  return (
    <>
      <table>
        <thead>
          <tr>
            <td>ID</td>
            <td>Name of Book</td>
            <td>Author</td>
            <td>Price</td>
          </tr>
        </thead>
        <tbody>
          {arr.map((e) => (
            <tr>
              <td>{e.id}</td>
              <td>{e.name}</td>
              <td>{e.author}</td>
              <td>{e.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <hr />

      <label htmlFor="name">Name</label>
      <input
        type="text"
        name="name"
        id="name"
        value={name}
        onChange={(e) => {
          setName(e.target.value);
        }}
      />
      <br />

      <label htmlFor="author">Author</label>
      <input
        type="text"
        name="author"
        id="author"
        value={author}
        onChange={(e) => {
          setAuthor(e.target.value);
        }}
      />
      <br />

      <label htmlFor="price">Price</label>
      <input
        type="text"
        name="price"
        id="price"
        value={price}
        onChange={(e) => {
          setPrice(e.target.value);
        }}
      />
      <br />

      <button type="button" onClick={addData}>
        Add Data
      </button>
    </>
  );
}

export default App;
