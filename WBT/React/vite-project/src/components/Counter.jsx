import { useEffect } from "react";
import { useState } from "react";
import './Meow.css'
function CounterComponent() {
  const [count, setCount] = useState(0);

  const handler = (event) => {
    let isShift = event.shiftKey
    switch (event.key) {
      case "+":
        increment(isShift);
        break;
      case "-":
        decrement(isShift);
        break;
      case "0":
      case "Insert":
        resetCount();
        break;

      default:
        break;
    }
  };

  useEffect(() => {
    document.addEventListener("keydown", handler);
    return () => {
      document.removeEventListener("keydown", handler);
    };
  }, [count]);

  function increment(isShift) {
    isShift ? setCount(count + 10) : setCount(count + 1);
  }
  function resetCount() {
    setCount(0);
  }
  function decrement(isShift) {
    isShift ? setCount(count - 10) : setCount(count - 1);
  }
  return (
    <>
      <h1 id="myH1">{count}</h1>
      <button
        type="button"
        id="increment"
        className="btn"
        name="increment"
        onClick={()=>increment(false)}
      >
        Increment
      </button>
      <button type="button" id="reset" name="reset" onClick={resetCount}>
        Reset
      </button>
      <button
        type="button"
        id="decrement"
        className="btn"
        name="decrement"
        onClick={()=>decrement(false)}
      >
        Decrement
      </button>
    </>
  );
}

export default CounterComponent;
