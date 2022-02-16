import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  
  userName = undefined;
  constructor(private _activatedRoute : ActivatedRoute) { }

  ngOnInit(): void {
    this._activatedRoute.parent?.params.subscribe((p)=> this.userName = p['un']);
  }

}
