import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {
   firstName = 'Alex';
   users = ['Rupesh','Sachin','Amit','Ashish','Rupesh'];

   clicks : any = 0;
   numberOfClicks(value : any){
        console.log(value);
        this.clicks = this.clicks+value;
   }
}
