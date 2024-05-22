/* eslint-disable react/prop-types */
import "./Form.css"


export default function Form(props) {

    function addFruit(event) {
        props.addFruit(event.target.value)
    }

  return (
    <div id="form">
        <h1 id="operations">List Operations</h1>
      <input type="text" name="add" id="add" onChange={addFruit} />
      <button type="button" onClick={addFruit} >Add Fruit</button>
      <button type="button">Delete Fruit</button>
    </div>
  )
}
