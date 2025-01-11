import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faVideoSlash } from '@fortawesome/free-solid-svg-icons';
import { Navbar, Nav, Button, Container } from 'react-bootstrap';
import { NavLink } from 'react-router-dom';
import './Header.css'; // Import the CSS file for styling

const Header = () => {
  return (
    <Navbar expand="lg" className="navbar-custom">
      <Container fluid>
        <Navbar.Brand href="/" className="navbar-brand-custom">
          <FontAwesomeIcon icon={faVideoSlash} className="me-2" />
          NETFLIX
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarScroll" />
        <Navbar.Collapse id="navbarScroll">
          <Nav className="me-auto my-2 my-lg-0" navbarScroll>
            <NavLink className="nav-link-custom" to="/">Home</NavLink>
            <NavLink className="nav-link-custom" to="/watchList">Watch List</NavLink>
          </Nav>
          <Button variant="outline-light" className="me-2">Login</Button>
          <Button variant="outline-light">Register</Button>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
};

export default Header;
