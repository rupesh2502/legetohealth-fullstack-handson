import { Component, NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { MdfFormComponent } from './mdf-form/mdf-form.component';
import { HttpClientModule }  from '@angular/common/http';
import { FetchEmployeeComponent } from './fetch-employee/fetch-employee.component';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';

import { Routes , RouterModule}   from '@angular/router';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileComponent } from './profile/profile.component';
import { EmpGuard } from './emp.guard';
import { FormComponent } from './form/form.component';

let routeConfig : Routes =[
  {path : '' , component : FetchEmployeeComponent},
  {path : 'loadAll', component : FetchEmployeesComponent},
  {path : 'loadbyId' , component : FetchEmployeeComponent},
  {path : 'tdf' , component : TdfDemoComponent},
  {path : 'mdf' , component : MdfFormComponent},
  {path : 'storeForm' , component : FormComponent},
  {path : 'success/:un' , component : SuccessComponent , canActivate: [EmpGuard],
  children : [{path : 'dashboard' , component : DashboardComponent},
  {path : 'settings' , component : SettingsComponent},
  {path : 'profile' , component : ProfileComponent},]}
];

@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfFormComponent,
    FetchEmployeeComponent,
    FetchEmployeesComponent,
    SuccessComponent,
    DashboardComponent,
    SettingsComponent,
    ProfileComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
