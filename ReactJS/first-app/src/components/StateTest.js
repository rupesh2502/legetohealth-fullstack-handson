import React, { Component } from "react";

export class Counter extends Component{
    constructor(props){
         super(props);
         this.state = {likes: 0 , disLikes : 0};
    }
    handleLikes = event =>{
        this.setState(preState => ({likes:preState.likes+1}));
    }

    handleDislikes = event =>{
        this.setState(preState => ({disLikes:preState.disLikes+1}));
    }
    render(){
        return (<div>
            <h2>Counter Component</h2>
            <p>Like(s) : {this.state.likes}</p>
            <p>DisLike(s): {this.state.disLikes}</p>
            <button onClick={this.handleLikes}>Like(s)</button>
            <button onClick={this.handleDislikes}>DisLike(s)</button>
        </div>);
    }
}