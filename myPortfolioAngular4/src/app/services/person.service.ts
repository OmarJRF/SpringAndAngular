import {Person} from '../person/person';
import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';


@Injectable()
export class PersonService {

  public url: string;
  public url2: string;
  public headers: Headers;
  public options: RequestOptions;

  constructor(private _http: Http) {}


  getPerson(id: number) {

    console.log('PersonService - getPerson()');

    this.url = 'http://localhost:8080/myportfoliospring/person/findByCi/'+id;
    return this._http.get(this.url).map(res => res.json());

  }

  findByFirstNameStartsWith(namePerson: string) {
    let name = namePerson;
    if (name != null) {
      console.log('PersonService - findByFirstNameStartsWith()');
      this.url = 'http://localhost:8080/myportfoliospring/person/findByFirstNameStartsWith/' + name;
      return this._http.get(this.url).map(res => res.json());
    }
  }

  savePerson(person: Person) {

    console.log('PersonService-addPerson:' + person.birthDate);

    let json = JSON.stringify(person);
    let params = json;
    let headers = new Headers({'Content-Type': 'application/json'});

    this.url2 = 'http://localhost:8080/myportfoliospring/person/save';

    return this._http.post(this.url2, params, {headers: headers})
      .map(res => res.status);

  }

}
