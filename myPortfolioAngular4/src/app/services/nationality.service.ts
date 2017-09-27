import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';


@Injectable()
export class NationalityService {

  public url: string;
  public headers: Headers;
  public options: RequestOptions;

  constructor(private _http: Http) {}

   getListNationality() {

    console.log('NationalityService - getListNationality');
    this.url = 'http://localhost:8080/myportfoliospring/getListNationality';
    return this._http.get(this.url).map(res => res.json());

  }
  

}
