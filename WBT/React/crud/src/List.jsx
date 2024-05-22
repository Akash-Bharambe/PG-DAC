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

  return (
    <>
    <div id="list-container">
     <h1 id="fruits-list" >Fruits List</h1>
     <input type="text" name="search-box" id="search-box" onChange={changeSearch}  />
     <ol id="f-list" >
        {props.fruits.map((fruit,index)=><li key={index} >{fruit}</li>)}
     </ol>
    </div>
    <Form id="form" addFruit={addFruit} ></Form>
    </>
  )
}

List.prototype ={
    fruits : PropTypes.arrayOf(PropTypes.string)
}