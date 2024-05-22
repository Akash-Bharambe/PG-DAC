/* eslint-disable react/prop-types */
import "./List.css"
import PropTypes from 'prop-types'
import Form from "./Form"

export default function List(props) {

    function changeSearch(event) {
        console.log("list search");
        props.changeSearch(event.target.value)
    }

    function addFruit(fruit) {
        props.addFruit(fruit)
    }
    function deleteFruit(fruit) {
      props.deleteFruit(fruit)
    }
    function updateFruit(update,updateTo) {
      props.updateFruit(update,updateTo)
    }

  return (
    <>
    <img id="fruit-img" src="https://freepngimg.com/thumb/fruit/9-2-fruit-free-download-png.png" alt="Fruit Free Download Png"/>
    <div id="list-container">
     <h1 id="fruits-list" >Fruits List</h1>
     <input type="text" name="search-box" id="search-box" onChange={changeSearch} placeholder="Enter Fruit to Search" />
     <ol id="f-list" >
        {props.fruits.map((fruit,index)=><li key={index} >{fruit}</li>)}
     </ol>
    </div>
    <Form id="form" addFruit={addFruit} deleteFruit={deleteFruit} updateFruit={updateFruit} ></Form>
    </>
  )
}

List.prototype ={
    fruits : PropTypes.arrayOf(PropTypes.string)
}