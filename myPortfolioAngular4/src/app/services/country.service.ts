import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';


@Injectable()
export class CountryService {

  public url: string;
  public headers: Headers;
  public options: RequestOptions;

  constructor(private _http: Http) {}


  getListCountry() {

    console.log('CountryService - getListCountry');
    this.url = 'http://localhost:8080/myportfoliospring/findCountry';
    return this._http.get(this.url).map(res => res.json());

  }

  getListStateMunicipality(id:number) {

    console.log('CountryService - getListCountry - id:' + id);
    this.url = 'http://localhost:8080/myportfoliospring/findStateMunicipality/' + id;
    return this._http.get(this.url).map(res => res.json());

  }
}
