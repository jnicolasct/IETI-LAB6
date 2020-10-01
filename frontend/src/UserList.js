import React from 'react';
import {User} from './User';

export class UserList extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        const todoList = this.props.usersList.map((todo, i) => {
            return (
                <User key={i} RName={todo.nombre} REmail={todo.correo} area={todo.area}/>
            );
        });

        return (
            <div>
                {todoList}
            </div>
        );


    }

}