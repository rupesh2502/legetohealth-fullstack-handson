import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  baseUrl = "http://localhost:9090";
  constructor(private _httpClient : HttpClient) {}

  store() : void {
    console.log('Store Inside Service');
  }
  //Fatching  Employee by Id from DB
  fetchEmployeeById(empId : number) : Observable<any>{
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._httpClient.get(url);
  }
  //Fatching All Employee from DB
  fetchEmployees() : Observable<any>{
    let url = `${this.baseUrl}/employee`;
    return this._httpClient.get(url);
  }

  //Storing Data in DB 
  saveData(employeeData : any) : Observable<any>{
    let url = `${this.baseUrl}/employees`;
    return this._httpClient.post(url,employeeData);
  }
}
