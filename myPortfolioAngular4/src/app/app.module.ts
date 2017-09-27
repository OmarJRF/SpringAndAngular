import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';


import {AppComponent} from './app.component';
import {routing, appRoutingProviders} from './app.routing';
import {FrutasComponent} from './frutas/frutas.component';
import {PersonComponent} from './person/person.component';
import {HttpModule, Http} from '@angular/http';
import {HomeComponent} from './home/home.component';
import {ErrorComponent} from './error/error.component';
import {MenuComponent} from './menu/menu.component';
import {EmployeeComponent} from './employee/employee.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {CountryComponent} from './country/country.component';
import { NationalityComponent } from './nationality/nationality.component';
import { UtilityComponent } from './utility/utility.component';
import { ManagementComponent } from './management/management.component';



@NgModule({
  declarations: [
    AppComponent,
    FrutasComponent,
    PersonComponent,
    HomeComponent,
    ErrorComponent,
    MenuComponent,
    EmployeeComponent,
    CountryComponent,
    NationalityComponent,
    UtilityComponent,
    ManagementComponent
  ],
  imports: [BrowserAnimationsModule,
    BrowserModule, HttpModule, routing, FormsModule, ReactiveFormsModule, NgbModule.forRoot()
  ],
  providers: [appRoutingProviders],
  bootstrap: [AppComponent]
})

export class AppModule {}
