import axios from 'axios';
import React , { Component } from 'react';

class EmployeeStore extends Component{
     constructor(props){
         super(props);
         this.state = {_id : '' , name : '' , salary : ''}
     }



     render(){
         let handleOnChange = event =>{
             this.setState({[event.target.name]: event.target.value});
         }
         let handleSubmit = event =>{
            event.preventDefault();
            let url = "http://localhost:9090/employees";
            var data = {'_id' : this.state._id , 'name' : this.state.name , 'salary' : this.state.salary}
            axios.post(url, JSON.stringify(this.state)).then(response => console.log(response)).catch(err=>console.log(err));
         }
         return (
            <form onSubmit={handleSubmit}>
                    <h3>!!! Employee Store Form !!!</h3>
               
                    <label>  Id</label>
                    <input type="number" name='_id' autoComplete='off'  onChange={handleOnChange}/><br/>
                
                    <label>Name</label>
                    <input type="text" name='name' autoComplete='off'  onChange={handleOnChange}/><br/>
            
                    <label>Salary</label>
                    <input type="number" name='salary' autoComplete='off' onChange={handleOnChange}/><br/>
              
                    <button type="submit" className="btn btn-primary">Submit</button>
              
            </form>
         );  
     }
}


export default EmployeeStore;