/* eslint-disable react-hooks/exhaustive-deps */
import List from "./jsx/List";
import { useEffect, useState } from "react";

function App() {
  const [fruits, setFruits] = useState([
    "Apple",
    "Banana",
    "Cherry",
    "Strawberry",
    "Lemon",
    "Orange",
    "Peach",
    "Pear",
    "Pineapple",
    "Watermelon",
    "Grapes",
    "Mango",
    "Coconut",
    "Kiwi",
    "Tomato",
    "Avocado",
    "Eggplant",
    "Carrot",
    "Broccoli",
    "DragonFruit"
  ]);
  const [searchFruits, setSearchFruits] = useState([fruits]);
  const [search, setSearch] = useState("");

  useEffect(() => {
    if (search === "") {
      setSearchFruits(fruits);
    } else {
      setSearchFruits(
        fruits.filter((fruit) =>
          fruit.toLocaleLowerCase().includes(search.toLocaleLowerCase())
        )
      );
    }
  }, [search]);

  function addFruit(fruit) {
    setFruits([...fruits, fruit]);
    setSearchFruits([...fruits, fruit]);
  }

  function deleteFruit(fruit) {
    let newarr = fruits.filter(
      (f) => f.toLocaleLowerCase() !== fruit.toLocaleLowerCase()
    );
    setFruits(newarr);
    setSearchFruits(newarr);
  }

  function updateFruit(update, updateTo) {
    let newarr = [...fruits];
    newarr.splice(newarr.indexOf(update), 1, updateTo);
    setFruits(newarr);
    setSearchFruits(newarr);
  }

  function changeSearch(fruit) {
    console.log("app search");
    setSearch(fruit);
  }

  return (
    <List
      fruits={searchFruits}
      addFruit={addFruit}
      deleteFruit={deleteFruit}
      changeSearch={changeSearch}
      updateFruit={updateFruit}
    ></List>
  );
}

export default App;
