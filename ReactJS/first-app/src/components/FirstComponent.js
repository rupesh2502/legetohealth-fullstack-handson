import React,{Component} from "react";

class Greeting extends Component{
    render(){
        return (<div>
            <h2>This is First Component</h2>
        </div>);
    }
}

export function FunctionGreeting(){
    return (<div>
        <h2>This is Second Component </h2>
    </div>);
}

export default Greeting;