import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  userName =  undefined;
  constructor(private _activateRoute : ActivatedRoute) { }

  ngOnInit(): void {
    this._activateRoute.params.subscribe((p:Params) =>{
        this.userName = p['un'];
    });
  }

}
