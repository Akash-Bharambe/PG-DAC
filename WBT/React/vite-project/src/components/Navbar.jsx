
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <>
      <ul className="nav justify-content-center">
        <li className="nav-item">
          <Link className="nav-link" to="/">
            Home
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to="/counter">
            Counter
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to="/fruits">
            Fruits
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to="/data">
            Form
          </Link>
        </li>
      </ul>
    </>
  );
}

export default Navbar;
