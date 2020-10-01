import React from 'react';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';

export class User extends React.Component { 

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <Card variant="outlined">
                    <CardContent>
                        <Typography variant="h5" component="h2">
                            Nombre: {this.props.RName}
                        </Typography>
                        <Typography variant="h5" component="h2">
                            Correo: {this.props.REmail} 
                        </Typography>
                        <Typography variant="h5" component="h2">
                            Area: {this.props.area}
                        </Typography>
                    </CardContent>
                </Card>
            </div>
        );
    }

}