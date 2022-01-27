import React,{Component} from "react";

// export function User(props){
//     let profile = props.profile;
//    return (<div>
//        <h3>name : {profile.name} salary: {profile.salary} age: {profile.age}</h3>
//    </div>);
// }

// export function Welcome(props){
//     return (<div>
//           <h3>{props.message}</h3>
//         </div>);
// }


export class Hello extends Component{
    constructor(props){
        super(props);
    }

    render(){
        return(<div>
            <p>Hello {this.props.name}</p>
        </div>);
    }
}

class Greeting1 extends Component{
    constructor(props){
        super(props);
    }
    render(){
        return(<div>
            <p>Greetings {this.props.firstName} {this.props.lastName}</p>
        </div>);
    }
}


export default Greeting1;
