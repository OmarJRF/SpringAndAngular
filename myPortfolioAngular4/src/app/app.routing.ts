
import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';


import {HomeComponent} from './home/home.component';
import {FrutasComponent} from './frutas/frutas.component';
import {PersonComponent} from './person/person.component';
import {EmployeeComponent} from './employee/employee.component';
import {ErrorComponent} from './error/error.component';

const appRouters: Routes = [
  {path: '', component: HomeComponent},
  {path: 'frutas',  component: FrutasComponent} ,
  {path: 'person', component: PersonComponent},
  {path: 'employee', component: EmployeeComponent},
  {path: '**', component: ErrorComponent}
];

export const appRoutingProviders: any[] = [];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRouters);
