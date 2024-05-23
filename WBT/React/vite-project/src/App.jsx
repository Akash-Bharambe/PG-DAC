import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./components/Navbar.jsx";
import CounterComponent from "./components/Counter.jsx";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import Home from "./components/Home.jsx";
import Entry from "./components/Fruits/Entry.jsx"
import Form from "./components/Fruits/jsx/Form.jsx";

const router = createBrowserRouter([
  {
    path: "/",
    element: (
      <>
        <Navbar />
        <Home />
      </>
    ),
  },
  {
    path: "/counter",
    element: (
      <>
        <Navbar />
        <CounterComponent />
      </>
    ),
  },
  {
    path: "/fruits",
    element: (
      <>
        <Navbar />
        <Entry />
      </>
    ),
  },
  {
    path: "/data",
    element: (
      <>
        <Navbar />
        <Form />
      </>
    ),
  },
]);

function App() {
  return (
    <div>
      <RouterProvider router={router}></RouterProvider>
    </div>
  );
}

export default App;
