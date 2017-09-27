import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';


@Injectable()
export class ManagementService {

  public url: string;
  public headers: Headers;
  public options: RequestOptions;

  constructor(private _http: Http) {}

  getListDirection() {

    console.log('ManagementService - getListDirection');
    this.url = 'http://localhost:8080/myportfoliospring/getListDirection';
    return this._http.get(this.url).map(res => res.json());

  }

  findManagementDepartment(id: number) {

    console.log('ManagementService - findManagementDepartment - id:' + id);
    this.url = 'http://localhost:8080/myportfoliospring/findManagementDepartment/' + id;
    return this._http.get(this.url).map(res => res.json());

  }

}
