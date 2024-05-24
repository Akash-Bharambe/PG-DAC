import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

const baseURL = "http://localhost:8080";

function App() {
  const [arr, setarr] = useState([]);

  useEffect(() => {
    (async function () {
      let arrdata = await axios.get(baseURL);
      setarr(arrdata.data)
    })();
  }, []);

  useEffect(()=>{
    console.log(arr);
  },[arr])

  return (
    <>
      <table>
        <tbody>
          {arr.map((e) => {
            <tr>
              <td>{e.id}</td>
              <td>{e.name}</td>
              <td>{e.author}</td>
              <td>{e.price}</td>
            </tr>
          })}
        </tbody>
      </table>
    </>
  );
}

export default App;
