import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first-app';
  users = [{name : 'Amit',gender : 'Male'},
  {name : 'Amirita',gender : 'FeMale'},
  {name : 'Ashish',gender : 'Male'},
  {name : 'Akshita',gender : 'FeMale'},
  {name : 'Ajit',gender : 'Male'}];
}
