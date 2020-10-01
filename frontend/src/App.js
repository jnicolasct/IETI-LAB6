import React, {Component} from 'react';
import './App.css';
import {UserList} from './UserList';

class App extends Component {

  constructor(props) {
      super(props);
      this.state = {
          usersList: [],
      };
  }

  componentDidMount() {
      fetch('http://ieti-backend-lab6.southcentralus.azurecontainer.io:8080/Users')
          .then(response => response.json())
          .then(data => {
              let userList = [];
              data.forEach(function (user) {
                userList.push({
                     "nombre":user.nombre, "correo": user.correo, "area":user.area
                  })

              });
              this.setState({usersList: userList});
          });
  }

  render() {
      return (
          <div>
              <UserList usersList={this.state.usersList}/>
          </div>
      );
  }
}

export default App;