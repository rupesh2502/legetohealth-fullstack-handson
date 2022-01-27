import { Component } from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent  {

    userName = 'Alex';
    toggleButton = false;
    handleClick(v : string) : void {
      this.userName = v;
      this.toggleButton = !this.toggleButton;
    }

}
