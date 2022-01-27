import React , { Component } from "react";
import axios from "axios";


class EmployeeItems extends Component{
    constructor(props){
        super(props);
        this.state = {employees : []};
    }


    render(){
        let handleClick = event =>{
            // this.setState({
            //     employees : [{Id : 1 , Name : 'Rupesh'},{Id : 2 , Name : "Ashish"}]
            // });
            //Fatching data from DB 
            let url = "http://localhost:9090/employee";
            axios.get(url).then(response=>this.setState({employees:response.data}).catch(err=>console.log(err)));

        }
        return(<div>
            <h2>Employee List</h2>
            <button onClick={handleClick} className='btn btn-primary'>Refresh</button>
            <table className="table table-striped">
                <thead>
                    <tr>
                    <th>#SNo</th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                    </tr>
                </thead>
                <tbody>
                    {this.state.employees.map((item,index)=> <tr key={item._id}>
                        <td>{index+1}</td><td>{item._id}</td><td>{item.name}</td><td>{item.salary}</td>
                    </tr>)}
                </tbody>
            </table>
        </div>);
    }
}

export default EmployeeItems;