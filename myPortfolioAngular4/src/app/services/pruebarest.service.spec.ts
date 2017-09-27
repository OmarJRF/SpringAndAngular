import { TestBed, inject } from '@angular/core/testing';

import { PruebarestService } from './pruebarest.service';

describe('PruebarestService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PruebarestService]
    });
  });

  it('should be created', inject([PruebarestService], (service: PruebarestService) => {
    expect(service).toBeTruthy();
  }));
});
