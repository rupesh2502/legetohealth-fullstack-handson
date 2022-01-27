import React,{Component} from "react";


class FormComponent extends Component{
    constructor(props){
        super(props);
        this.state = {name: '' , gender : '', phone : 0};
    }



    render(){
        let handleChange = event =>{
           this.setState({[event.target.name] : event.target.value});
        }
        return(<div><form>
            <label>Name<input type="text" name="name" onChange={handleChange} autoComplete="off"/></label><br/>
            <label>Gender<input type="radio" value="Male" name="gender" onChange={handleChange}/> M
                   <input type="radio" value="Female" name="gender" onChange={handleChange}/> F</label> <br/>
            <label>Phone<input type="number" name="phone" onChange={handleChange} autoComplete="off"/></label>
        </form>
        <p>Name : {this.state.name} Gender : {this.state.gender} Phone : {this.state.phone}</p>
        </div>
         );
    }
}

export default FormComponent;