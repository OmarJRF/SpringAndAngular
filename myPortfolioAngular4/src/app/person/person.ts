export class Person {

  constructor(public nationality: number,
    public ci: number,
    public firstName: string,
    public lastName: string,
    public birthDate=new Date(),
    public civilStatus: number,
    public telephone: string,
    public email: string,
    public country: number,
    public state: number,
    public municipality: number,
    public address: string) {
  }

}
