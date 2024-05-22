/* eslint-disable react-hooks/exhaustive-deps */
import Footer from "./Footer";
import Header from "./Header";
import List from "./List";
import { useEffect, useState } from "react";

function App() {
  const [fruits, setFruits] = useState([
    "🍎Apple",
    "🍌Banana",
    "🍒Cherry",
    "🍓Strawberry",
    "🍋Lemon",
    "🍊Orange",
    "🍑Peach",
    "🍐Pear",
    "🍍Pineapple",
    "🍉Watermelon",
    "🍇Grapes",
    "🥭Mango",
    "🥥Coconut",
    "🥝Kiwi",
    "🍅Tomato",
    "🥑Avocado",
    "🍆Eggplant",
    "🥕Carrot",
    "🥦Broccoli",
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

  function addFruits(fruit) {
    setFruits([...fruits, fruit]);
  }

  function changeSearch(fruit) {
    console.log("app search");
    setSearch(fruit);
  }

  return (
    <>
      <Header></Header>
      <List
        fruits={searchFruits}
        addFruits={addFruits}
        changeSearch={changeSearch}
      ></List>
      <Footer></Footer>
    </>
  );
}

export default App;
