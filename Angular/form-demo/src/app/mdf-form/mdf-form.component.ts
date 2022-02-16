import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mdf-form',
  templateUrl: './mdf-form.component.html',
  styleUrls: ['./mdf-form.component.css']
})
export class MdfFormComponent  {

  constructor(private _router : Router , private _builder : FormBuilder) { }

  profile = this._builder.group({
    firstName : ['',Validators.compose([Validators.required,Validators.minLength(3)])],
    lastName : ['',Validators.compose([Validators.required,Validators.minLength(3)])]
  });


  handleSubmit() : void {
    let firstName = this.profile.controls['firstName'].value;
    if( firstName == 'Alex'){
      sessionStorage.setItem('user',firstName);
      this._router.navigate(['success',firstName]);
    }else{
      this._router.navigate(['mdf']);
      this.profile.reset();
    }
  }

}
