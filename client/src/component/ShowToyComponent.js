import React from "react";
import UserService from "../services/UserService";

class ShowSeriesComponent extends React.Component {

   constructor(props) {
       super(props)
       this.state = {
           users: []
       }
   }
   
   componentDidMount() {
       UserService.getUsers().then((response) => {
          this.setState({users: response.data}) 
       });
   }
   
    render() {
        return (
            <div>
                <h1></h1>
                <h1 className="text-center">All toys</h1>
                {
                    this.state.status &&
                    <div id="status">{this.state.status}</div>

                }
                <table className="table">
                        <tr>
                            <td>toyID</td>
                            <td>description</td>
                            <td>price</td>                        
                        </tr>
                        {
                            this.state.users.map(
                                user =>
                                <tr key = {user.id}>
                                    <td>{user.toyID}</td>
                                    <td>{user.description}</td>
                                    <td>{user.price}</td>
                                </tr>
                            )
                        }
                </table>
            </div>
        )
    }
}

export default ShowSeriesComponent;