import { useState } from "react";

function Form() {
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);
  const [sum, setsum] = useState(0);

  return (
    <div>
      <label htmlFor="num1">Num1</label>
      <input
        type="text"
        name="num1"
        id="num1"
        onChange={(e) => !isNaN(parseInt(e.target.value)) ? setNum1(parseInt(e.target.value)) : setNum1(0)}
      />

      <label htmlFor="num2">Num2</label>
      <input
        type="text"
        name="num2"
        id="num2"
        onChange={(e) => setNum2(parseInt(e.target.value))}
      />

      <button type="button" onClick={()=>setsum(num1 + num2)}>
        Add
      </button>

      <span>Sum: {sum}</span>
    </div>
  );
}

export default Form;
