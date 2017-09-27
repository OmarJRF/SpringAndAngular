import {Component, OnInit} from '@angular/core';
import {Person} from '../person/person';
import {Employee} from './employee';
import {EmployeeService} from '../services/employee.service';
import {Management} from '../management/management';
import {ManagementService} from '../services/management.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers: [EmployeeService, ManagementService]
})

export class EmployeeComponent implements OnInit {

  public _employee: Employee;
  public person: Person;
  public idPerson: number;
  public namePerson: number;
  public isLocationData: boolean;
  public listDirection: Management[];
  public listManagement: Management[];
  public listDepartment: Management[];

  constructor(public _employeeService: EmployeeService, public _managementService: ManagementService) {
    this._employee = new Employee(0, 0, 0, 0, 0, 0, new Date(), 0, true);
  }

  ngOnInit() {
    this.getListDirection();

  }

  findEmployee() {
    let id = this.idPerson;
    console.log('EmployeeComponent-findEmployee-id:' + id);
    if (id > 0) {
      this._employeeService.getEmployeeByIdPerson(id).subscribe(
        result => {
          this._employee = result;

        },
        error => {
          console.log(<any>error);
        }
      );
    }
  }

  saveEmployee() {
    console.log('EmployeeComponent-saveEmployee')
    this._employee.idCompany = 1;
    this._employee.idPerson = this.idPerson;
    this._employeeService.saveEmployee(this._employee).subscribe(
      response => {
        if (response.toString() == "200") {

        } else {
          console.log('Error: ' + response);
        }
      },
      error => {
        console.log('error:' + <any>error);
      }
    );
  }

  getListDirection() {
    console.log('EmployeeComponent-getListDepartment')
    this._managementService.getListDirection().subscribe(
      result => {
        this.listDirection = result;
        this.getListManagement();
        
      },
      error => {
        console.log(<any>error);
      }
    );
  }

  getListManagement() {
    console.log('EmployeeComponent-getListDepartment')
    let idDirection = this._employee.idDirection;
    if (idDirection > 0) {
      this._managementService.findManagementDepartment(idDirection).subscribe(
        result => {
          this.listManagement = result;
          this.getListDepartment();
        },
        error => {
          console.log(<any>error);
        }
      );
    } else {
      this.listManagement = null;
    }
  }

  getListDepartment() {
    console.log('EmployeeComponent-getListDepartment')
    let idDepartment = this._employee.idManagement;
    if (idDepartment > 0) {
      this._managementService.findManagementDepartment(idDepartment).subscribe(
        result => {
          this.listDepartment = result;
        },
        error => {
          console.log(<any>error);
        }
      );
    } else {
      this.listDepartment = null;
    }
  }

}
