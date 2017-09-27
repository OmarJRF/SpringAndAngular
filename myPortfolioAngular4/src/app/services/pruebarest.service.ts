import {Person} from '../person/person';
import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';


@Injectable()
export class PruebarestService {

  public url: string;
  public url2: string;
  public headers: Headers;
  public options: RequestOptions;
  



  constructor(private _http: Http) {

  }

  getPrueba() {
    console.log('getPrueba()');

    this.url = 'http://localhost:8080/myportfoliospring/person/findByCi/1';
    return this._http.get(this.url).map(res => res.json());

  }

  addPerson(person: Person) {

    console.log('PruebarestService-addPerson')

    let json = JSON.stringify(person);
    let params = json;
    let headers = new Headers({'Content-Type': 'application/json'});
    // let headers = new Headers({'Content-Type': 'application/x-www-form-urlencoded'});

    this.url2 = 'http://localhost:8080/myportfoliospring/person/save';

    return this._http.post(this.url2, params, {headers: headers})
      .map(res => res.status);

  }

}
