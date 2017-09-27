import {routing, appRoutingProviders} from './app.routing';
import {Component, trigger, state, style, transition, animate} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  animations: [
    trigger('slideInOut', [
      state('in', style({
        transform: 'translate3d(0, 0, 0)'
      })),
      state('out', style({
        transform: 'translate3d(110%, 0, 0)'
      })),
      transition('in => out', animate('400ms ease-in-out')),
      transition('out => in', animate('400ms ease-in-out'))
    ]),
  ]
})

export class AppComponent {
  title = 'Welcome to My Portfolio';
  
  toggleMenu() {
    // 1-line if statement that toggles the value:
    // this.menuState = this.menuState === true ? true : false;
  }

}
