import React , { Component } from 'react';

class EmployeeTestNoneDB extends Component{
     constructor(props){
         super(props);
         this.state = {Id : '' , Name : '' , Salary : ''}
     }



     render(){
         let handleOnChange = event =>{
             this.setState({[event.target.name]: event.target.value});
         }
        //  return (
        //     <form>
        //         <div className='col-7'>
        //             <p>!! Employee Store Form !!</p>
        //         <div className='form-group'>
        //             <label>Id</label>
        //             <input type="number" name='Id' autoComplete='off' className='form-control' id='Id' onChange={handleOnChange}/>
        //         </div>
        //         <div className='form-group'>
        //             <label>Name</label>
        //             <input type="text" name='Name' autoComplete='off' className='form-control' id='Name' onChange={handleOnChange}/>
        //         </div>
        //         <div className='form-group'>
        //             <label>Salary</label>
        //             <input type="number" name='Salary' autoComplete='off' className='form-control' id='Salary' onChange={handleOnChange}/>
        //         </div>
        //         </div>
        //         <p>Id : {this.state.Id} Name : {this.state.Name} Salary : {this.state.Salary}</p>
        //     </form>
        //  );

        return (
            <form>
                <div className='col-7'>
                    <p>!! Employee Store Form !!</p>
                <div className='form-group'>
                    <label>Id</label>
                    <input type="number" name='Id' autoComplete='off' className='form-control' id='Id' onChange={event=>this.setState({Id : event.target.value})}/>
                </div>
                <div className='form-group'>
                    <label>Name</label>
                    <input type="text" name='Name' autoComplete='off' className='form-control' id='Name' onChange={event=>this.setState({Name : event.target.value})}/>
                </div>
                <div className='form-group'>
                    <label>Salary</label>
                    <input type="number" name='Salary' autoComplete='off' className='form-control' id='Salary' onChange={event=>this.setState({Salary : event.target.value})}/>
                </div>
                </div>
                <p>Id : {this.state.Id} Name : {this.state.Name} Salary : {this.state.Salary}</p>
            </form>
         );
     }
}


export default EmployeeTestNoneDB;