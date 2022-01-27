import React,{Component} from "react";

 export function ButtonInput1(){
    let handleOnClick = event=>{
        console.log(event);
        console.log('Button is clicked !!!');
    }

    let handleOnChange = event => {
        console.log(event);
        console.log('Onchange Evenet Occured !!!');
    }
    return (<div>
        <input type="text" onChange={handleOnChange}></input>
        <button onClick={handleOnClick}>Click Me</button>
    </div>);
}

