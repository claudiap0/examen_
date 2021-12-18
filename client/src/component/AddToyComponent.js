import React from "react";

class AddToyComponent extends React.Component {

    constructor(props) {
        super(props);

        this.handleSubmit = this.handleSubmit.bind(this);
        this.state = {
            status: ""
        };
    }

    handleSubmit(event) {
        event.preventDefault();

        var formData = new FormData(event.target);

        var data = {
            "toyID":formData.get("toyID"),
            "description":formData.get("description"),
            "price":formData.get("price"),
            "typeID":formData.get("typeID"),
            "categoryID":formData.get("categoryID")
        };

        for(var pair of formData.entries()) {
            data[pair[0]] = pair[1];
        }
        var self = this;
        
        fetch("http://localhost:8080/toy/add",
        {
            method:"POST",
            body: JSON.stringify(data),
            headers: {
                "Content-Type":"application/json"
            }
        })
        .then(function(response) {
            return response.text();
        })
        .then(function(response) {
            self.setState({
                status: response
            })
        });
        console.log(data);
    }
    render() {
        return (
            <div>
                <h1>Add toy</h1>
                {
                    this.state.status &&
                    <div id="status">{this.state.status}</div>

                }
                <form action="" onSubmit={this.handleSubmit}>
                    <div>
                        <label>Toy ID </label>
                        <input type="text" name="toyID"/>
                    </div>
                    <div>
                        <label>Description </label>
                        <input type="text" name="description"/>
                    </div>
                    <div>
                        <label>Price </label>
                        <input type="text" name="price"/>
                    </div>
                    <div>
                        <label>Type ID </label>
                        <input type="text" name="typeID"/>
                    </div>
                    <div>
                        <label>Category ID </label>
                        <input type="text" name="categoryID"/>
                    </div>
                    <button type="submit" className="js_submit_btn">SAVE</button>
                </form>
            </div>
        )
    }
}

export default AddToyComponent;