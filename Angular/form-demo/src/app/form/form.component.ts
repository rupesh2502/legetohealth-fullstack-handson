import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, Validators} from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(private _builder : FormBuilder , private _service : EmployeeService) { }
  
  storeForm = this._builder.group({
    "_id" : new FormControl("", Validators.required),
    "name" : new FormControl("", Validators.required),
    "salary" : new FormControl("", Validators.required),
  });


  

  ngOnInit(): void {
  }
  handleSubmit(employeeData : any){
    console.log(employeeData);
    this._service.saveData(employeeData).subscribe(response => {
      console.log(response);
      this.storeForm.reset();
    },err=>{
      console.log(err);
      this.storeForm.reset();
    });
  }

}
