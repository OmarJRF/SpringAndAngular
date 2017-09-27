import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Employee} from '../employee/employee';


@Injectable()
export class EmployeeService {

  public url: string;
  public url2: string;
  public headers: Headers;
  public options: RequestOptions;

  constructor(private _http: Http) {}

  getEmployeeByIdPerson(idperson: number) {
    let id = idperson;
    if (id > 0) {
      console.log('EmployeeService - getEmployeeByIdPerson()');

      this.url = 'http://localhost:8080/myportfoliospring/employee/findEmployeeByIdperson/' + id;
      return this._http.get(this.url).map(res => res.json());
    }
  }

  saveEmployee(employee: Employee) {

    console.log('EmployeeService - saveEmployee');

    let json = JSON.stringify(employee);
    let params = json;
    let headers = new Headers({'Content-Type': 'application/json'});

    this.url2 = 'http://localhost:8080/myportfoliospring/employee/save';

    return this._http.post(this.url2, params, {headers: headers})
      .map(res => res.status);

  }

}
