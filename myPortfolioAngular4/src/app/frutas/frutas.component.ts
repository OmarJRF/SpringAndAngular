import {Component, OnInit} from '@angular/core';
import {PruebarestService} from '../services/pruebarest.service';
import {EmployeeComponent} from '../employee/employee.component';

@Component({
  selector: 'app-frutas',
  templateUrl: './frutas.component.html',
  styleUrls: ['./frutas.component.css'],
  providers: [PruebarestService]
})

export class FrutasComponent implements OnInit {

  public nombre_component: string;
  public listado_frutas: Array<string>;
  public idPerson: number;



  constructor(public _pruebaService: PruebarestService, public _employeeComponent: EmployeeComponent) {

    this.nombre_component = 'Componente de Frutas';
    this.listado_frutas = ['Naranja', 'Manzana', 'Pera', 'Otras'];



  }

  ngOnInit() {
    console.log("FrutasComponent-ngOnInit");



  }

  getIdPersonAct() {

    console.log("FrutasComponent-getIdPerson");
    this.idPerson = this._employeeComponent.idPerson;
    this.nombre_component = 'XXXXX';

  }
}
