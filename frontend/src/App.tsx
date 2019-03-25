import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {

  state = {
    message: null,
  };

  componentDidMount(): void {
    fetch('/api/hello')
        .then(response => response.json())
        .then(response => { this.setState({ message: response.message })});
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Message from backend: {this.state.message}
          </p>
        </header>
      </div>
    );
  }
}

export default App;
